package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;

import Locators.pom.user_module_locaters;

public class user_module extends Property_management{
	
	
	public void user_Search() throws InterruptedException, IOException, AWTException{
		
		user_module_locaters p = new user_module_locaters(d);
		
		UserManagement();
		
		
		
	}
	
	

}
