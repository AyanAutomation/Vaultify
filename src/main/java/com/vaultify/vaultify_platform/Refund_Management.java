package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;
import Locators.pom.Refund_Module_Locators;

@Listeners(Reports_and_Listeners.Listeners.class)
public class Refund_Management extends Property_management {

	TreeMap<String, String> maptree = new TreeMap<String,String>();
	
	

	public TreeMap<String, String> refund_list_status_checker()throws InterruptedException, IOException, AWTException{
		
		Property_locaters p = new Property_locaters(d);
		Refund_Module_Locators r = new Refund_Module_Locators(d);
		
		List<String> property_names_inlist= Refund_management_access();
		
        for(int o=1;o<property_names_inlist.size();o++){
			
			
			maptree.put(Integer.toString(o), property_names_inlist.get(o));
			System.out.println(Integer.toString(o)+"      "+ property_names_inlist.get(o));
			System.out.println();}
		
		return maptree;}
	
	  @Test
	  public void Refund_list_search() throws InterruptedException, IOException, AWTException{
		  
		  Refund_Module_Locators p = new Refund_Module_Locators(d);
		  Property_locaters pp = new Property_locaters(d);
		  
		  refund_list_status_checker();
		  pp.property_searchbar().sendKeys(maptree.get("6"));
		  pp.Search_button().click();
		  Thread.sleep(800);
		  p.propnames_in_refund_list();
		  System.out.println(maptree.get("3").equalsIgnoreCase(p.propnames_in_refund_list().get(0).getText())?"Testcase Passed searched item "+maptree.get("3")+" Shown in result":"Testcase Failed searched item  "+maptree.get("3")+" not shown in result");
		  System.out.println();
		  
		  
	  }
	
	
	  @Test
	  public void Refund_filter_check() throws InterruptedException, IOException, AWTException{
	  
		  Refund_Module_Locators p = new Refund_Module_Locators(d);
	      Bidding_Management_Locaters pp = new Bidding_Management_Locaters(d); 
	  
		  refund_list_status_checker();
	      pp.filter_button().click();
	      p.filter_dropdowns().get(0).click();
	      p.date_in_dropdown_calender().click();
	      try{
	    	  p.filter_dropdowns().get(1).click();;
	    	  p.date_in_dropdown_calender().click();
	    	  p.filter_result_submit_button().click();
	    	  Thread.sleep(800);
	      }catch(Exception ll){
	    	  
	    	  System.out.println("Refund Filter not working");
	    	  System.out.println();
	    	  
	    	  
	      }
	  }
	
	
	
}
