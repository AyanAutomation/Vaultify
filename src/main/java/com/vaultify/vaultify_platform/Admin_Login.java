package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
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

public class Admin_Login extends Base{

 
     Login_locaters p;
     Data_File_Reader dd;
     
     
   @Test
	public void login() throws IOException, InterruptedException, AWTException{
		
    	dd = new Data_File_Reader();
		p = new Login_locaters(d);p = new Login_locaters(d);
	    JavascriptExecutor js = (JavascriptExecutor)d;
		Robot r = new Robot();
		
		try {p.Login_confirmed();}
		catch(Exception llk) {
		d.navigate().to(dd.DataKeys("Admin_url"));
		Thread.sleep(800);
		p.emailid();
		p.emailid().sendKeys(dd.DataKeys("email_id"));
		p.phnum();
		p.phnum().sendKeys(dd.DataKeys("ph_number"));
		p.password();
		p.password().sendKeys(dd.DataKeys("password"));
		r.mouseWheel(4);
		Thread.sleep(800);
		p.submit_button();
		p.submit_button().click();
		for(int k=0;k<2;k++){
		otp_filler();}
		p.Select_role_page();
		p.role_dropdown();
		p.role_dropdown().click();
		p.drodpdowm_option();
		p.drodpdowm_option().click();
		p.submit_button();
		p.submit_button().click();
		try{Thread.sleep(800);
	    p.success_Toast();
		System.out.println(p.success_Toast().getText());
		System.out.println();}
		catch(Exception eee){
		System.out.println("post login success toast not found");
		System.out.println();}
		p.Login_confirmed();}
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
		w.until(ExpectedConditions.visibilityOfAllElements(p.success_Toast()));
		System.out.println(p.success_Toast().getText());	
	
}}
