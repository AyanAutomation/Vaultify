package Reports_and_Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extented_Reports {
	
	public static ExtentReports getReport(){
		
		
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//Extent_Reports.html");
		
		spark.config().setReportName("Vaultify_Automation_Report");
		spark.config().setDocumentTitle("Automation_Extent Report");
		
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(spark);
		reports.setSystemInfo("Automated By", "Ayan Sengupta Automation Test Engineer");
		
		return reports;
		
	}
	
	
	

}
