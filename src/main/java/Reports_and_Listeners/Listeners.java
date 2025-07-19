package Reports_and_Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.relevantcodes.extentreports.ExtentReports;

public class Listeners extends Extented_Reports implements ITestListener{
  
	ExtentTest test;
	com.aventstack.extentreports.ExtentReports ext =  getReport();
	
	
	@Override
    public void onTestStart(ITestResult result) {
       System.out.println("Test Started: " + result.getName());
       test =  ext.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: " + result.getName());
        test =  ext.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
       
        
        String pathString = null;
        test.fail(result.getThrowable());
        try {
			d = (WebDriver)result.getTestClass().getRealClass().getField("d").get(result.getInstance());
		} catch (Exception ekk) {
			// TODO Auto-generated catch block
			ekk.printStackTrace();
		}
        try {
    			 pathString = Take_Screenshots(result.getMethod().getMethodName(),d);
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        test.addScreenCaptureFromPath(pathString, result.getMethod().getMethodName());
        
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
