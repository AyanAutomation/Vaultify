package Validations_check;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.Repeatative_Codes;
import com.vaultify.vaultify_platform.Base;
import com.vaultify.vaultify_platform.Data_File_Reader;

import Locators.pom.Login_locaters;

public class Login_validations extends Base{
	
	 Login_locaters p;



    @Test(dataProvider="datas")
	public void invalid_login(String email, String phone, String password,String validation_Type)throws IOException, InterruptedException, AWTException{
		
		p = new Login_locaters(d);
		Robot r = new Robot();
		Data_File_Reader dd = new Data_File_Reader();
		Repeatative_Codes rp = new Repeatative_Codes(d);
		
		String validation_of = validation_Type;
		
		d.get(dd.DataKeys("Admin_url"));
		Thread.sleep(800);
		p.emailid();
		p.emailid().sendKeys(email);
		p.phnum();
		p.phnum().sendKeys(phone);
		p.password();
		p.password().sendKeys(password);
		r.mouseWheel(4);
		Thread.sleep(800);
		p.submit_button();
		p.submit_button().click();
		Thread.sleep(600);
		if(validation_of.equalsIgnoreCase("Invalid Email formats")){
		System.out.println("Error message given =  "+rp.getTooltipMessage(p.emailid()));
		}
		if(validation_of.equalsIgnoreCase("Invalid Phone Numbers")){
			Thread.sleep(1600);
			String ph_error = p.error_message().getText();
			System.out.println("Error message given =  "+ph_error);}
	}
	
	
	@DataProvider
	public Object[][] datas()throws IOException, InterruptedException, AWTException{
		
		Data_File_Reader dd = new Data_File_Reader();
		return new Object[][] {          
			

            // Invalid Email formats 
			
            {"atanumatrixmedia.com", dd.DataKeys("ph_number"), dd.DataKeys("password"),"Invalid Email formats"},
            {"atanu@", dd.DataKeys("ph_number"), dd.DataKeys("password"),"Invalid Email formats"},
            {"@matrixmedia.com", dd.DataKeys("ph_number"), dd.DataKeys("password"),"Invalid Email formats"},
            {"", dd.DataKeys("ph_number"), dd.DataKeys("password"),"Invalid Email formats"}, 

            // Invalid Phone Numbers
            {dd.DataKeys("email_id"), "+91 9090",dd.DataKeys("password"),"Invalid Phone Numbers"},
            {dd.DataKeys("email_id"), "90909090ab",dd.DataKeys("password"),"Invalid Phone Numbers"},
            {dd.DataKeys("email_id"), "", dd.DataKeys("password"),"Invalid Phone Numbers"},

            // Invalid Passwords
            {dd.DataKeys("email_id"), dd.DataKeys("ph_number"), "wrongpass"},
            {dd.DataKeys("email_id"), dd.DataKeys("ph_number"), ""},

            // Empty fields
            {"", "", ""},
            {dd.DataKeys("email_id"), "", ""},
            {"", dd.DataKeys("ph_number"), ""},
            {"", "", dd.DataKeys("password")},};
		
		
		
		
		
	}

}
