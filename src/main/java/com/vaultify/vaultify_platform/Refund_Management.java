package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.Repeatative_Codes;

import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;
import Locators.pom.Refund_Module_Locators;

@Listeners(Reports_and_Listeners.Listeners.class)
public class Refund_Management extends Property_management {

	TreeMap<String, String> maptree = new TreeMap<String,String>();
	TreeMap<String, List<String>> PROPERTYNAME_column = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> PROPERTYTYPE_column = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> OWNER_SELLER_column = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> LOCATION_column = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> BASEPRICE_column = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> NO_OF_PAYMENTS_column = new TreeMap<String, List<String>>();
	List<String> property_names_inlist = new ArrayList<String>();
	List<String> PROPERTYTYPE = new ArrayList<String>();
	List<String> OWNER_SELLER = new ArrayList<String>();
	List<String> LOCATION = new ArrayList<String>();
	List<String> BASEPRICE = new ArrayList<String>();
	List<String> NO_OF_PAYMENTS = new ArrayList<String>();
    TreeSet<String> detailed_data = new TreeSet<String>();
	
	  int index = 2;
	
	

	public TreeMap<String, String> refund_list_status_checker()throws InterruptedException, IOException, AWTException{
		
		Property_locaters p = new Property_locaters(d);
		Refund_Module_Locators r = new Refund_Module_Locators(d);
		
		property_names_inlist= Refund_management_access();
		
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
	
	  public void Refund_list_data_inserter() throws InterruptedException, IOException, AWTException{
		  
		  
		  refund_list_status_checker();
		  Refund_Module_Locators r = new Refund_Module_Locators(d);
		  
		  PROPERTYNAME_column.put("Properties --------------->", property_names_inlist);
		  int count = property_names_inlist.size();
		  IntStream.range(v, count).forEach(m->{
			  
			  PROPERTYTYPE.add(r.second_column_datas().get(m).getText()); 
			  OWNER_SELLER.add(r.Third_column_datas().get(m).getText());
			  LOCATION.add(r.fourth_column_datas().get(m).getText());
			  BASEPRICE.add(r.fifth_column_datas().get(m).getText());
			  NO_OF_PAYMENTS.add(r.sixth_column_datas().get(m).getText());
		  });
		  
		  PROPERTYTYPE_column.put("Property Type -------------------- ", PROPERTYTYPE);
		  OWNER_SELLER_column.put("Owner/Seller -------------------- ", OWNER_SELLER);
		  LOCATION_column.put("Location -------------------- ", LOCATION);
		  BASEPRICE_column.put("Base price -------------------- ", BASEPRICE);
		  NO_OF_PAYMENTS_column.put("No of Payments -------------------- ", NO_OF_PAYMENTS);
	  }
	
	  
	  @Test
	  public void Refund_list_data_fetcher() throws InterruptedException, IOException, AWTException{
		  
		  
		  Refund_list_data_inserter();
		  
		  for(Map.Entry<String, List<String>> pair1:PROPERTYTYPE_column.entrySet()){
			  
			  System.out.println(pair1.getKey());
			  System.out.println();
			  for(String value1:pair1.getValue()){
				  System.out.println(value1);
				  System.out.println();}}
          for(Map.Entry<String, List<String>> pair2:OWNER_SELLER_column.entrySet()){
			  
			  System.out.println(pair2.getKey());
			  System.out.println();
			  for(String value2:pair2.getValue()){
				  System.out.println(value2);
				  System.out.println();}}
          for(Map.Entry<String, List<String>> pair3:LOCATION_column.entrySet()){
			  
			  System.out.println(pair3.getKey());
			  System.out.println();
			  for(String value3:pair3.getValue()){
				  System.out.println(value3);
				  System.out.println();}}
          for(Map.Entry<String, List<String>> pair4:BASEPRICE_column.entrySet()){
			  
			  System.out.println(pair4.getKey());
			  System.out.println();
			  for(String value4:pair4.getValue()){
				  System.out.println(value4);
				  System.out.println();}}
          for(Map.Entry<String, List<String>> pair5:NO_OF_PAYMENTS_column.entrySet()){
			  
			  System.out.println(pair5.getKey());
			  System.out.println();
			  for(String value5:pair5.getValue()){
				  System.out.println(value5);
				  System.out.println();}}}
	  
	  
	  @Test
	  public void  Refund_details_page_accessor() throws InterruptedException, IOException, AWTException{
		  
		  Refund_Module_Locators p = new Refund_Module_Locators(d);
		  
		  Refund_list_data_fetcher();
		  List<WebElement> details_button = p.view_details_button();
		  details_button.get(index).click();
		  p.property_details();
		  List<WebElement> details = p.detailed_values();
		  for(WebElement detail:details){
			  
			  detailed_data.add(detail.getText());
			  System.out.println(detail.getText());
			  System.out.println();}
		  
		  
		  
		  
	  }}


    class Service_ReFund extends Refund_Management{
    	
    	
    	TreeMap<String,WebElement> payment_and_checkbox = new TreeMap<String,WebElement>();
    	
    	
    	
    	
    	public void Refund_tab_Accessor(int k) throws InterruptedException, AWTException, IOException {
    		
    		Refund_Module_Locators p = new Refund_Module_Locators(d);
    		
    		
    		Refund_management_access();
    		p.Module_tabs().get(k).click();
    		p.landed_in_service_tab();}
    	
    	
    	@Test
    	public void Initiate_refund() throws InterruptedException, AWTException, IOException{
    		
    		Refund_Module_Locators p = new Refund_Module_Locators(d);
    		JavascriptExecutor js = (JavascriptExecutor)d;
    		Repeatative_Codes w = new Repeatative_Codes(d);
    		
    		Refund_tab_Accessor(1);
    		List <WebElement> payments = p.due_payments();
    		List <WebElement> checkboxes = p.checkboxes();
    		
            IntStream.range(0,Math.min(payments.size(), checkboxes.size())).forEach(h->{
    			 payment_and_checkbox.put(payments.get(h).getText(), checkboxes.get(h));});
    		 
    		 for(Map.Entry<String,WebElement> pair:payment_and_checkbox.entrySet()){
    			 System.out.println("Payments are "+pair.getKey());
    			 System.out.println();
    			 if(pair.getKey().equalsIgnoreCase("1")){
    				 WebElement box= pair.getValue();
    				 w.WebElement_wait(box);
    				 w.movetoElements(box);
    				 Thread.sleep(800);
    			/*	 js.executeScript("arguments[0].scrollIntoView(true);",box);
    				 Thread.sleep(800);
    				 js.executeScript("window.scrollBy(0,-150)"); */
    				 Thread.sleep(800);
    				 js.executeScript("arguments[0].click();", box);			 
    			 break;}}    		 
    		 
               Thread.sleep(2000);
    	}
    	
    	
    	
    }





