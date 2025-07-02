package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Locators.pom.user_module_locaters;

public class Pagination_nextpage_navigation {
	
	
	public void nextpage_navigate(WebDriver d) throws InterruptedException, AWTException{
		
		user_module_locaters p = new user_module_locaters(d); 
		Robot r = new Robot();
		
		System.out.println("navigating to next page in list");
		d.navigate().refresh();
		Thread.sleep(800);
		System.out.println();
		r.mouseWheel(6);
		Thread.sleep(800);
		p.Pagination_change_button();
		Thread.sleep(800);
		p.Pagination_change_button().get(1).click();
		Thread.sleep(800);
		r.mouseWheel(-6);
		Thread.sleep(800);
	}
	
	

}
