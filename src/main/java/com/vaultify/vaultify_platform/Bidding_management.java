package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;

public class Bidding_management extends Property_management{
	
	List<String> propertynamesin; 
	List<String> statuses =  new ArrayList<String>();
	int v;
	
	public void privateBid_console_search()throws InterruptedException, IOException, AWTException{
	
	    
		bidstatus_checker();
	
	}

	
	@Test
	public void bidstatus_checker() throws InterruptedException, IOException, AWTException{
		
	
	Bidding_Management_Locaters p = new Bidding_Management_Locaters(d);	
	TreeMap<String,String> trmap = new TreeMap<String,String>();
	List<String> All_Propertnames_inBid_list= new ArrayList<String>();
	
	statuses = Private_Bid_Console();
	System.out.println("number of statused in bid list "+statuses.size());
	System.out.println();
  
	Thread.sleep(800);
	p.property_names_inbidlist();
	Thread.sleep(800);
	System.out.println("number of properties in bid list "+p.property_names_inbidlist().size());
	System.out.println();
	for(WebElement each_propertyName:p.property_names_inbidlist()){
		System.out.println("Property names are "+each_propertyName.getText());
		System.out.println();
	trmap.put(each_propertyName.getText(), statuses.get(v));
	v++;
	if(v>=statuses.size()){
		break;
	}}
	
	System.out.println();	
	System.out.println(trmap);	
	}
}
