package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import Locators.pom.Property_locaters;

public class Property_management extends Admin_Modules_Access_and_check{
	
	//String Property_name=null;
	
	
	@Test
	public void Property_Search(/*String Property_name4*/) throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		
	}}
