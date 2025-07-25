package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Login_locaters;
import Locators.pom.Property_locaters;
import Locators.pom.Talk_to_Expert_locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class Talk_to_Expert_Module extends Admin_Modules_Access_and_check {
	
	
	TreeMap<String,WebElement> list_customer_and_statuses = new TreeMap<String,WebElement>();
	List<String> customer_details = new ArrayList<String>();	
	List<String> plan_details = new ArrayList<String>();	
	List<String> expert_details = new ArrayList<String>();
	List<String> Assigned_staff_details = new ArrayList<String>();
	TreeMap<String,WebElement> staffname_assignbutton = new TreeMap<String,WebElement>();
	
	
@Test	
 public TreeMap<String,WebElement> talk_to_expert_list_data_fetchers()
		 throws InterruptedException, IOException, AWTException{
	 
	
	 Talk_to_Expert_locaters p = new Talk_to_Expert_locaters(d);
	 List_slide lst = new List_slide(d);
	 
	list_customer_and_statuses = TalkToExpert();
	 p.user_details();
	 for(WebElement userDetail:p.user_details()){
		customer_details.add(userDetail.getText());}
	 IntStream.range(0, p.user_details().size()).forEach(j->{
		
		plan_details.add(p.Plan_details().get(j).getText());
		expert_details.add(p.Expert_details().get(j).getText());
		Assigned_staff_details.add(p.Assigned_staff().get(j).getText());
	});System.out.println();
	Thread.sleep(800);
	lst.List_slide();
	return list_customer_and_statuses;}
	
     @Test
     public void expert_staff_assign() throws InterruptedException, IOException, AWTException{
	   
    	 Login_locaters lo = new Login_locaters(d);
    	 Talk_to_Expert_locaters p = new Talk_to_Expert_locaters(d);
    	 JavascriptExecutor js = (JavascriptExecutor)d;
    	 
    	 talk_to_expert_list_data_fetchers();
    	 Thread.sleep(800);
    	 for(Map.Entry<String,WebElement> pair : list_customer_and_statuses.entrySet()){
    		   if(pair.getValue().getText().trim().equalsIgnoreCase("Assign Employee")){
                	  
                	  pair.getValue().click();
                	  Thread.sleep(800);
                	  break;}}
    	  p.popup_staff_list();
	      int count = p.staff_names().size();
	      List<WebElement> assignButtons = p.staff_assign_buttons();
	      IntStream.range(0, count).forEach(m->{
	    	  staffname_assignbutton.put(p.staff_names().get(m).getText(), assignButtons.get(m));});
	      Thread.sleep(980);
	      p.popup_staff_list();
	      Thread.sleep(980);
	  	  js.executeScript("arguments[0].scrollIntoView(true);",staffname_assignbutton.get("Nikolai ivanov"));
    	  Thread.sleep(800);
	      staffname_assignbutton.get("Nikolai ivanov").click();
	      Thread.sleep(980);
	      lo.success_Toast();
	      System.out.println(lo.success_Toast().getText());
	   
	   
	   
	   
   }
	
	

}
