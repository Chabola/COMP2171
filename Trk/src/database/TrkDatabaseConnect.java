package database;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;



/**
 * @author Mac
 *
 */
public class TrkDatabaseConnect{
	private final String url="jdbc:mysql://localhost:3306/trkdatabase?serverTimezone=UTC";
	private final String username="root";
	private final String password="";
	private Connection dbconn;
	private Statement stmt;
	
	
	public TrkDatabaseConnect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			dbconn=DriverManager.getConnection(url, username, password);
			stmt= dbconn.createStatement();
			System.out.println("Successful connection to database");
		}
		catch(Exception e){
			System.out.println(e);	
		}
	}
	
	public Statement getStmt() {
		return stmt;
	}
	
	public Connection getDbconn() {
		return dbconn;
	}
	
	////////////////////Schedule
	
	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public String Schedule_Equipment(String eventid, String location, String date, String s_time, String e_time, String resourceid, int quantity){
		try {
			String query="INSERT INTO schedule (EventID,Location,Date,Start_Time,End_Time,EquipmentID,Quantity)"
					+ " VALUES ('"+eventid+"','"+location+"','"+date+"','"+s_time+"','"+e_time+"','"+resourceid+"','"+quantity+"')";
			stmt.executeUpdate(query);
			System.out.println("Equipment Scheduled");
			updateRQty(resourceid,quantity);
			return "yes";
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "no";
		}
		
		
	}
	
	
	/**
	 * Used to change the remaining quantity of an Equipment.
	 * @param resourceid Id which identifies the resource whose quantity will be changed
	 * @param quantity quantity by which the remaining quantity will be altered by.
	 */
	private void updateRQty(String resourceid, int quantity) {
		ResultSet results=null;
		try {
			int current_quantity=0;
			String query="SELECT Remaining_Quantity FROM resource WHERE EquipmentID= '"+resourceid+"'";
			results=stmt.executeQuery(query);
			
			while(results.next()) {
				current_quantity=results.getInt("Remaining_Quantity");
			}
			int value=current_quantity-quantity;
			query="UPDATE resource SET Remaining_Quantity='"+value+"' WHERE EquipmentID ='"+resourceid+"'";
			stmt.executeUpdate(query);
			System.out.println("value updated");
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
		
		
	
	/**
	 * View all event scheduling details that a particular equipment has been scheduled for
	 * @param id Equipment Id.
	 */
	public ArrayList<String[]> View_Schedule(String id ){
		ResultSet results=null;
		ArrayList<String[]> res=new ArrayList<String[]>();
		try {
			String query="SELECT * FROM schedule WHERE EquipmentID= '"+id+"'";
			results=stmt.executeQuery(query);
			while(results.next()) {
				res.add(new String[]{results.getString("EventID"),results.getString("Location"),
						results.getString("Date"),results.getString("Start_Time"),
						results.getString("End_Time"),results.getString("Quantity")});
			}
			return res;
		}
		catch(Exception ex){
			return null;
		}
	}
	
	
	
	
	public  String ModifySchedule(String eventid, String location, String date, String s_time, String e_time, String resourceid, int newquantity) {
		try {
			if ((getE_R_QTY(resourceid)-newquantity)==0) {
				return "no";
			}
			else {
				int currentquantity=getCurrentValue(eventid);
				int updatedvalue=0;
				if (currentquantity!=newquantity) {
					if(currentquantity<newquantity){
						updatedvalue=newquantity;
						updateRQty(resourceid,getE_R_QTY(resourceid)-(newquantity-currentquantity));
					}
					else if(currentquantity>newquantity) {
						updateRQty(resourceid,getE_R_QTY(resourceid)+(currentquantity-newquantity));
						updatedvalue=newquantity;
					}
				}
				else {
					updatedvalue=currentquantity;
				}
				String query="UPDATE Schedule SET Location='"+location+"',Date='"+date+"',Start_Time='"+s_time+"',End_Time='"+e_time+"',"
						+ "Quantity='"+updatedvalue+"' WHERE Eventid= '"+eventid+"' ";
														/*should be where Eventid=eventid*/ 
				
				stmt.executeUpdate(query);
				return "yes";
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "no";
		}

	}
	
	
	
	/**
	 * Returns the quantity of an eqiupment that was scheduled for an event
	 * @return interger
	 */
	private int getCurrentValue(String eventID) {
		ResultSet results=null;
		int scheduledquantity=0;
		try {
			String query="SELECT * FROM schedule WHERE EventID= '"+eventID+"'";
			results=stmt.executeQuery(query);
			while(results.next()) {
				scheduledquantity=results.getInt("Quantity");
			}
			return scheduledquantity;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
	}
	
	private int getE_R_QTY(String equipId) {
		ResultSet results=null;
		int Rquantity=0;
		try {	
			String query="SELECT  FROM resource WHERE EquipmentID= '"+equipId+"'";
			results=stmt.executeQuery(query);
			while(results.next()) {
				Rquantity=results.getInt("Remaining_Quantity");
			}
			return Rquantity;
		}
		catch(Exception ex){
			ex.printStackTrace();
			return 0;
		}
		
	}
	/////////////////////////////////////////////////////resource

	/**
	 * Used to add equipment to database.
	 * @param id ID of equipment.
	 * @param ename Name of Equipment.
	 * @param t_quantity The amount of the equipment being added.
	 */
	public String Add_Equipment(String id, String ename, int t_quantity){
		try {
			
			String query="INSERT INTO resource (EquipmentID,EquipmentName,Total_Quantity,Remaining_Quantity)"
					+ " VALUES ('"+id+"','"+ename+"',"+t_quantity+","+t_quantity+")";
			stmt.executeUpdate(query);
			System.out.println("yes");
			return "yes";
		}
		catch(Exception ex){
			return "no";
		}
	}

	
	/**
	 * View the Equipment ID, name total quantity and remaining quantity for a given equipment name of  equipment ID.
	 * @param name_id Name of id of equipment.
	 */
	public  String View_Equipment_Info(String name_id ){
		ResultSet results=null;
		try {
			
			String query="SELECT * FROM resource WHERE EquipmentID= '"+name_id+"' OR EquipmentName= '"+name_id+"'";
			results=stmt.executeQuery(query);
			if (!results.isBeforeFirst()) {
				System.out.println("Equipmentwith "+name_id+" not found.");
			}
			else {
				String display ="";
				while(results.next()) {
					display+="EQUIPMENT ID: "+results.getString("EquipmentID")+"\n"+"EQUIPMENT NAME: "+results.getString("EquipmentName")+"\nTOTAL QUANTITY: "+
					results.getString("Total_Quantity")+"\nREMAINING QUANTITY: "+results.getString("Remaining_Quantity")+"\n";
				}
				return display;
			}
			return "";
		}
		catch(Exception ex){
			return "";
		}
	}
	
	public String viewEquipment() {
		ResultSet results=null;
		try {
			String query="SELECT * FROM resource";
			results=stmt.executeQuery(query);
			/**if (!results.isBeforeFirst()) {
				System.out.println("Equipment with "+name_id+" not found.");
			}
			else {*/
				String display ="";
				while(results.next()) {
					display+="EQUIPMENT ID: "+results.getString("EquipmentID")+"\n"+"EQUIPMENT NAME: "+results.getString("EquipmentName")+"\nTOTAL QUANTITY: "+
					results.getString("Total_Quantity")+"\nREMAINING QUANTITY: "+results.getString("Remaining_Quantity")+"\n\n";
				}
				return display;
			/**}*/
		}
		catch(Exception ex){
			return "";
		}
	}
	
	/**
	 * Used to remove an equipment from the Database.
	 * @param name_id name or id of euipment that is to be deleted.
	 */
	public  String Delete_Equipment(String name_id ){
		try {
			
			String query="DELETE  FROM resource WHERE EquipmentID= '"+name_id+"' OR EquipmentName= '"+name_id+"'";
			stmt.executeUpdate(query);
			System.out.println("Resource with name/id "+name_id+" has been deleted");	
			return "yes";
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "no";
		}
	}
	
	
	/**
	 * Changes the equipment name, total quantity or remaining quantity attributes of a Resource
	 * @param resource Resource that is to be modified
	 */
	public String Modify_Equipment(String iD, int t_Qty, int r_Qty){
		try {
			
			String query="UPDATE resource SET Total_Quantity='"+t_Qty+"',"
					+ "Remaining_Quantity='"+r_Qty+"' WHERE EquipmentID= '"+iD+"'";
			stmt.executeUpdate(query);
			return "yes";
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "no";
		}
		
	}
	
	public String genReport(String newdate) {
		ResultSet results=null;
		try {
			String query="SELECT Location,Date,EquipmentID,Start_Time,End_Time,Quantity,EquipmentName FROM schedule natural join resource WHERE date= '"+newdate+"'";
			results=stmt.executeQuery(query);
			System.out.println(newdate);
			/**if (!results.isBeforeFirst()) {
				System.out.println("Equipment with "+name_id+" not found.");
			}
			else {*/
				String display ="";
				while(results.next()) {
					/**display ="DATE: "+results.getString("Date")+"\n\n";*/
					display+="EQUIPMENT ID: "+results.getString("EquipmentID")+"\n"+"EQUIPMENT NAME: "+results.getString("EquipmentName")+"\n"+"START TIME: "+results.getString("Start_Time")
					+"\n"+"START TIME: "+results.getString("End_Time")+"\n"+"QUANTITY: "+
					results.getString("Quantity")+"\n"+"LOCATION: "+results.getString("Location")+"\n\n";
				}
				return display;
			/**}*/
		}
		catch(Exception ex){
			return "";
		}
	}
	
	
	//////////////////////////////////User

/**
 * Add new user to database
 * @param fname First name of user.
 * @param lname Last name of user.
 * @param username Name that will be used for login.
 * @param unhashedpassword Password of user name.
 * @param position Position held by user in company
 */
	public void addUser(String fname, String lname, String username,String unhashedpassword, String position){
		try {
			String salt=genSalt();
	        String saltedpassword=salt+unhashedpassword+salt;
			String query="INSERT INTO users (First_Name,Last_Name,Username,Password,Salt,Position)"
					+ " VALUES ('"+fname+"','"+lname+"','"+username+"','"+hashMe(saltedpassword )+"',"
							+ "'"+salt+"','"+position+"')";
			stmt.executeUpdate(query);
			System.out.println("New User Successfully Created");
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	/**
	 * Used to remove user from users table.
	 * @param username username of user that is to be deleted
	 */
	public void removeUser(String username){
		try {
			String query="DELETE FROM users WHERE Username= '"+username+"'";
			stmt.executeUpdate(query);
			System.out.println("User "+username+" has been deleted");
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	
	public  boolean userPasswordValidation(String username, String password){
		String checkpassword=getPasswordandSalt(username)[1]+password+getPasswordandSalt(username)[1];
		if(hashMe(checkpassword).equals(getPasswordandSalt(username)[0])) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	/**
	 * Used to return the password and salt in the database for a user entered. This password and salt will
	 * be used to validate the password entered.
	 * @param username username of user.
	 * @return String Array
	 */
	private  String[] getPasswordandSalt(String username) {
		try {
			String[]pwdsalt= new String[2];
			String query="select * from users WHERE Username= '"+username+"'";
			ResultSet results= stmt.executeQuery(query);
			while(results.next()) {
				if (results.getString("Username").equals(username)) {
						pwdsalt[0]=results.getString("Password");
						pwdsalt[1]=results.getString("Salt");
				}
			}
			return pwdsalt;
		}
		catch (SQLException e) {
			String[]noresult= new String[1];
			System.out.println("Failiure to find user.");
			return noresult;
		}
		
	}
			

	/**
	 * Should generate hash of password using SHA-512
	 * @param saltpassword String which has salt appended to the back and front of password
	 * @return String
	 */
	private  String hashMe(String saltpassword ){
		try {
			MessageDigest msgdigest;
			msgdigest = MessageDigest.getInstance("SHA-512");
			msgdigest.update(saltpassword.getBytes());
			byte[] msgByteArr = msgdigest.digest();
			StringBuilder strbuild= new StringBuilder();
			for(byte b: msgByteArr) {
				strbuild.append(String.format("%02x",b));
			}
			return strbuild.toString();
		} 
		catch (NoSuchAlgorithmException e) {
			return "Error in hashing process";
		}
	}
	
	/**
	 * Should Generate random string which will be appended to entered password
	 * @return String
	 */
	private String genSalt() {
		byte[] bytearr = new byte[20];
		SecureRandom secRan= new SecureRandom();
		secRan.nextBytes(bytearr);
		StringBuilder strbuild= new StringBuilder();
		for(byte b: bytearr) {
			strbuild.append(String.format("%02x",b));
		}
		return strbuild.toString();
	}

	///////////////////////////////report
	public  String report_Generator(String year, String month){
		ResultSet results=null;
		try {
			Calendar c = Calendar.getInstance();
			int monthMaxDays = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			String startrange=year+"-"+month+"-01";
			String endrange=year+"-"+month+"-"+String.valueOf(monthMaxDays);
			String query="SELECT * FROM schedule WHERE Date BETWEEN '"+ startrange +"' AND '"+endrange+"'";
			results=stmt.executeQuery(query);
			if (!results.isBeforeFirst()) {
				return "No schedule in range.";
			}
			else {
				String display="";
				while(results.next()) {
					display+= results.getString("EventID")+"  "+results.getString("Location")+"  "
							+"  "+results.getString("Date")+"  "+
							results.getString("Start_Time")+"  "+results.getString("End_Time")+" "+results.getString("EquipmentID")+"  "+
							results.getString("Quantity")+"\n\n";
				}
				return display;
			}
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			return "";
		}
	}

	
	
	
	
	
}


	
	



