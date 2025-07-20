package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.pom.Property_locaters;
import Locators.pom.Talk_to_Expert_locaters;

public class Talk_to_Expert_Module extends Admin_Modules_Access_and_check {
	
	
	TreeMap<String,String> list_customer_and_statuses = new TreeMap<String,String>();
	List<String> customer_details = new ArrayList<String>();	
	List<String> plan_details = new ArrayList<String>();	
	List<String> expert_details = new ArrayList<String>();
	List<String> Assigned_staff_details = new ArrayList<String>();
	
	
@Test	
 public void talk_to_expert_list_data_fetchers()throws InterruptedException, IOException, AWTException{
	 
	 Talk_to_Expert_locaters p = new Talk_to_Expert_locaters(d);
	 Property_locaters pp = new Property_locaters(d);
	 
	 
	List<String> request_Statuses = TalkToExpert();
	p.user_details();
	for(WebElement userDetail:p.user_details()){
		customer_details.add(userDetail.getText());}
	IntStream.range(0, request_Statuses.size()).forEach(j->{
		
		plan_details.add(p.Plan_details().get(j).getText());
		expert_details.add(p.Expert_details().get(j).getText());
		Assigned_staff_details.add(p.Assigned_staff().get(j).getText());
	});
	
	IntStream.range(0, request_Statuses.size()).forEach(k->{
		
		list_customer_and_statuses.put(request_Statuses.get(k), customer_details.get(k));
		System.out.println(request_Statuses.get(k)+"  " +customer_details.get(k));
		System.out.println();
	});
	
	
	 
	 
	 
	 
	 
	 
 }
	
	
	

}
