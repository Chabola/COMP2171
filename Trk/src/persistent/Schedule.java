package persistent;

//import java.sql.Connection;
import java.util.ArrayList;

import database.TrkDatabaseConnect;

public class Schedule {
	private String eventid;
	private String location;
	private String date;
	private String s_time;
	private String e_time;
	private Resource resource;
	private int quantity;
	private String eqpid;
	private static TrkDatabaseConnect trkconnect;
	public static ArrayList<Schedule> schedule_array= new ArrayList<>();
	

	public Schedule(String eventid, String location, String date, String s_time, String e_time, String eqpid, int quantity) {
		this.eventid=eventid;
		this.location = location;
		this.date = date;
		this.s_time = s_time;
		this.e_time = e_time;
		this.eqpid=eqpid;
		this.quantity=quantity;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getS_time() {
		return s_time;
	}


	public void setS_time(String s_time) {
		this.s_time = s_time;
	}


	public String getE_time() {
		return e_time;
	}


	public void setE_time(String e_time) {
		this.e_time = e_time;
	}


	public Resource getResource() {
		return resource;
	}


	public void setResource(Resource resource) {
		this.resource = resource;
	}


	public String getEventid() {
		return eventid;
	}


	public void setEventid(String eventid) {
		this.eventid = eventid;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	public String getEqpid() {
		return eqpid;
	}

	@Override
	public String toString() {
		return "Schedule [eventid=" + eventid + ", location=" + location + ", date=" + date + ", s_time=" + s_time
				+ ", e_time=" + e_time + ", quantity=" + quantity + ", eqpid=" + eqpid + "]";
	}
	
	
	/**
	 * Schedule an equipment for an event.
	 * @param schedule schedule object from which the attribute will be used to update database. 
	 */
	public static String Schedule_Equipment(Schedule schedule){
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.Schedule_Equipment(schedule.getEventid(), schedule.getLocation(), schedule.getDate(),
				schedule.getS_time(), schedule.getE_time(), schedule.getEqpid(), schedule.getQuantity());
	}
			
	/**
	 * View all event scheduling details that a particular equipment has been scheduled for
	 * @param id Equipment Id.
	 */
	public static  ArrayList<String[]> View_Schedule(String id ){
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.View_Schedule(id);
	}
	
	public static String ModifySchedule(String eventid, String location, String date, String s_time, String e_time, String resourceid, int newquantity) {
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.ModifySchedule(eventid, location, date, s_time, e_time, resourceid, newquantity);
		
	}
	
}

