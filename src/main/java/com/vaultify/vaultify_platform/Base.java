package com.vaultify.vaultify_platform;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public WebDriver d;
	
	
	@BeforeMethod
    void setUP() throws IOException, InterruptedException
    {
        d= new ChromeDriver();
        d.manage().window().maximize();
        Admin_Login l = new Admin_Login(d);
        l.login();
        
       }
	
	
	@AfterMethod
	void driverkill(){
		
		if(d!=null){
			
        d.quit();
			
		}}
}
