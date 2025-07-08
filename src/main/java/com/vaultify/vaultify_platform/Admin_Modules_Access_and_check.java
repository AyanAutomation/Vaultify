package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Property_locaters;


public class Admin_Modules_Access_and_check extends Admin_Login{
	
	int v=0;
    List <String> allbid_stats = new ArrayList<String>();
	
    
	public void dashboard_access() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v).click();
		Thread.sleep(1250);}
	
 
	   public void Vaultify_Versity() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
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
	
 
	public void UserManagement() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+2).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);}
	
    
	public List<String> TeamManagement() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	Property_locaters pp = new Property_locaters(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
        List<String> names_of_staffs = new ArrayList<String>();
        
        login();
    	p.Menu_modules();	
		p.Menu_modules().get(v+3).click();
		Thread.sleep(750);
		p.page_headeings();
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();
		js.executeScript("arguments[0].scrollIntoView(true);",p.employee_search_button());
	    Thread.sleep(800);
	    pp.property_listNames();
		List <WebElement> employeenames = pp.property_listNames();
		for(WebElement employeename:employeenames){
			names_of_staffs.add(employeename.getText());
		}
	    return names_of_staffs;
	}
	
    
public void Property_Soceity_Management(int k) throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
    	
        login();
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
		System.out.println(b);});
        System.out.println();}
	
	
	
	public List<String> Home_visit_Pending_Module_Access() throws IOException, InterruptedException, AWTException{
		
		
		Admin_modules_locators p = new Admin_modules_locators(d);
		
    	
        Property_Soceity_Management(0);
        p.module_internal_Tabs();
        p.module_internal_Tabs().get(1).click();
		p.Home_visit_pending_properties();
	    List<String> propertiesnames = p.Home_visit_pending_properties().stream().map(WebElement::getText).collect(Collectors.toList());
	    return propertiesnames;
		
	}
	
	   
	
 
	public void SiteSetting() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+5).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	
  
	public void Dynamic_Incentive_Setting() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+6).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	
  
	public void Grivance_Management() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+7).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	

	public void Feedback_Management() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+8).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	
 
	public void Relationships() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+10));
    	Thread.sleep(800);	
		p.Menu_modules.get(v+10).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	

	public void TalkToExpert() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+11));
    	Thread.sleep(800);
		p.Menu_modules.get(v+11).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	

	public void Staff_Attendance_Management() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+12));
    	Thread.sleep(800);
		p.Menu_modules.get(v+12).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	
    
	public List<String> Private_Bid_Console() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        //List_slide lstsl = new List_slide(d);
        Robot r = new Robot();
        
        login();
        w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));Thread.sleep(800);
    	a.moveToElement((p.Menu_modules.get(1))).build().perform();
    	js.executeScript("arguments[0].scrollIntoView(true);",p.Menu_modules.get(v+11));
    	Thread.sleep(800);
		p.Menu_modules.get(v+11).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();
		//lstsl.List_slide();
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOfAllElements(p.PropertyBid_statuses()));
		js.executeScript("arguments[0].scrollIntoView(true);",p.PropertyBid_statuses().get(0));
		Thread.sleep(800);
		r.mouseWheel(6);
		Thread.sleep(800);
	    for(WebElement bidstatus:p.PropertyBid_statuses()){
	    	allbid_stats.add(bidstatus.getText());}
	    return allbid_stats;
	}
	
 
	public void Franchise_Management() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        login();
    	w.until(ExpectedConditions.visibilityOfAllElements(p.Menu_modules));	
		p.Menu_modules.get(v+14).click();
		Thread.sleep(750);
		w.until(ExpectedConditions.visibilityOf(p.page_headeings()));
		StringBuffer b = new StringBuffer(" heading is ");
        b.append(p.page_headeings().getText());
		System.out.println(b);
		System.out.println();}
	

	  public void Property_Update_Approval_Module_Access() throws InterruptedException, IOException, AWTException{
		
    	Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);

        
        Property_Soceity_Management(0);
        a.moveToElement(p.update_approval_request_button()).click().build().perform();
        
        
        
    	} 
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
		System.out.println(b);
		System.out.println();}
	
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
