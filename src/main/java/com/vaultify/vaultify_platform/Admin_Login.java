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

public class Admin_Login  {

     WebDriver d;
     
     public Admin_Login(WebDriver d){
    	 
    	 
    	 this.d=d;
    	 
    	 
     }
	
	
    @Test
	public void login() throws IOException, InterruptedException, AWTException{
		
    	Data_File_Reader dd = new Data_File_Reader();
		Login_locaters p = new Login_locaters(d);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
	    JavascriptExecutor js = (JavascriptExecutor)d;
		Robot r = new Robot();
		
		d.navigate().to(dd.DataKeys("Admin_url"));
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.emailid()));
		p.emailid().sendKeys(dd.DataKeys("email_id"));
		w.until(ExpectedConditions.visibilityOf(p.phnum()));
		p.phnum().sendKeys(dd.DataKeys("ph_number"));
		w.until(ExpectedConditions.visibilityOf(p.password()));
		p.password().sendKeys(dd.DataKeys("password"));
		r.mouseWheel(4);
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.submit_button()));
		p.submit_button().click();
		for(int k=0;k<2;k++){
		otp_filler();}
		w.until(ExpectedConditions.visibilityOf(p.Select_role_page()));
		w.until(ExpectedConditions.visibilityOf(p.role_dropdown()));
		p.role_dropdown().click();
		w.until(ExpectedConditions.visibilityOf(p.drodpdowm_option()));
		p.drodpdowm_option().click();
		w.until(ExpectedConditions.visibilityOf(p.submit_button()));
		p.submit_button().click();
		try{w.until(ExpectedConditions.visibilityOfAllElements(p.success_Toast()));
		System.out.println(p.success_Toast().getText());}
		catch(Exception eee) {System.out.println("post login success toast not found");}
		w.until(ExpectedConditions.visibilityOf(p.Login_confirmed()));
	}
	
    public void otp_filler() throws InterruptedException{
    	
    	Login_locaters p = new Login_locaters(d);
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
    	
    	
		Thread.sleep(800);
		//w.until(ExpectedConditions.visibilityOf(p.OTP_page_Title()));
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
