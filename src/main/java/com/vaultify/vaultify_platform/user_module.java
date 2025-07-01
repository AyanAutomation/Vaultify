package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.util.List;
import java.io.IOException;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;

import Locators.pom.Property_locaters;
import Locators.pom.user_module_locaters;

public class user_module extends Property_management{
	
	
	public void user_Search() throws InterruptedException, IOException, AWTException{
		
		user_module_locaters pp = new user_module_locaters(d);
		Property_locaters p = new Property_locaters(d);
		TreeSet<String> tst = new TreeSet<String>();
		
		UserManagement();
		pp.user_searchbar();
		List <WebElement> usernames_in_List = p.property_listNames();
		for(WebElement username:usernames_in_List){
			System.out.println(username.getText());
			System.out.println();
			tst.add(username.getText());
			}
		pp.user_searchbar().sendKeys(tst.last());
		pp.Search_button();
		Thread.sleep(1000);
		System.out.println(usernames_in_List.get(0).getText().equalsIgnoreCase(tst.last()) ? " Testcase passed Search working "+ usernames_in_List.get(0).getText() +" shown in result":"Testcase failed Search not working "+ usernames_in_List.get(0).getText() +" not shown in result" );
	
	}
	
	

}
