package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Login_locaters;
import Locators.pom.Property_locaters;
import Locators.pom.Staff_employee_locators;

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
		p.role_dropdown_field().click();;
		p.dropdown_list().get(0);
		p.options().get(0);
		p.options().get(0).click();
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

		
		Object[][] roleData = role_data();
		
		TreeMap<String, String> emp1 = new TreeMap<>();
		emp1.put("username", "emiliakapoor");
		emp1.put("password", "Emilia@2025");
		emp1.put("fullname", "Emilia Kapoor");
		emp1.put("fathername", "Rajan Kapoor");
		emp1.put("mothername", "Sunita Kapoor");
		emp1.put("dob", "03/19/1992");
		emp1.put("email", "emilia.kapoor@vaultify.com");
		emp1.put("phone", "919800112233");
		emp1.put("qualification", "Risk Analyst");
		emp1.put("experience", "4");
		emp1.put("doj", "02-02-2021");
		emp1.put("accOwner", "Emilia Kapoor");
		emp1.put("bankName", "ICICI Bank");
		emp1.put("accNumber", "40817810099913334455");
		emp1.put("ifsc", "ICIC0000876");
		emp1.put("upi", "emiliakapoor@ybl");

		TreeMap<String, String> emp2 = new TreeMap<>();
		emp2.put("username", "yusufibrahim");
		emp2.put("password", "Yusuf@999");
		emp2.put("fullname", "Yusuf Ibrahim");
		emp2.put("fathername", "Naseer Ibrahim");
		emp2.put("mothername", "Fatima Ibrahim");
		emp2.put("dob", "07/23/1985");
		emp2.put("email", "yusuf.ibrahim@vaultify.com");
		emp2.put("phone", "966590998877");
		emp2.put("qualification", "Operations Manager");
		emp2.put("experience", "12");
		emp2.put("doj", "12-11-2012");
		emp2.put("accOwner", "Yusuf Ibrahim");
		emp2.put("bankName", "Al Rajhi Bank");
		emp2.put("accNumber", "40817810099914445666");
		emp2.put("ifsc", "RAJH0000456");
		emp2.put("upi", "yusufibrahim@ybl");

		TreeMap<String, String> emp3 = new TreeMap<>();
		emp3.put("username", "sofiaandersson");
		emp3.put("password", "Sofia@2024");
		emp3.put("fullname", "Sofia Andersson");
		emp3.put("fathername", "Lars Andersson");
		emp3.put("mothername", "Eva Andersson");
		emp3.put("dob", "12/11/1994");
		emp3.put("email", "sofia.andersson@vaultify.com");
		emp3.put("phone", "467089123456");
		emp3.put("qualification", "UX Designer");
		emp3.put("experience", "6");
		emp3.put("doj", "01-08-2018");
		emp3.put("accOwner", "Sofia Andersson");
		emp3.put("bankName", "Swedbank");
		emp3.put("accNumber", "40817810099915556777");
		emp3.put("ifsc", "SWED0000987");
		emp3.put("upi", "sofiaandersson@ybl");

		TreeMap<String, String> emp4 = new TreeMap<>();
		emp4.put("username", "naveenmukherjee");
		emp4.put("password", "Naveen@007");
		emp4.put("fullname", "Naveen Mukherjee");
		emp4.put("fathername", "Subhash Mukherjee");
		emp4.put("mothername", "Arpita Mukherjee");
		emp4.put("dob", "06/05/1990");
		emp4.put("email", "naveen.mukherjee@vaultify.com");
		emp4.put("phone", "918888776655");
		emp4.put("qualification", "DevOps Engineer");
		emp4.put("experience", "7");
		emp4.put("doj", "10-10-2016");
		emp4.put("accOwner", "Naveen Mukherjee");
		emp4.put("bankName", "Axis Bank");
		emp4.put("accNumber", "40817810099916667888");
		emp4.put("ifsc", "UTIB0000432");
		emp4.put("upi", "naveenmukherjee@ybl");

		TreeMap<String, String> emp5 = new TreeMap<>();
		emp5.put("username", "elenagonzalez");
		emp5.put("password", "Elena@321");
		emp5.put("fullname", "Elena Gonzalez");
		emp5.put("fathername", "Rafael Gonzalez");
		emp5.put("mothername", "Isabel Gonzalez");
		emp5.put("dob", "01/15/1991");
		emp5.put("email", "elena.gonzalez@vaultify.com");
		emp5.put("phone", "525512349876");
		emp5.put("qualification", "HR Generalist");
		emp5.put("experience", "8");
		emp5.put("doj", "18-04-2015");
		emp5.put("accOwner", "Elena Gonzalez");
		emp5.put("bankName", "Santander Mexico");
		emp5.put("accNumber", "40817810099917778999");
		emp5.put("ifsc", "SANT0000667");
		emp5.put("upi", "elenagonzalez@ybl");

		TreeMap<String, String> emp6 = new TreeMap<>();
		emp6.put("username", "faizaanqureshi");
		emp6.put("password", "Faizaan@123");
		emp6.put("fullname", "Faizaan Qureshi");
		emp6.put("fathername", "Javed Qureshi");
		emp6.put("mothername", "Shabana Qureshi");
		emp6.put("dob", "09/28/1987");
		emp6.put("email", "faizaan.qureshi@vaultify.com");
		emp6.put("phone", "971505556677");
		emp6.put("qualification", "Business Intelligence Analyst");
		emp6.put("experience", "10");
		emp6.put("doj", "05-07-2013");
		emp6.put("accOwner", "Faizaan Qureshi");
		emp6.put("bankName", "Emirates NBD");
		emp6.put("accNumber", "40817810099918899000");
		emp6.put("ifsc", "ENBD0000111");
		emp6.put("upi", "faizaanqureshi@ybl");

        
		
		
		// Injecting corresponding rolenames from role_data()
		
		
	    TreeMap<String, String>[] emps = new TreeMap[] { emp1, emp2, emp3, emp4, emp5, emp6 };

	    for (int i = 0; i < emps.length; i++) {
	        @SuppressWarnings("unchecked")
	        TreeMap<String, String> roleMap = (TreeMap<String, String>) roleData[i][0];
	        emps[i].put("rolename", roleMap.get("rolename")); 
	        
	        // Inject only rolename
	        
	        // If needed: emps[i].put("roledescription", roleMap.get("description"));
	    }

	

	    return new Object[][] {
	        { emp1 },
	        { emp2 },
	        { emp3 },
	        { emp4 },
	        { emp5 },
	        { emp6 }
	    };
	}
         
	
	
	 @DataProvider
     public Object[][] role_data() {

         TreeMap<String, String> role1 = new TreeMap<>();
         role1.put("rolename", "Support Ticket Analyst");
         role1.put("description", "Monitors, categorizes, and resolves user support tickets efficiently.");

         TreeMap<String, String> role2 = new TreeMap<>();
         role2.put("rolename", "Lead Generation Coordinator");
         role2.put("description", "Responsible for sourcing, filtering, and tagging potential leads across campaigns.");

         TreeMap<String, String> role3 = new TreeMap<>();
         role3.put("rolename", "Referral Program Analyst");
         role3.put("description", "Oversees referral logic, linking, and tracking reward validations.");

         TreeMap<String, String> role4 = new TreeMap<>();
         role4.put("rolename", "Document Verification Officer");
         role4.put("description", "Validates uploaded KYC/property/legal documents for system approval.");

         TreeMap<String, String> role5 = new TreeMap<>();
         role5.put("rolename", "Training Content Admin");
         role5.put("description", "Manages onboarding and training module uploads for facilitators and staff.");

         TreeMap<String, String> role6 = new TreeMap<>();
         role6.put("rolename", "ATS Compliance Checker");
         role6.put("description", "Ensures property uploads and staff actions align with ATS approval guidelines.");

         TreeMap<String, String> role7 = new TreeMap<>();
         role7.put("rolename", "Geo Mapping Assistant");
         role7.put("description", "Coordinates property geolocation inputs with satellite/map integration.");

         TreeMap<String, String> role8 = new TreeMap<>();
         role8.put("rolename", "Digital Signature Manager");
         role8.put("description", "Assigns and maintains staff-level digital document signing rights.");

         TreeMap<String, String> role9 = new TreeMap<>();
         role9.put("rolename", "Seller Relations Associate");
         role9.put("description", "Communicates with sellers, ensuring required uploads and payments are complete.");

         TreeMap<String, String> role10 = new TreeMap<>();
         role10.put("rolename", "Property Audit Reviewer");
         role10.put("description", "Checks uploaded property photos/videos for compliance before approval.");

         return new Object[][] { 
             { role1 },
             { role2 },
             { role3 },
             { role4 },
             { role5 }, 
             { role6 },
             { role7 },
             { role8 },
             { role9 },
             { role10} 
         };}


	
	
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
	    	   
	    	   
	    	   
	       }}



      class Roles extends Staff_and_Team{
    	  
    	  
    	  
    	  TreeMap<String,List<WebElement>> Permission_modules_name_Buttons = new TreeMap<String,List<WebElement>>();
    	  List<String> Module_names =new ArrayList<String>();
    	  List<WebElement> one_five_buttons = new ArrayList<WebElement>();
    	  List<WebElement> five_ten_buttons = new ArrayList<WebElement>();
    	  List<WebElement> ten_to_fifteen_buttons = new ArrayList<WebElement>();
    	  List<WebElement> cms_buttons = new ArrayList<WebElement>();
    	  List<WebElement> versity_buttons = new ArrayList<WebElement>();
    	  
    	  
       @Test(dataProvider ="role_data")	  
       public void role_add(TreeMap<String,String> role_Datas)throws InterruptedException, IOException, AWTException{
    	
    	   JavascriptExecutor js = (JavascriptExecutor)d;   
    	   Staff_employee_locators st = new Staff_employee_locators(d);
    	   Admin_modules_locators p = new Admin_modules_locators(d);
    	   Actions a = new Actions(d);
    	   Login_locaters po = new Login_locaters(d);
    	   
    	   
    	   TeamManagement(); 
    	   st.add_role_button();
    	   Thread.sleep(800);
    	   js.executeScript("arguments[0].scrollIntoView(true);",st.add_role_button());
    	   Thread.sleep(800);
    	   Thread.sleep(800);
 		   js.executeScript("window.scrollBy(0,-150)");
 		   Thread.sleep(800);
    	   st.add_role_button();
    	   st.add_role_button().click();
    	   Thread.sleep(800);
    	   p.pop_up_employeeAdd_Form();
   		   a.moveToElement(p.pop_up_employeeAdd_Form()).build().perform();
   		   st.Role_Name_field().sendKeys(role_Datas.get("rolename"));
   		   st.Role_Description_Feild().sendKeys(role_Datas.get("description"));
   		   Thread.sleep(800);
   		   js.executeScript("window.scrollBy(0,200)");
   		   Thread.sleep(800); 
   		   st.Dropdowns();
   		   st.Dropdowns().get(0).click();
   		   st.Dropdown_list();
   		   st.dropdown_OPTIONS();
   		   st.dropdown_OPTIONS().get(0).click();
   		   st.Dropdowns();
 		   st.Dropdowns().get(1).click();
 		   st.Dropdown_list();
 		   st.dropdown_OPTIONS();
 		   st.dropdown_OPTIONS().get(0).click();
 		   Thread.sleep(800);
 		   st.Permission_Section_rows();
 		   Thread.sleep(800);
 		   js.executeScript("arguments[0].scrollIntoView(true);",st.Permission_Section_rows().get(0));
 		   Thread.sleep(800);
 		   js.executeScript("window.scrollBy(0,-150)");
 		   Thread.sleep(800);
 		   st.permission_module_Buttons();
   		   IntStream.range(0, 16).forEach(b->{
   				   if(b==1) {
   					Module_names.add(st.permission_module_names().get(b).getText());
   					}
   				   if(b<5){
   					one_five_buttons.add(st.permission_module_Buttons().get(b));
    			}
   				  if(b==2) {
     					Module_names.add(st.permission_module_names().get(b).getText());
     					;}
   				if(b>4&&b<10){
   					five_ten_buttons.add(st.permission_module_Buttons().get(b));
    				}
   				if(b==3) {
 					Module_names.add(st.permission_module_names().get(b).getText());
 					;}
   				if(b>9&&b<15){
   					ten_to_fifteen_buttons.add(st.permission_module_Buttons().get(b));
    				}
   		   });
		   Permission_modules_name_Buttons.put(Module_names.get(0), one_five_buttons);
		   Permission_modules_name_Buttons.put(Module_names.get(1), five_ten_buttons);
		   Permission_modules_name_Buttons.put(Module_names.get(2), ten_to_fifteen_buttons);
    	  
    	cms_buttons = Permission_modules_name_Buttons.get("CMS");
    	versity_buttons = Permission_modules_name_Buttons.get("Vaultify Versity");
    	
    	for(WebElement eachcmsbutton:cms_buttons){
    		eachcmsbutton.click();
    		Thread.sleep(400);}
    	for(WebElement eachversity_button:versity_buttons){
    		eachversity_button.click();
    		Thread.sleep(400);}
    	    Thread.sleep(800);
		   js.executeScript("arguments[0].scrollIntoView(true);",st.form_submit_button());
		   Thread.sleep(800);
		   js.executeScript("window.scrollBy(0,-150)");  
		   Thread.sleep(800);
		   st.form_submit_button().click();
		   
		   po.success_Toast();
	       System.out.println(po.success_Toast().getText());
	       System.out.println();
		   clear_all_collections();
	       //Employee_staff_Add();
      }
       
      
      

      
      @Test(dataProvider="role_data")
      public void delete_role(TreeMap<String, String> role)throws InterruptedException, IOException, AWTException{
    	  
       JavascriptExecutor js = (JavascriptExecutor)d;   
   	   Staff_employee_locators st = new Staff_employee_locators(d);
   	   Login_locaters p = new Login_locaters(d);
    	  
   	    TeamManagement();
        Thread.sleep(800);
        js.executeScript("arguments[0].scrollIntoView(true);",st.roles(role.get("rolename")));
		Thread.sleep(800);
		js.executeScript("window.scrollBy(0,-150)"); 
		Thread.sleep(800);
    	st.three_dot_dash_button(role.get("rolename")).click();
    	Thread.sleep(800);
    	st.role_remove_option();
    	Thread.sleep(800); 
    	st.role_remove_option().click();
    	Thread.sleep(1800); 
    /*	p.success_Toast();
    	System.out.println(p.success_Toast().getText());
    	System.out.println(); */
      }
      
      @Test
      public void clear_all_collections(){
    	  
       
       Permission_modules_name_Buttons.clear();
       if(Permission_modules_name_Buttons.size()==0){
       System.out.println("Permission_modules_name_Buttons cleared");
       System.out.println();}
   	   Module_names.clear();
   	   if(Module_names.size()==0){
        System.out.println("Module_names cleared");
        System.out.println();}
   	   one_five_buttons.clear();
   	   if(one_five_buttons.size()==0){
        System.out.println("one_five_buttons cleared");
        System.out.println();}
   	   five_ten_buttons.clear();
   	   if(five_ten_buttons.size()==0){
        System.out.println("five_ten_buttons cleared");
        System.out.println();}
   	   ten_to_fifteen_buttons.clear();
   	   if(ten_to_fifteen_buttons.size()==0){
        System.out.println("ten_to_fifteen_buttons cleared");
        System.out.println();}
   	   cms_buttons.clear();
   	   if(cms_buttons.size()==0){
        System.out.println("Permission_modules_name_Buttons cleared");
        System.out.println();}
   	    versity_buttons.clear();
   	   if(versity_buttons.size()==0){
        System.out.println("versity_buttons cleared");
        System.out.println();}}
      
      
      
      
      
      @Test(dataProvider="employeedata")
      public void admin_employee_add(TreeMap<String, String> employee)
    		  throws InterruptedException, IOException, AWTException{
    	  
    	
    			
    			Admin_modules_locators p = new Admin_modules_locators(d);
    	    	Actions a = new Actions(d);
    	    	JavascriptExecutor js = (JavascriptExecutor)d;
    	        Robot r = new Robot();
    	        Staff_employee_locators st = new Staff_employee_locators(d);
    	        
    	        TeamManagement(); 
    	    	   st.Admin_user_Add_Button();
    	    	   Thread.sleep(800);
    	    	   js.executeScript("arguments[0].scrollIntoView(true);",st.Admin_user_Add_Button());
    	    	   Thread.sleep(800);
    	    	   Thread.sleep(800);
    		    js.executeScript("window.scrollBy(0,-250)");
    	        st.Admin_user_Add_Button();
    	        st.Admin_user_Add_Button().click();
    			p.pop_up_employeeAdd_Form();
    			a.moveToElement(p.pop_up_employeeAdd_Form()).build().perform();
    			Thread.sleep(800);
    			js.executeScript("window.scrollBy(0,-150)");
    			p.username_field();
    			js.executeScript("document.querySelector(\"input[name='username']\").scrollIntoView({ behavior: \"smooth\", block: \"center\" });");
    			Thread.sleep(800);
    			p.username_field().sendKeys(employee.get("username"));
    			p.password_field();
    			p.password_field().clear();
    			p.password_field().sendKeys(employee.get("password"));
    			p.Full_Name_feild();
    			p.Full_Name_feild().sendKeys(employee.get("fullname"));
    			p.father_name();
    			p.father_name().sendKeys(employee.get("fathername"));
    			p.mother_name();
    			p.mother_name().sendKeys(employee.get("mothername"));
    	        p.email();
    			p.email().sendKeys(employee.get("email"));
    			r.mouseWheel(4);
    			Thread.sleep(800);
    	        p.phoneNumber().sendKeys(employee.get("phone"));
    			p.dob();
    			p.dob().sendKeys(employee.get("dob"));
    			p.whatsapp_dropdown();
    			p.whatsapp_dropdown().click();
    			p.dropdown_list();
    			p.options().get(1);
    			p.options().get(1).click();
    			p.qualification();
    			p.qualification().sendKeys(employee.get("qualification"));
    			p.experience();
    			p.experience().sendKeys(employee.get("experience"));
    			p.date_of_joining();
    			p.date_of_joining().sendKeys(employee.get("doj"));
    			r.mouseWheel(3);
    			Thread.sleep(800);
    			p.role_dropdown_field();
    			p.role_dropdown_field().click();
    			p.dropdown_list().get(0);
    			List<WebElement> role_Options = p.options();
    			
    			for(WebElement role_Option : role_Options){
    				
    				if(role_Option.getText().trim().equalsIgnoreCase(employee.get("rolename"))){
    					
    					role_Option.click();
    					Thread.sleep(800);
    					break;}
    			}
    			p.accountOwnerName().sendKeys(employee.get("accOwner"));
    			p.bankName().sendKeys(employee.get("bankName"));
    			p.accountNumber().sendKeys(employee.get("accNumber"));
    			p.ifscCode().sendKeys(employee.get("ifsc"));
    			p.upiId().sendKeys(employee.get("upi"));
    			r.mouseWheel(4);
    			p.submit_button().click();
    			Thread.sleep(800);
    			p.Employee_add_button();
    			p.list_sort_buttons();
    			p.first_name_inlist();
    			if(!p.first_name_inlist().getText().equalsIgnoreCase(employee.get("username"))){
    				
    			
    		/*	a.doubleClick(p.list_sort_buttons().get(0)).build().perform();
    			Thread.sleep(800); */
    				
    				IntStream.range(0, 1).forEach(i->{
    					p.list_sort_buttons().get(0);
    					p.list_sort_buttons().get(0).click();
    				});}
    			p.first_name_inlist();
    			System.out.println(p.first_name_inlist().getText().equalsIgnoreCase(employee.get("username"))?"Testcase Passed":"Testcase Failed");
    		}
    	  
    	  
    	  
    	  
    	  
    	  
    	  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      }


