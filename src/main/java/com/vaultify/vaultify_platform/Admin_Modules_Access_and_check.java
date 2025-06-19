package com.vaultify.vaultify_platform;

import java.time.Duration;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import Locators.pom.Admin_modules_locators;


public class Admin_Modules_Access_and_check extends Base{
	
	int v=0;

	
    
	public void dashboard_access() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v).click();
		Thread.sleep(1250);}
	
 
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        w.until(ExpectedConditions.visibilityOf(p.sideMenu()));   
        a.moveToElement(p.sideMenu()).build().perform();
        Thread.sleep(450);
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
 
	public void UserManagement() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+2).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
    
	public void TeamManagement() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+3).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
    
	public void Property_Soceity_Management(int k) throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
    
        IntStream.range(0, 1).forEach(i->{
    	w.until(ExpectedConditions.visibilityOfAllElements(p.dropdown_module.get(0)));	
    	try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	p.dropdown_module.get(0).click();
		w.until(ExpectedConditions.visibilityOf(p.dropdown_submenu.get(0)));
		w.until(ExpectedConditions.visibilityOf(p.submenuitems.get(k)));	
		p.submenuitems.get(k).click();
		try {
			Thread.sleep(800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);});}
	
 
	public void SiteSetting() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+5).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
  
	public void Dynamic_Incentive_Setting() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+6).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
  
	public void Grivance_Management() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+7).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	

	public void Feedback_Management() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+8).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
 
	public void Relationships() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+10));
    	Thread.sleep(800);	
		p.Menu_modules.get(v+10).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	

	public void TalkToExpert() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+11));
    	Thread.sleep(800);
		p.Menu_modules.get(v+11).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	

	public void Staff_Attendance_Management() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+12));
    	Thread.sleep(800);
		p.Menu_modules.get(v+12).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
    
	public void Private_Bid_Console() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+11));
    	Thread.sleep(800);
		p.Menu_modules.get(v+11).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
 
	public void Franchise_Management() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+14).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
/*	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
    @Test  
	public void Vaultify_Versity() throws InterruptedException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+1).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(p.page_headeings().getText());
        b.append(" heading is ");
		System.out.println(b);}
	
*/
}
