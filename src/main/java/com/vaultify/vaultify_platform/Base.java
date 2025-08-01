package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
public WebDriver d;
public FluentWait<WebDriver> fluentWait;	
	
  @BeforeMethod
 public void setUP() throws IOException, InterruptedException, AWTException
    { 
	  Data_File_Reader df = new Data_File_Reader();
	  
	  if(df.DataKeys("Browser").equalsIgnoreCase("chrome")){
	  
		WebDriverManager.chromedriver().setup();
        d= new ChromeDriver();
        d.manage().window().maximize();}
	  
	  if(df.DataKeys("Browser").equalsIgnoreCase("firefox")){
		  
		  WebDriverManager.firefoxdriver().setup();
		  d = new FirefoxDriver();
		  d.manage().window().maximize();}
	  
	  fluentWait = new FluentWait<>(d)
              .withTimeout(Duration.ofSeconds(30))
              .pollingEvery(Duration.ofSeconds(2))
              .ignoring(Exception.class);
	  
	  
	  
    }
  
  
  
	
	@AfterMethod
 public	void driverkill(){
		
		if(d!=null){
			
        d.quit();
			
		}}
}
