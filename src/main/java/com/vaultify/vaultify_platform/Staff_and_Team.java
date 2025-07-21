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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Property_locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
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
	    js.executeScript("window.scrollBy(0,-250)");
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
		if(!p.first_name_inlist().getText().equalsIgnoreCase(Empdata.get("username"))){
			
		
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
	public Object[][] employeedata() {

	    TreeMap<String, String> emp1 = new TreeMap<>();
	    emp1.put("username", "leila_hassan");
	    emp1.put("password", "Leila@2024");
	    emp1.put("fullname", "Leila Hassan");
	    emp1.put("fathername", "Faisal Hassan");
	    emp1.put("mothername", "Amina Hassan");
	    emp1.put("dob", "07-05-1990");
	    emp1.put("email", "leila.hassan@vaultify.com");
	    emp1.put("phone", "966530987654");
	    emp1.put("qualification", "Procurement Specialist");
	    emp1.put("experience", "6");
	    emp1.put("doj", "14-09-2017");
	    emp1.put("accOwner", "Leila Hassan");
	    emp1.put("bankName", "Bank AlJazira");
	    emp1.put("accNumber", "40817810099911777001");
	    emp1.put("ifsc", "BAJA0000117");
	    emp1.put("upi", "leilahassan@ybl");

	    TreeMap<String, String> emp2 = new TreeMap<>();
	    emp2.put("username", "kenji_suzuki");
	    emp2.put("password", "Kenji@888");
	    emp2.put("fullname", "Kenji Suzuki");
	    emp2.put("fathername", "Takeshi Suzuki");
	    emp2.put("mothername", "Yoko Suzuki");
	    emp2.put("dob", "18-11-1986");
	    emp2.put("email", "kenji.suzuki@vaultify.com");
	    emp2.put("phone", "819012345678");
	    emp2.put("qualification", "Systems Analyst");
	    emp2.put("experience", "10");
	    emp2.put("doj", "12-06-2014");
	    emp2.put("accOwner", "Kenji Suzuki");
	    emp2.put("bankName", "Mizuho Bank");
	    emp2.put("accNumber", "40817810099911888002");
	    emp2.put("ifsc", "MIZU0000890");
	    emp2.put("upi", "kenjisuzuki@ybl");

	    TreeMap<String, String> emp3 = new TreeMap<>();
	    emp3.put("username", "luisa_gutierrez");
	    emp3.put("password", "Luisa@2023");
	    emp3.put("fullname", "Luisa Gutierrez");
	    emp3.put("fathername", "Carlos Gutierrez");
	    emp3.put("mothername", "Rosa Gutierrez");
	    emp3.put("dob", "25-08-1993");
	    emp3.put("email", "luisa.gutierrez@vaultify.com");
	    emp3.put("phone", "573012345678");
	    emp3.put("qualification", "Customer Success Manager");
	    emp3.put("experience", "5");
	    emp3.put("doj", "01-01-2020");
	    emp3.put("accOwner", "Luisa Gutierrez");
	    emp3.put("bankName", "Bancolombia");
	    emp3.put("accNumber", "40817810099911999003");
	    emp3.put("ifsc", "BANC0000765");
	    emp3.put("upi", "luisagutierrez@ybl");

	    TreeMap<String, String> emp4 = new TreeMap<>();
	    emp4.put("username", "omar_elkhatib");
	    emp4.put("password", "Omar@2024");
	    emp4.put("fullname", "Omar ElKhatib");
	    emp4.put("fathername", "Nabil ElKhatib");
	    emp4.put("mothername", "Salma ElKhatib");
	    emp4.put("dob", "12-12-1988");
	    emp4.put("email", "omar.elkhatib@vaultify.com");
	    emp4.put("phone", "201113334455");
	    emp4.put("qualification", "Data Engineer");
	    emp4.put("experience", "9");
	    emp4.put("doj", "09-07-2016");
	    emp4.put("accOwner", "Omar ElKhatib");
	    emp4.put("bankName", "Banque Misr");
	    emp4.put("accNumber", "40817810099912000123");
	    emp4.put("ifsc", "BMIS0000451");
	    emp4.put("upi", "omarelkhatib@ybl");

	    TreeMap<String, String> emp5 = new TreeMap<>();
	    emp5.put("username", "maria_vasquez");
	    emp5.put("password", "Maria@123");
	    emp5.put("fullname", "Maria Vasquez");
	    emp5.put("fathername", "Juan Vasquez");
	    emp5.put("mothername", "Claudia Vasquez");
	    emp5.put("dob", "10-04-1991");
	    emp5.put("email", "maria.vasquez@vaultify.com");
	    emp5.put("phone", "5215512345678");
	    emp5.put("qualification", "Legal Associate");
	    emp5.put("experience", "7");
	    emp5.put("doj", "16-10-2017");
	    emp5.put("accOwner", "Maria Vasquez");
	    emp5.put("bankName", "BBVA Bancomer");
	    emp5.put("accNumber", "40817810099912111234");
	    emp5.put("ifsc", "BBVB0000771");
	    emp5.put("upi", "mariavasquez@ybl");

	    TreeMap<String, String> emp6 = new TreeMap<>();
	    emp6.put("username", "rashid_salim");
	    emp6.put("password", "Rashid@001");
	    emp6.put("fullname", "Rashid Salim");
	    emp6.put("fathername", "Younus Salim");
	    emp6.put("mothername", "Samira Salim");
	    emp6.put("dob", "03-03-1990");
	    emp6.put("email", "rashid.salim@vaultify.com");
	    emp6.put("phone", "971556612233");
	    emp6.put("qualification", "QA Automation Engineer");
	    emp6.put("experience", "8");
	    emp6.put("doj", "22-08-2015");
	    emp6.put("accOwner", "Rashid Salim");
	    emp6.put("bankName", "Dubai Islamic Bank");
	    emp6.put("accNumber", "40817810099912222345");
	    emp6.put("ifsc", "DUBA0000123");
	    emp6.put("upi", "rashidsalim@ybl");

	    return new Object[][] {
	        { emp1 },
	        { emp2 },
	        { emp3 },
	        { emp4 },
	        { emp5 },
	        { emp6 }
	    };
	}



	
	
	       @Test(dataProvider="employeedata")
	       public void employeesearch(TreeMap<String, String> Empdata) throws InterruptedException, IOException, AWTException{
		
		   Admin_modules_locators p = new Admin_modules_locators(d);
		   JavascriptExecutor js = (JavascriptExecutor)d;
		   Property_locaters pp = new Property_locaters(d);
		   
		    TeamManagement();
	        js.executeScript("arguments[0].scrollIntoView(true);",p.employee_search_button());
	        Thread.sleep(800);
	        js.executeScript("window.scrollBy(0,-150)");
	        Thread.sleep(800);
	        p.employee_search_button();
		    p.employee_search_button().sendKeys(Empdata.get("phone"));
		    pp.Search_button().click();
		    Thread.sleep(1200);
		    search_result= pp.Employee_staff_list_phnumbers().get(0).getText();
		    System.out.println(Empdata.get("phone").equalsIgnoreCase(search_result) ? "Testcase passed "+search_result+" name shown in search result ": "Testcase passed"+search_result+" name not shown in search result " );}

	       
	       
	       @Test
	       public void employee_delete() throws InterruptedException, IOException, AWTException{
	    	   
	    	Admin_modules_locators p = new Admin_modules_locators(d);  
	    	JavascriptExecutor js = (JavascriptExecutor)d;   
	    	Property_locaters pp = new Property_locaters(d);
	    	   
	        TeamManagement();   
	        js.executeScript("arguments[0].scrollIntoView(true);",p.employee_search_button());
	        Thread.sleep(800);
	        js.executeScript("window.scrollBy(0,250)");   
	        Thread.sleep(800);   
	        pp.list_Delete_buttons();	
	        js.executeScript("arguments[0].scrollIntoView(true);",pp.list_Delete_buttons().get(1));
	        pp.list_Delete_buttons().get(2).click();	
	        pp.popup_Tooltip();
	        Thread.sleep(400);	
	        pp.Tooltip_buttons().get(0).click();	
	        Thread.sleep(1400);  
	    	   
	    	   
	    	   
	       }
	       
	       
	       
	       
	       
	       
	       
}
