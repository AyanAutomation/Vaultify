package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Property_locaters;

public class Property_management extends Admin_Modules_Access_and_check{
	
	
	public String Resultant_propertyname;
	public List<WebElement> rolespresent;
	public List<WebElement> employeepresent_in_eachroles;
	
	@Test
	public void Property_Search() throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		TreeSet <String> tree = new TreeSet();
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		tree = Pagination_change();
		System.out.println("Extracted Property Names =  "+tree);
		System.out.println();
		p.property_searchbar().sendKeys(tree.last());
		Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);
		String propertynamelabel= p.property_listNames().get(0).getText();
    	String[] propertynamelabel_split = propertynamelabel.split(": ");
		Resultant_propertyname = propertynamelabel_split[1];
		System.out.println(tree.last().equalsIgnoreCase(Resultant_propertyname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");
		System.out.println();
		//propertydelete();
		}
	
    public TreeSet<String> Pagination_change() throws InterruptedException{
    	
    	Property_locaters p = new Property_locaters(d);
    	JavascriptExecutor js = (JavascriptExecutor)d;
    	TreeSet <String> tree = new TreeSet();
    	
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,1800)");
    	Thread.sleep(800);
    	p.pagination_box().click();
    	p.pagination_options();
    	p.pagination_options().get(4).click();
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,-800)");
    	Thread.sleep(800);
    	p.property_listNames();
    	IntStream.range(0, p.property_listNames().size()).forEach(pname->{
    	String propnamelabel= p.property_listNames().get(pname).getText();
    	String[] propnamelabel_split = propnamelabel.split(": ");
    	tree.add(propnamelabel_split[1]);
    	});
    	
    	return tree;
    	
    	}

    
        @Test
        public void propertydelete() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        List_slide lsd = new List_slide(d);	
        
        Property_Soceity_Management(0);
		p.property_searchbar();	
        lsd.List_slide();
        p.list_Delete_buttons();	
        p.list_Delete_buttons().get(2).click();	
        p.popup_Tooltip();
        Thread.sleep(400);	
        p.Tooltip_buttons().get(0).click();	
        Thread.sleep(1400);}

        @Test
        public void Home_visit_pending_property_Search() throws IOException, InterruptedException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        Admin_modules_locators ad = new Admin_modules_locators(d);	
        List_slide lsd = new List_slide(d);	
        TreeSet<String> st = new TreeSet();
        
        
        st.addAll(Home_visit_Pending_Module_Access());
        System.out.println("Listed Homevisit pending Properties are --->>   "+st);
        System.out.println();
        p.property_searchbar().sendKeys(st.last());	
        Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);	
		ad.Home_visit_pending_properties();	
		Thread.sleep(800);
        String pendingpropname = 	ad.Home_visit_pending_properties().get(0).getText();
        System.out.println(st.last().equalsIgnoreCase(pendingpropname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");	
        System.out.println();
        }
        
        
        @Test
        public void Property_Update_Approval_Propertynames() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);	
        TreeSet <String> tree = new TreeSet();
        	
        Property_Update_Approval_Module_Access();	
        p.property_update_list_loaded();	
        p.Pending_update_property_names();
        IntStream.range(0, p.Pending_update_property_names().size()).forEach(nam->{
        tree.add(p.Pending_update_property_names().get(nam).getText());});
        for(String eachtreevalue : tree) {
        System.out.print(eachtreevalue);
        System.out.println();}
        }
        
        
        
         @Test
       public void Property_Staff_assign() throws InterruptedException, IOException, AWTException{
        	
       Property_locaters p = new Property_locaters(d);
       TreeMap <String,String> treemap = new TreeMap<String, String>();
       List_slide lsd = new List_slide(d);	
       JavascriptExecutor js = (JavascriptExecutor)d;
       
       
       
       Property_Soceity_Management(0);
	   p.property_searchbar();	
       lsd.List_slide();
       p.list_view_buttons();	
       p.list_view_buttons().get(0).click();	
       p.Assign_Employee_button().click();
       Thread.sleep(600);
       rolespresent =   p.Role_Names();
       employeepresent_in_eachroles = p.employees_in_role();
       IntStream.range(0, rolespresent.size()).forEach(rc->{
       treemap.put(rolespresent.get(rc).getText(),employeepresent_in_eachroles.get(rc).getText());});
       System.out.println(treemap);
       System.out.println();
       try {
       Civil_engineer_assign();}catch(Exception e){
       System.out.println("Exception found in Civil engineer assign");}try{
       loan_adviser_assign();}catch(Exception f){
       System.out.println("Exception found in loan_adviser_assign");
       System.out.println();}try{
       lawyer_assign();}catch(Exception g){
 	   System.out.println("Exception found in lawyer_assign");
 	   System.out.println();}
 	   try{Relationship_Managers_assign();}catch(Exception h){
 	   System.out.println("Exception found in Relationship_Managers_assign");
 	   System.out.println();}
 	   try{CA_assign();}catch(Exception i){
 	   System.out.println("Exception found in CA_assign");
 	   System.out.println();}
 	   try{Investment_Advisors_assign();}catch(Exception jk){
 	   System.out.println("Exception found in Investment_Advisors_assign");
 	   System.out.println();}
 	   try{Multitasking_Partner_assign();}catch(Exception kj){
 	   System.out.println("Exception found in Multitasking_Partner_assign");
 	   System.out.println();}
 	   p.modal_close_button().click();
 	   Thread.sleep(500);
 	   try{p.approve_property_button();}catch(Exception mo){
 	   System.out.println("post assigning all employee assign property button don't appear thereby have to refresh the page");
 	   d.navigate().refresh();
 	   p.approve_property_button();}}
       
        
        
        
        
      public void Civil_engineer_assign() throws InterruptedException{
    	  
      Property_locaters p = new Property_locaters(d);	
      JavascriptExecutor js = (JavascriptExecutor)d;
      
      
      for(WebElement rolepresent:rolespresent){
   	  if(rolepresent.getText().equalsIgnoreCase("Civil Engineers *")){
   		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
   		   rolepresent.click();
   		   Thread.sleep(700);
   		   List <WebElement> employees_inside_roles = p.inside_employees();
   		   Thread.sleep(600);
   		   for(WebElement eachemployee: employees_inside_roles){
   		   		 if(!eachemployee.getText().contains("Assigned")){
   		   			System.out.println("Civil engineer Assigned is  "+eachemployee.getText());
   		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
   		   			break;}}}}}
      
      
      public void loan_adviser_assign() throws InterruptedException{
    	  
          Property_locaters p = new Property_locaters(d);	
          JavascriptExecutor js = (JavascriptExecutor)d;
        
	
         
          for(WebElement rolepresent:rolespresent){
       	  
              if(rolepresent.getText().equalsIgnoreCase("Loan Advisors *")){
       		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
       		   rolepresent.click();
       		   Thread.sleep(700);
       		   List <WebElement> employees_inside_roles = p.inside_employees();
       		   Thread.sleep(600);
       		   for(WebElement eachemployee: employees_inside_roles){
       		   		 if(!eachemployee.getText().contains("Assigned")){
       		   			System.out.println("Loan Advisors Assigned is  "+eachemployee.getText());
       		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
       		   			break;}}}}}

        public void lawyer_assign() throws InterruptedException{
    	  
          Property_locaters p = new Property_locaters(d);	
          JavascriptExecutor js = (JavascriptExecutor)d;
        	
         
          for(WebElement rolepresent:rolespresent){
       	  
              if(rolepresent.getText().equalsIgnoreCase("Lawyers *")){
       		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
       		   rolepresent.click();
       		   Thread.sleep(700);
       		   List <WebElement> employees_inside_roles = p.inside_employees();
       		   Thread.sleep(600);
       		   for(WebElement eachemployee: employees_inside_roles){
       		   		 if(!eachemployee.getText().contains("Assigned")){
       		   			System.out.println("Lawyers Assigned is  "+eachemployee.getText());
       		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
       		   			break;}}}}}
        
        public void Relationship_Managers_assign() throws InterruptedException{
      	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          
           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Relationship Managers *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Assigned")){
         		   			System.out.println("Relationship Managers Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        
        public void CA_assign() throws InterruptedException{
        	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          

           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("CA *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Assigned")){
         		   			System.out.println("CA Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        public void Investment_Advisors_assign() throws InterruptedException{
      	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          

           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Investment Advisors *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Assigned")){
         		   			System.out.println("Investment Advisors Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        public void Multitasking_Partner_assign() throws InterruptedException{
        	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          
           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Multitasking Partner *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Assigned")){
         		   			System.out.println("Multitasking Partner Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
      

}
