package com.vaultify.Repeat_codes;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repeatative_Codes {
	
	WebDriver d;
	
  public Repeatative_Codes(WebDriver d){
	  
	  this.d=d;
	  
	  
  }
	
	
	public void WebElement_wait(WebElement element){
		
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(16));
		
		w.until(ExpectedConditions.visibilityOf(element));}
	
     public void WebElements_waits(List<WebElement> elements){
		
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
		
		w.until(ExpectedConditions.visibilityOfAllElements(elements));}
     
     
     public void movetoElements(WebElement element) throws InterruptedException{
    	 
    	 Actions a = new Actions(d);
    	 
    	 
    	 a.moveToElement(element).build().perform();
    	 Thread.sleep(800);}
     
     public String getTooltipMessage(WebElement element) {
    	    JavascriptExecutor js = (JavascriptExecutor) d;
    	    WebElement_wait(element);
    	    return (String) js.executeScript("return arguments[0].validationMessage;", element);
    	}
     
     
}
