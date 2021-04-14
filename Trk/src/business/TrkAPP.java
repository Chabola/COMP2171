package business;


import java.util.ArrayList;
import java.util.Random;

import database.TrkDatabaseConnect;
import persistent.*;


public class TrkAPP {
	
	public TrkAPP() {
		
	}
	
	
	
	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public String equipmentScheduler(String eventid, String location, String date, String s_time, String e_time, String resourceid, int quantity){
		return Schedule.Schedule_Equipment(new Schedule(eventid,location,date,s_time,e_time,resourceid,quantity));
	}
			
	/**
	 * View all event scheduling details that a particular equipment has been scheduled for
	 * @param id Equipment Id.
	 */
	public  ArrayList<String[]> schedule_Viewer(String id ){
		return Schedule.View_Schedule(id);
	}
	
	/**
	 * Used to add equipment to database.
	 * @param id ID of equipment.
	 * @param ename Name of Equipment.
	 * @param t_quantity The amount of the equipment being added.
	 */
	public  String addNewEquipment(String id, String ename, int t_quantity){
		return Resource.Add_Equipment(id, ename, t_quantity);
	}
	
	/**
	 * View the Equipment ID, name total quantity and remaining quantity for a given equipment name of  equipment ID.
	 * @param name_id Name of id of equipment.
	 */
	public String equipmentInfoViewer(String name_id ){
		return Resource.View_Equipment_Info(name_id);
	}
	
	public String reportGenerator(String newdate) {
		return Report.generateReport(newdate);
	}
	
	public String viewEquipment(){
		return Resource.viewEquipment();
	}
	
	
	/**
	 * Used to remove an equipment from the Database.
	 * @param name_id name or id of euipment that is to be deleted.
	 */
	public String equipmentRemover(String name_id ){
		return Resource.Delete_Equipment(name_id);	
	}
	

	/**
	 * Changes the equipment name, total quantity or remaining quantity attributes of a Resource
	 * @param resource Resource that is to be modified
	 */
	public String equipmentModifier(String iD, int t_Qty,int r_Qty){
		return Resource.Modify_Equipment(new Resource(iD, t_Qty, r_Qty));
	}
	
		
	public String scheduleModifier(String eventid, String location, String date, String s_time, String e_time, String resourceid, int newquantity) {
		return Schedule.ModifySchedule(eventid, location, date, s_time, e_time, resourceid, newquantity);
	}
	
	
	public void addNewUser(String fname, String lname, String username,String password, String position){
		User.addUser(fname, lname, username, password, position);
	}
	
	/**
	 * Used to remove user from users table.
	 * @param username username of user that is to be deleted
	 */
	public  void removeExistingUser(String username){
		User.removeUser(username);
	}
	
	public  boolean userLogin(String username, String password){
		return  User.Login(username, password);
	}
	
	
	
	public String genStr() {
	    int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 3;
	    Random random = new Random();

	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();

	    return generatedString.toLowerCase();
	}
	
	public void delay() {
		System.out.println("Please Wait");
		for(int i=0;i<=5*15000000;i++){
			switch (i) {
				case(15000000):
					System.out.print(".");
					break;
				case(25000000):
					System.out.print(".");
					break;
				case(35000000):
					System.out.print(".");
					break;
				case(45000000):
					System.out.print(".");
					break;
				case(55000000):
					System.out.print(".\n");
					break;
			}
		}
	}
	
		
}
