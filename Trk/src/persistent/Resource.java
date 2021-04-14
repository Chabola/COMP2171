package persistent;

import java.util.ArrayList;
import database.TrkDatabaseConnect;


public class Resource {
	private String Ename;
	private String ID;
	private int T_Qty;
	private int R_Qty;
	private static TrkDatabaseConnect trkconnect;
	public static ArrayList<Resource> resource_array = new ArrayList<>();
	
	public Resource(String iD,String ename, int t_Qty) {
		this.Ename = ename;
		this.ID = iD;
		this.T_Qty = t_Qty;
		this.R_Qty = t_Qty;
	}
	
	public Resource(String iD, int t_Qty, int r_Qty) {
		this.ID = iD;
		this.T_Qty = t_Qty;
		this.R_Qty = r_Qty;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		this.Ename = ename;
	}

	public String getID() {
		return ID;
	}

	public int getT_Qty() {
		return T_Qty;
	}

	public void setT_Qty(int t_Qty) {
		this.T_Qty = t_Qty;
	}

	public int getR_Qty() {
		return R_Qty;
	}

	public void setR_Qty(int r_Qty) {
		this.R_Qty = r_Qty;
	}

	@Override
	public String toString() {
		return "Resource [Ename=" + Ename + ", ID=" + ID + ", T_Qty=" + T_Qty + ", R_Qty=" + R_Qty + "]";
	}
	

	
	
	/**
	 * Used to add equipment to database.
	 * @param id ID of equipment.
	 * @param ename Name of Equipment.
	 * @param t_quantity The amount of the equipment being added.
	 */
	public static String Add_Equipment(String id, String ename, int t_quantity){
		trkconnect= new TrkDatabaseConnect();	
		return trkconnect.Add_Equipment(id, ename, t_quantity);
	}

	
	/**
	 * View the Equipment ID, name total quantity and remaining quantity for a given equipment name of  equipment ID.
	 * @param name_id Name of id of equipment.
	 */
	public static String View_Equipment_Info(String name_id ){
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.View_Equipment_Info(name_id);
	}
	
	
	/**
	 * Used to remove an equipment from the Database.
	 * @param name_id name or id of euipment that is to be deleted.
	 */
	public static String Delete_Equipment(String name_id ){
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.Delete_Equipment(name_id);
		
	}
	
	
	/**
	 * Changes the equipment name, total quantity or remaining quantity attributes of a Resource
	 * @param resource Resource that is to be modified
	 */
	public static String Modify_Equipment(Resource resource) {
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.Modify_Equipment(resource.getID(),resource.getT_Qty(),resource.R_Qty);
	}
	
	public static String viewEquipment() {
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.viewEquipment();
		/**trkconnect= new TrkDatabaseConnect();
		return trkconnect.View_Equipment_Info(name_id);*/
	}
	
	
	
}
