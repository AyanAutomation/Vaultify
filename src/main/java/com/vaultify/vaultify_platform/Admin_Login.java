package com.vaultify.vaultify_platform;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Locators.pom.Login_locaters;

public class Admin_Login  extends Base{


	
    @Test
	public void login() throws IOException, InterruptedException{
		
		Data_File_Reader dd = new Data_File_Reader();
		Login_locaters p = new Login_locaters(d);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor)d;
		
		
		d.navigate().to(dd.DataKeys("Admin_url"));
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.emailid()));
		p.emailid().sendKeys(dd.DataKeys("email_id"));
		w.until(ExpectedConditions.visibilityOf(p.phnum()));
		p.phnum().sendKeys(dd.DataKeys("ph_number"));
		w.until(ExpectedConditions.visibilityOf(p.password()));
		p.password().sendKeys(dd.DataKeys("password"));
		w.until(ExpectedConditions.visibilityOf(p.submit_button()));
		p.submit_button().click();
		for(int k=0;k<2;k++){
		otp_filler();
		
		}
		w.until(ExpectedConditions.visibilityOf(p.Select_role_page()));
	}
	
    public void otp_filler() throws InterruptedException{
    	
    	Login_locaters p = new Login_locaters(d);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
    	
    	
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.OTP_page_Title()));
		w.until(ExpectedConditions.visibilityOfAllElements(p.inputs));
		
		List<String> otpValues = new ArrayList<>();
		
		otpValues.add("1");
		otpValues.add("4");
		otpValues.add("3");
		otpValues.add("1");
		otpValues.add("2");
		otpValues.add("1");

		for(int i=0 ; i<p.inputs.size();i++){
			
			System.out.println(otpValues.get(i));
			p.inputs.get(i).sendKeys(otpValues.get(i));
		}
		
		w.until(ExpectedConditions.visibilityOfAllElements(p.verify_otp_BUtton()));
		p.verify_otp_BUtton().click();
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOfAllElements(p.success_Toast()));}
	
	
}
