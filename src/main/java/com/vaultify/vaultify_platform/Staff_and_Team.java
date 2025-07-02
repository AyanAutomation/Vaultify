package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Property_locaters;

public class Staff_and_Team extends Admin_Modules_Access_and_check{
	
	String search_result;
	
	@Test(dataProvider="employeedata")
	public void Employee_staff_Add(String username, String password, String fullname, String fathername,
            String mothername, String dob, String email, String phone,
            String qualification, String experience, String doj,
            String accOwner, String bankName, String accNumber,
            String ifsc, String upi) throws InterruptedException, AWTException, IOException{
		
		Admin_modules_locators p = new Admin_modules_locators(d);
    	Actions a = new Actions(d);
    	
        JavascriptExecutor js = (JavascriptExecutor)d;
        Robot r = new Robot();
        
        
        TeamManagement();
        Thread.sleep(800);	
        js.executeScript("arguments[0].scrollIntoView(true);",p.Employee_add_button());
	    Thread.sleep(800);
	    js.executeScript("window.scrollBy(0,-150)");
        p.Employee_add_button();
        p.Employee_add_button().click();
		p.pop_up_employeeAdd_Form();
		a.moveToElement(p.pop_up_employeeAdd_Form()).build().perform();
		Thread.sleep(800);
		js.executeScript("window.scrollBy(0,-150)");
		p.username_field();
		js.executeScript("document.querySelector(\"input[name='username']\").scrollIntoView({ behavior: \"smooth\", block: \"center\" });");
		Thread.sleep(800);
		p.username_field().sendKeys(username);
		p.password_field();
		p.password_field().clear();
		p.password_field().sendKeys(password);
		p.Full_Name_feild();
		p.Full_Name_feild().sendKeys(fullname);
		p.father_name();
		p.father_name().sendKeys(fathername);
		p.mother_name();
		p.mother_name().sendKeys(mothername);
        p.email();
		p.email().sendKeys(email);
		r.mouseWheel(4);
		Thread.sleep(800);
        p.phoneNumber().sendKeys(phone);
		p.dob();
		p.dob().sendKeys(dob);
		p.whatsapp_dropdown();
		p.whatsapp_dropdown().click();
		p.dropdown_list();
		p.options().get(1);
		p.options().get(1).click();
		p.qualification();
		p.qualification().sendKeys(qualification);
		p.experience();
		p.experience().sendKeys(experience);
		p.date_of_joining();
		p.date_of_joining().sendKeys(doj);
		r.mouseWheel(3);
		Thread.sleep(800);
		p.role_dropdown_field();
		p.role_dropdown_field().click();
		p.dropdown_list().get(0);
		p.options().get(1);
		p.options().get(1).click();
		p.accountOwnerName().sendKeys(accOwner);
		p.bankName().sendKeys(bankName);
		p.accountNumber().sendKeys(accNumber);
		p.ifscCode().sendKeys(ifsc);
		p.upiId().sendKeys(upi);
		r.mouseWheel(4);
		p.submit_button().click();
		Thread.sleep(800);
		p.Employee_add_button();
		p.list_sort_buttons();
		p.first_name_inlist();
		if(!p.first_name_inlist().equals(username)){
			
		
	/*	a.doubleClick(p.list_sort_buttons().get(0)).build().perform();
		Thread.sleep(800); */
			
			IntStream.range(0, 1).forEach(i->{
				p.list_sort_buttons().get(0);
				p.list_sort_buttons().get(0).click();
			});}
		p.first_name_inlist();
		System.out.println(p.first_name_inlist().getText().equalsIgnoreCase(username)?"Testcase Passed":"Testcase Failed");
	}
	
	
	@DataProvider
	public Object[][] employeedata(){
		
		
		Object[][] employee = new Object[][] { /*{
            "staff_raj_kumar", "Pass@123", "Staff Raj Kumar", "Staff Ramesh Kumar", "Staff Sita Kumari",
            "15-08-1990", "rajkumar8754@yopmail.com", "919810112233", "Finance", "6",
            "12-07-2018", "Staff Raj Kumar", "State Bank of India", "40817810099910011111", "SBIN0000123", "rajupi8754@ybl"
        },*/
	    {
	        "dmitri_petrov", "Pass@123", "Dmitri Petrov", "Alexei Petrov", "Irina Petrova",
	        "22-11-1988", "dmitripetrov2048@yopmail.com", "79213456789", "Engineering", "10",
	        "10-03-2015", "Dmitri Petrov", "VTB Bank", "40817810099910087653", "VTBR0000222", "dmitriupi2048@ybl"
	    },/*
	    {
	        "hassan_alkurdi", "Pass@123", "Hassan Alkurdi", "Mustafa Alkurdi", "Noor Alkurdi",
	        "05-05-1991", "hassankurdi3127@yopmail.com", "966501234567", "Logistics", "6",
	        "01-07-2019", "Hassan Alkurdi", "Al Rajhi Bank", "40817810099910023984", "ALRJ0000789", "hassanupi3127@ybl"
	    },
	    {
	        "felix_kraus", "Pass@123", "Felix Kraus", "Gunter Kraus", "Sabine Kraus",
	        "09-09-1985", "felixkraus6221@yopmail.com", "491711223344", "Data Science", "12",
	        "12-08-2010", "Felix Kraus", "Deutsche Bank", "40817810099910098765", "DEUT0001234", "felixupi6221@ybl"
	    },
	    {
	        "marco_rossi", "Pass@123", "Marco Rossi", "Giovanni Rossi", "Lucia Rossi",
	        "27-04-1989", "marcorossi7856@yopmail.com", "393445678912", "Architecture", "8",
	        "25-06-2017", "Marco Rossi", "Intesa Sanpaolo", "40817810099910032100", "ISPB0000999", "marcoupi7856@ybl"
	    },
	    {
	        "fahad_najeeb", "Pass@123", "Fahad Najeeb", "Najeeb Ul Hassan", "Ruqayya Najeeb",
	        "14-02-1993", "fahadnajeeb4082@yopmail.com", "971502234556", "Computer Science", "4",
	        "19-09-2021", "Fahad Najeeb", "First Abu Dhabi Bank", "40817810099910077889", "FABU0000455", "fahadupi4082@ybl"
	    }*/};
		return employee;}
	
	
	       @Test
	       public void employeesearch() throws InterruptedException, IOException, AWTException{
		
		   Admin_modules_locators p = new Admin_modules_locators(d);
		   JavascriptExecutor js = (JavascriptExecutor)d;
		   Property_locaters pp = new Property_locaters(d);
		   
		   
		   
		    List <String> names= TeamManagement();
	        js.executeScript("arguments[0].scrollIntoView(true);",p.employee_search_button());
	        Thread.sleep(800);
	        js.executeScript("window.scrollBy(0,-150)");
	        Thread.sleep(800);
	        p.employee_search_button();
		    p.employee_search_button().sendKeys(names.get(5));
		    pp.Search_button().click();
		    Thread.sleep(1200);
		    search_result= pp.property_listNames().get(0).getText();
		    System.out.println(names.get(5).equalsIgnoreCase(search_result) ? "Testcase passed "+search_result+" name shown in search result ": "Testcase passed"+search_result+" name not shown in search result " );
		
		
	}

}
