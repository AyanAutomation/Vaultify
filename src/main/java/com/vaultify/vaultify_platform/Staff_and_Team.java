package com.vaultify.vaultify_platform;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;

public class Staff_and_Team extends Admin_Modules_Access_and_check{
	
	@Test
	public void Employee_staff_Add() throws InterruptedException{
		
		Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        
        
        
        TeamManagement();
        js.executeScript("arguments[0].scrollIntoView(true);",p.Employee_add_button());
        Thread.sleep(800);
        js.executeScript("window.scrollBy(0,-150)");
        Thread.sleep(800);
        w.until(ExpectedConditions.visibilityOfAllElements(p.Employee_add_button()));
		p.Employee_add_button().click();
		w.until(ExpectedConditions.visibilityOfAllElements(p.pop_up_employeeAdd_Form()));
		a.moveToElement(p.pop_up_employeeAdd_Form()).build().perform();
		Thread.sleep(800);
		js.executeScript("window.scrollBy(0,-150)");
		w.until(ExpectedConditions.visibilityOfAllElements(p.username_field()));
		
		
		
		
	}
	
	

}
