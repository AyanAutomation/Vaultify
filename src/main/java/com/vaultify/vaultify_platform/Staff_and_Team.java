package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.TreeMap;
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
	public void Employee_staff_Add(TreeMap<String, String> Empdata) throws InterruptedException, AWTException, IOException{
		
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
		p.username_field().sendKeys(Empdata.get("username"));
		p.password_field();
		p.password_field().clear();
		p.password_field().sendKeys(Empdata.get("password"));
		p.Full_Name_feild();
		p.Full_Name_feild().sendKeys(Empdata.get("fullname"));
		p.father_name();
		p.father_name().sendKeys(Empdata.get("fathername"));
		p.mother_name();
		p.mother_name().sendKeys(Empdata.get("mothername"));
        p.email();
		p.email().sendKeys(Empdata.get("email"));
		r.mouseWheel(4);
		Thread.sleep(800);
        p.phoneNumber().sendKeys(Empdata.get("phone"));
		p.dob();
		p.dob().sendKeys(Empdata.get("dob"));
		p.whatsapp_dropdown();
		p.whatsapp_dropdown().click();
		p.dropdown_list();
		p.options().get(1);
		p.options().get(1).click();
		p.qualification();
		p.qualification().sendKeys(Empdata.get("qualification"));
		p.experience();
		p.experience().sendKeys(Empdata.get("experience"));
		p.date_of_joining();
		p.date_of_joining().sendKeys(Empdata.get("doj"));
		r.mouseWheel(3);
		Thread.sleep(800);
		p.role_dropdown_field();
		p.role_dropdown_field().click();
		p.dropdown_list().get(0);
		p.options().get(1);
		p.options().get(1).click();
		p.accountOwnerName().sendKeys(Empdata.get("accOwner"));
		p.bankName().sendKeys(Empdata.get("bankName"));
		p.accountNumber().sendKeys(Empdata.get("accNumber"));
		p.ifscCode().sendKeys(Empdata.get("ifsc"));
		p.upiId().sendKeys(Empdata.get("upi"));
		r.mouseWheel(4);
		p.submit_button().click();
		Thread.sleep(800);
		p.Employee_add_button();
		p.list_sort_buttons();
		p.first_name_inlist();
		if(!p.first_name_inlist().equals(Empdata.get("username"))){
			
		
	/*	a.doubleClick(p.list_sort_buttons().get(0)).build().perform();
		Thread.sleep(800); */
			
			IntStream.range(0, 1).forEach(i->{
				p.list_sort_buttons().get(0);
				p.list_sort_buttons().get(0).click();
			});}
		p.first_name_inlist();
		System.out.println(p.first_name_inlist().getText().equalsIgnoreCase(Empdata.get("username"))?"Testcase Passed":"Testcase Failed");
	}
	
	
	@DataProvider
	public Object[][] employeedata(){
		
		
		TreeMap<String, String> emp1 = new TreeMap<>();
	    emp1.put("username", "yasmin_rahman");
	    emp1.put("password", "Test@123");
	    emp1.put("fullname", "Yasmin Rahman");
	    emp1.put("fathername", "Rafiqul Rahman");
	    emp1.put("mothername", "Nasima Rahman");
	    emp1.put("dob", "01-01-1990");
	    emp1.put("email", "yasmin.rahman@vaultify.com");
	    emp1.put("phone", "919874563210");
	    emp1.put("qualification", "HR Management");
	    emp1.put("experience", "7");
	    emp1.put("doj", "15-06-2016");
	    emp1.put("accOwner", "Yasmin Rahman");
	    emp1.put("bankName", "HDFC Bank");
	    emp1.put("accNumber", "40817810099910123456");
	    emp1.put("ifsc", "HDFC0001122");
	    emp1.put("upi", "yasminupi@ybl");

	    TreeMap<String, String> emp2 = new TreeMap<>();
	    emp2.put("username", "ali_mahdi");
	    emp2.put("password", "Test@123");
	    emp2.put("fullname", "Ali Mahdi");
	    emp2.put("fathername", "Zahir Mahdi");
	    emp2.put("mothername", "Fatima Mahdi");
	    emp2.put("dob", "10-10-1987");
	    emp2.put("email", "ali.mahdi@vaultify.com");
	    emp2.put("phone", "966509876543");
	    emp2.put("qualification", "IT Support");
	    emp2.put("experience", "9");
	    emp2.put("doj", "01-04-2014");
	    emp2.put("accOwner", "Ali Mahdi");
	    emp2.put("bankName", "Alinma Bank");
	    emp2.put("accNumber", "40817810099910678901");
	    emp2.put("ifsc", "ALIN0000661");
	    emp2.put("upi", "alimahdi@ybl");

	    TreeMap<String, String> emp3 = new TreeMap<>();
	    emp3.put("username", "zoya_parveen");
	    emp3.put("password", "Welcome@1");
	    emp3.put("fullname", "Zoya Parveen");
	    emp3.put("fathername", "Rashid Parveen");
	    emp3.put("mothername", "Shaista Parveen");
	    emp3.put("dob", "05-03-1994");
	    emp3.put("email", "zoya.parveen@vaultify.com");
	    emp3.put("phone", "918334567890");
	    emp3.put("qualification", "Digital Marketing");
	    emp3.put("experience", "5");
	    emp3.put("doj", "10-08-2020");
	    emp3.put("accOwner", "Zoya Parveen");
	    emp3.put("bankName", "Axis Bank");
	    emp3.put("accNumber", "40817810099910099988");
	    emp3.put("ifsc", "UTIB0000234");
	    emp3.put("upi", "zoyaparveen@ybl");

	    TreeMap<String, String> emp4 = new TreeMap<>();
	    emp4.put("username", "daniel_choi");
	    emp4.put("password", "Test@321");
	    emp4.put("fullname", "Daniel Choi");
	    emp4.put("fathername", "Steven Choi");
	    emp4.put("mothername", "Linda Choi");
	    emp4.put("dob", "12-12-1984");
	    emp4.put("email", "daniel.choi@vaultify.com");
	    emp4.put("phone", "821012345678");
	    emp4.put("qualification", "Business Analysis");
	    emp4.put("experience", "11");
	    emp4.put("doj", "05-05-2012");
	    emp4.put("accOwner", "Daniel Choi");
	    emp4.put("bankName", "Kookmin Bank");
	    emp4.put("accNumber", "40817810099910222222");
	    emp4.put("ifsc", "KBKO0000789");
	    emp4.put("upi", "danielchoi@ybl");

	    TreeMap<String, String> emp5 = new TreeMap<>();
	    emp5.put("username", "ananya_ghosh");
	    emp5.put("password", "Pass@ananya");
	    emp5.put("fullname", "Ananya Ghosh");
	    emp5.put("fathername", "Subhendu Ghosh");
	    emp5.put("mothername", "Sharmila Ghosh");
	    emp5.put("dob", "22-08-1992");
	    emp5.put("email", "ananya.ghosh@vaultify.com");
	    emp5.put("phone", "919812345678");
	    emp5.put("qualification", "UI/UX Design");
	    emp5.put("experience", "6");
	    emp5.put("doj", "12-12-2018");
	    emp5.put("accOwner", "Ananya Ghosh");
	    emp5.put("bankName", "Punjab National Bank");
	    emp5.put("accNumber", "40817810099910333444");
	    emp5.put("ifsc", "PUNB0001122");
	    emp5.put("upi", "ananyagh@ybl");

	    TreeMap<String, String> emp6 = new TreeMap<>();
	    emp6.put("username", "rohit_verma");
	    emp6.put("password", "Rohit@321");
	    emp6.put("fullname", "Rohit Verma");
	    emp6.put("fathername", "Suresh Verma");
	    emp6.put("mothername", "Kavita Verma");
	    emp6.put("dob", "03-06-1991");
	    emp6.put("email", "rohit.verma@vaultify.com");
	    emp6.put("phone", "917008765432");
	    emp6.put("qualification", "Project Management");
	    emp6.put("experience", "9");
	    emp6.put("doj", "01-01-2016");
	    emp6.put("accOwner", "Rohit Verma");
	    emp6.put("bankName", "ICICI Bank");
	    emp6.put("accNumber", "40817810099910444555");
	    emp6.put("ifsc", "ICIC0001234");
	    emp6.put("upi", "rohitverma@ybl");

	    return new Object[][] {
	        { emp1 },
	        { emp2 },
	        { emp3 },
	        { emp4 },
	        { emp5 },
	        { emp6 }
	    };}
	
	
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
