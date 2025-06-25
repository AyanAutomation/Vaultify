package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Property_locaters;

public class Property_management extends Admin_Modules_Access_and_check{
	
	public String Property_name;
	public  String Resultant_propertyname;
	
	@Test
	public void Property_Search() throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		Pagination_change();
		System.out.println("Extracted Property Name =  "+Property_name);
		p.property_searchbar().sendKeys(Property_name);
		Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);
		String propertynamelabel= p.property_listNames().get(0).getText();
    	String[] propertynamelabel_split = propertynamelabel.split(": ");
		Resultant_propertyname = propertynamelabel_split[1];
		System.out.println(Property_name.equalsIgnoreCase(Resultant_propertyname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");
		//propertydelete();
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
    	Property_name = propnamelabel_split[1];}

    
        @Test
        public void propertydelete() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        List_slide lsd = new List_slide(d);	
        
        Property_Soceity_Management(0);
		p.property_searchbar();	
        lsd.List_slide();
        p.list_buttons();	
        p.list_buttons().get(2).click();	
        p.popup_Tooltip();
        Thread.sleep(400);	
        p.Tooltip_buttons().get(0).click();	
        Thread.sleep(1400);}

        @Test
        public void Home_visit_pending_property_Search() throws IOException, InterruptedException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        Admin_modules_locators ad = new Admin_modules_locators(d);	
        List_slide lsd = new List_slide(d);	
        	
        List<String> propertiesnames = Home_visit_Pending_Module_Access();
        p.property_searchbar().sendKeys(propertiesnames.get(1));	
        Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);	
		ad.Home_visit_pending_properties();	
        String pendingpropname = 	ad.Home_visit_pending_properties().get(0).getText();
        System.out.println(propertiesnames.get(1).equalsIgnoreCase(pendingpropname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");	
        }
        
        
        @Test
        public void Property_Update_Approval_Propertynames() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);	
        	
        Property_Update_Approval_Module_Access();	
        p.property_update_list_loaded();	
        p.Pending_update_property_names();
        IntStream.range(0, p.Pending_update_property_names().size()).forEach(nam->{
        System.out.println("Update Pending Properties are "+p.Pending_update_property_names().get(nam));	
        });
        
        }


}
