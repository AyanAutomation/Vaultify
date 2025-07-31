package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.FeedBack_Locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class FeedBack_Module extends Admin_Modules_Access_and_check{
	
	TreeMap<String,WebElement> Category_eye = new TreeMap<String,WebElement>();
	
	
	
	public TreeMap<String,WebElement> FeedBack_List_Data_Fetcher() 
			throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		
		
		Feedback_Management();
		Thread.sleep(800);
		List<WebElement> categories = p.Category_details();
		List<WebElement> View_Buttons = p.Eye_buttons();
		IntStream.range(0, View_Buttons.size()).forEach(k->{
			
			Category_eye.put(categories.get(k).getText(), View_Buttons.get(k));
			System.out.println("Keys are  "+categories.get(k).getText());
			System.out.println();
		});
		
		return Category_eye;}
	
	
	
	@Test
	public void view_details()throws InterruptedException, IOException, AWTException{
		
		FeedBack_List_Data_Fetcher();	
		
		
		
		
	}
	
	
	

}
