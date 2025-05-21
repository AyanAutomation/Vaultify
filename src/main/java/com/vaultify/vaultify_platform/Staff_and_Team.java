package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;

public class Staff_and_Team extends Admin_Modules_Access_and_check{
	
	@Test(dataProvider="employeedata")
	public void Employee_staff_Add(String username, String password, String fullname, String fathername,
            String mothername, String dob, String email, String phone,
            String qualification, String experience, String doj,
            String accOwner, String bankName, String accNumber,
            String ifsc, String upi) throws InterruptedException, AWTException{
		
		Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	WebDriverWait w = new WebDriverWait(d,Duration.ofSeconds(10));
        JavascriptExecutor js = (JavascriptExecutor)d;
        Robot r = new Robot();
        
        
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
		w.until(ExpectedConditions.visibilityOf(p.username_field()));
		js.executeScript("document.querySelector(\"input[name='username']\").scrollIntoView({ behavior: \"smooth\", block: \"center\" });");
		Thread.sleep(800);
		p.username_field().sendKeys(username);
		w.until(ExpectedConditions.visibilityOf(p.password_field()));
		p.password_field().clear();
		p.username_field().sendKeys(password);
		w.until(ExpectedConditions.visibilityOf(p.Full_Name_feild()));
		p.Full_Name_feild().sendKeys(fullname);
		w.until(ExpectedConditions.visibilityOf(p.father_name()));
		p.father_name().sendKeys(fathername);
		w.until(ExpectedConditions.visibilityOf(p.mother_name()));
		p.mother_name().sendKeys(mothername);
        w.until(ExpectedConditions.visibilityOf(p.email()));
		p.email().sendKeys(email);
		r.mouseWheel(4);
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.phoneNumber()));
		p.phoneNumber().sendKeys(phone);
		w.until(ExpectedConditions.visibilityOf(p.dob()));
		p.dob().sendKeys(dob);
		w.until(ExpectedConditions.visibilityOf(p.dropdown_fields().get(1)));
		p.dropdown_fields().get(1).click();
		w.until(ExpectedConditions.visibilityOfAllElements(p.dropdown_list()));
		w.until(ExpectedConditions.visibilityOf(p.options().get(1)));
		p.options().get(1).click();
		w.until(ExpectedConditions.visibilityOf(p.qualification()));
		p.qualification().sendKeys(qualification);
		w.until(ExpectedConditions.visibilityOf(p.experience()));
		p.experience().sendKeys(experience);
		w.until(ExpectedConditions.visibilityOf(p.date_of_joining()));
		p.date_of_joining().sendKeys(doj);
		r.mouseWheel(3);
		Thread.sleep(800);
		w.until(ExpectedConditions.visibilityOf(p.role_dropdown_field()));
		p.role_dropdown_field().click();
		w.until(ExpectedConditions.visibilityOf(p.dropdown_list().get(0)));
		w.until(ExpectedConditions.visibilityOf(p.options().get(1)));
		p.options().get(1).click();
		w.until(ExpectedConditions.visibilityOf(p.accountOwnerName()));
		p.accountOwnerName().sendKeys(accOwner);
		w.until(ExpectedConditions.visibilityOf(p.bankName()));
		p.bankName().sendKeys(bankName);
		w.until(ExpectedConditions.visibilityOf(p.accountNumber()));
		p.accountNumber().sendKeys(accNumber);
		w.until(ExpectedConditions.visibilityOf(p.ifscCode()));
		p.ifscCode().sendKeys(ifsc);
		w.until(ExpectedConditions.visibilityOf(p.upiId()));
		p.upiId().sendKeys(upi);
		r.mouseWheel(4);
		w.until(ExpectedConditions.visibilityOf(p.submit_button()));
		p.submit_button().click();
		Thread.sleep(800);
		
	}
	
	
	@DataProvider
	public Object[][] employeedata(){
		
		
		Object[][] employee = new Object[][] {{
            "nikolai_ivanov",               // User Name
            "Pass@123",                     // Password
            "Nikolai Ivanov",               // Full Name
            "Sergei Ivanov",                // Father Name
            "Anna Ivanova",                 // Mother Name
            "12-03-1992",                   // Date of Birth
            "nikolai1246@yopmail.com",      // Email
            "7981234567",                   // Phone
            "Engineering",                  // Qualification
            "5",                            // Experience (years)
            "10-02-2022",                   // Date of Joining
            "Nikolai Ivanov",               // Account Owner Name
            "Sberbank Russia",              // Bank Name
            "40817810099910012345",         // Account Number
            "SBER0000111",                  // IFSC Code
            "nikolaiupi1246@ybl"            // UPI ID
        }};
		return employee;
		
		
		
		
	}

}
