package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;

public class Bidding_management extends Property_management{
	
	List<String> propertynamesin; 
	
	@Test
	public void privateBid_console_search()throws InterruptedException, IOException, AWTException{
	
	    
		bidstatus_checker();
	
	
	
	
	}

	
	@Test
	public void bidstatus_checker() throws InterruptedException, IOException, AWTException{
		
	
	Bidding_Management_Locaters p = new Bidding_Management_Locaters(d);	
	TreeMap<String,String> trmap = new TreeMap<String,String>();
	
	List<String> statuses = Private_Bid_Console();
	Thread.sleep(800);
	p.property_names_inbidlist();
	Thread.sleep(800);
	IntStream.range(0, p.property_names_inbidlist().size()).forEach(n->{
		trmap.put(statuses.get(n), p.property_names_inbidlist().get(n).getText());});
	
	System.out.println(trmap);
		
		
	}
}
