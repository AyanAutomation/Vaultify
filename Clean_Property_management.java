package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import Locators.pom.Property_locaters;

public class Property_management extends Admin_Modules_Access_and_check{
	
	String Property_name;
	
	
	@Test
	public void Property_Search() throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		
		
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		Pagination_change();
		System.out.println("Extracted Property Name =  "+Property_name);
		p.property_searchbar().sendKeys(Property_name);
		Thread.sleep(800);
		
	}
	
    public void Pagination_change() throws InterruptedException{
    	
    	Property_locaters p = new Property_locaters(d);
    	JavascriptExecutor js = (JavascriptExecutor)d;
    	
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,1800)");
    	Thread.sleep(800);
    	p.pagination_box().click();
    	p.pagination_options();
    	p.pagination_options().get(4).click();
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,-800)");
    	Thread.sleep(800);
    	p.property_listNames();
    	String propnamelabel= p.property_listNames().get(3).getText();
    	String[] propnamelabel_split = propnamelabel.split(": ");
    	Property_name = propnamelabel_split[1];
    }






}
