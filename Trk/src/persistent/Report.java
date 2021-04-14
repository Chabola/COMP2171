package persistent;
import database.TrkDatabaseConnect;

public class Report {
	private static TrkDatabaseConnect trkconnect;
	
	
	public static String generateReport(String newdate){
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.genReport(newdate); 
	}
	
	public static String reportGenerator(String year,String month) {
		trkconnect= new TrkDatabaseConnect();
		return trkconnect.report_Generator(year,month);
	}

	
	
}
