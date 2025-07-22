package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.util.List;
import java.util.TreeMap;
import java.io.IOException;
import java.util.TreeSet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Property_locaters;
import Locators.pom.user_module_locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class user_module extends Property_management{
	
   public String firstpage_search_resultname;
   public String secondpage_search_resultname;
   
	
	@Test
	public void user_Search() throws InterruptedException, IOException, AWTException{
		
		user_module_locaters pp = new user_module_locaters(d);
		Property_locaters p = new Property_locaters(d);
		TreeSet<String> tst = new TreeSet<String>();
		Pagination_nextpage_navigation pgn = new Pagination_nextpage_navigation();
		
		UserManagement();
		pp.user_searchbar();
		List <WebElement> usernames_in_List = p.property_listNames();
		for(WebElement username:usernames_in_List){
			System.out.println(username.getText());
			System.out.println();
			tst.add(username.getText());}
		pp.user_searchbar().sendKeys(tst.last());
		pp.Search_button().click();
		Thread.sleep(1000);
		firstpage_search_resultname = p.property_listNames().get(0).getText();
		System.out.println(firstpage_search_resultname.equalsIgnoreCase(tst.last()) ? " Testcase passed Search working "+ firstpage_search_resultname +" shown in result":"Testcase failed Search not working "+ firstpage_search_resultname +" not shown in result" );
		System.out.println();
		pp.search_clear_crossButton().click();
		Thread.sleep(1800);
		pgn.nextpage_navigate(d);
		pp.user_searchbar().sendKeys(tst.last());
		pp.Search_button().click();
		Thread.sleep(1000);
		secondpage_search_resultname = p.property_listNames().get(0).getText();
		System.out.println(secondpage_search_resultname.equalsIgnoreCase(tst.last()) ? " Testcase passed Search working "+ secondpage_search_resultname +" shown in result":"Testcase failed Search not working "+ usernames_in_List.get(0).getText() +" not shown in result" );
		System.out.println();
	}
	
	    @Test
	    public void user_details_listed_propertyname_matcher() throws InterruptedException, IOException, AWTException{
		
	    user_module_locaters p = new user_module_locaters(d);
	    Property_locaters pl = new Property_locaters(d);
	    TreeMap <String,String> userpropertyname = new TreeMap<String,String>();
	    	  
	        userpropertyname = property_details_Data_fetch();
	        dashboard_access();
		    UserManagement();
			p.user_searchbar();
			p.user_searchbar().sendKeys(userpropertyname.get("username"));
			p.Search_button().click();
			Thread.sleep(1000);
			firstpage_search_resultname = pl.property_listNames().get(0).getText();
			System.out.println(firstpage_search_resultname.equalsIgnoreCase(userpropertyname.get("username")) ? " Testcase passed Search working "+ firstpage_search_resultname +" shown in result":"Testcase failed Search not working "+ firstpage_search_resultname +" not shown in result" );
			System.out.println();
			String propertyname_from_user_details = user_view_details_accessor(0);
			System.out.println(propertyname_from_user_details.equalsIgnoreCase(userpropertyname.get("property name"))? "Testcase Passed Property property name  "+propertyname_from_user_details+ " matching with listed property in user details " : "Testcase failed property name  "+propertyname_from_user_details+" not matching with listed property in user details ");
	}
	    
	    
	    public String user_view_details_accessor(int k) throws InterruptedException, IOException, AWTException{
	    	
	    	user_module_locaters p = new user_module_locaters(d);	
	    	List_slide lsd = new List_slide(d);	
	    	JavascriptExecutor js = (JavascriptExecutor)d;  
	    	   
	    	   p.user_searchbar();	
	           lsd.List_slide();
	           p.user_view_button();	
	           p.user_view_button().get(k).click();
	           Thread.sleep(990);
	           js.executeScript("arguments[0].scrollIntoView(true);",p.property_in_user_details()); 
	           Thread.sleep(990);
	           Thread.sleep(800);
	    	   String propertynameis =  p.property_in_user_details().getText();
	    	
	    	return propertynameis;
	    	
	    }
	
	
	
	
	

}
