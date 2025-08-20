package Reports_and_Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
;

public class Listeners extends Extented_Reports implements ITestListener{
  
	
	ExtentReports ext =  getReport();
	
	
	@Override
    public void onTestStart(ITestResult result) {
       System.out.println("Test Started: " + result.getName());
      String Methodname = result.getMethod().getMethodName();
      ext.createTest(Methodname);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        ext.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
       
    	String Methodname = result.getMethod().getMethodName();
        String pathString = null;
        ext.createTest(Methodname).fail(result.getThrowable());
        
        try {
			d = (WebDriver)result.getTestClass().getRealClass().getField("d").get(result.getInstance());
		} catch (Exception ekk) {
			// TODO Auto-generated catch block
			ekk.printStackTrace();
		}
        try {
    			 pathString = Take_Screenshots(Methodname,d);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        ext.createTest(Methodname).addScreenCaptureFromPath(pathString, Methodname);
        
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // not often used
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started: " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished: " + context.getName());
        ext.flush();
    }
	
	
	
}
