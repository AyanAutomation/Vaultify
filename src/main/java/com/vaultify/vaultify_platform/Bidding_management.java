package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;

public class Bidding_management extends Property_management{
	
	List<String> propertynamesin; 
	List<String> statuses =  new ArrayList<String>();
	TreeMap<String,String> trmap = new TreeMap<String,String>();
	int v;
	int g;
	
	
	@Test
	public void privateBid_console_search()throws InterruptedException, IOException, AWTException{
	
		
		Property_locaters pp = new Property_locaters(d);
		Bidding_Management_Locaters p = new Bidding_Management_Locaters(d);	
	    
		
		
		bidstatus_checker();
	    List <WebElement> propertynames= p.property_names_inbidlist();
	    pp.property_searchbar();
		pp.property_searchbar().sendKeys(trmap.get("started"));
		pp.Search_button().click();
		Thread.sleep(1800);
		System.out.println(propertynames.get(0).getText().equalsIgnoreCase(trmap.get("started"))?"Testcase Passed Search working "+trmap.get("started")+" shown as result" :"Testcase failed Search not working "+trmap.get("started")+" not shown as result");
	
	}

	
	@Test
	public void bidstatus_checker() throws InterruptedException, IOException, AWTException{
		
	
	Bidding_Management_Locaters p = new Bidding_Management_Locaters(d);	
	
	statuses = Private_Bid_Console();
	System.out.println("number of statused in bid list "+statuses.size());
	System.out.println();
    Thread.sleep(800);
	p.property_names_inbidlist();
	Thread.sleep(800);
	
	
	for(WebElement each_propertyName:p.property_names_inbidlist()){
		trmap.put(statuses.get(v) , each_propertyName.getText());
	  System.out.println(statuses.get(v) +"   "+ each_propertyName.getText());
	  System.out.println();
	  v++;
	}}
	
	@Test
	public void bid_filter_checker() throws InterruptedException, IOException, AWTException{
		
		Bidding_Management_Locaters p = new Bidding_Management_Locaters(d);	
		WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
		JavascriptExecutor js = (JavascriptExecutor)d;
		Admin_modules_locators pp = new Admin_modules_locators(d);
		Robot r = new Robot();
		List<String> allbidstats = new ArrayList<>();
		
		bidstatus_checker();
		d.navigate().refresh();
		p.filter_button().click();
		p.dropdown_button().click();
		String selected_option= p.filter_dropdown_options().get(0).getText();
		System.out.println("Status selected "+selected_option);
		System.out.println();
		p.filter_dropdown_options().get(0).click();
		p.filter_result_submit_Button().click();
		w.until(ExpectedConditions.visibilityOfAllElements(pp.PropertyBid_statuses()));
		js.executeScript("arguments[0].scrollIntoView(true);",pp.PropertyBid_statuses().get(0));
		Thread.sleep(800);
		r.mouseWheel(pp.PropertyBid_statuses().size());
		Thread.sleep(800);
		for(int kk=0;kk<=pp.PropertyBid_statuses().size();kk++){
			if(kk%2!=0){
				allbidstats.add(pp.PropertyBid_statuses().get(kk).getText());}}
	    System.out.println(allbidstats.contains(selected_option)?"Testcase passed filtered status shown in list ":" Testcase Failed filtered status shown in list ");
	    System.out.println();
	    for(WebElement each_propertyName:p.property_names_inbidlist()){
		  System.out.println(each_propertyName.getText() +"   "+ allbidstats.get(g));
		  System.out.println();
		g++;}}}
	

