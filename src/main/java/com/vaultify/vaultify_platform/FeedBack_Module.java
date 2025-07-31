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

import Locators.pom.FeedBack_Locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class FeedBack_Module extends Admin_Modules_Access_and_check{
	
	TreeMap<String,WebElement> Category_eye = new TreeMap<String,WebElement>();
	List<String> Sub_listText = new ArrayList<String>();
	List<String> Headings_Text = new ArrayList<String>();
	TreeMap<String,List<String>> popup_inner_texta = new TreeMap<String,List<String>>();
	List<String> Sub_list_section_one_Texts = new ArrayList<String>();
	List<String> Sub_list_section_two_Texts = new ArrayList<String>();
	
	
	public TreeMap<String,WebElement> FeedBack_List_Data_Fetcher() 
			throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		
		
		Feedback_Management();
		Thread.sleep(800);
		List<WebElement> categories = p.Category_details();
		List<WebElement> View_Buttons = p.Eye_buttons();
		IntStream.range(0, View_Buttons.size()).forEach(k->{
			Category_eye.put(categories.get(k).getText(), View_Buttons.get(k));
		});
		
		return Category_eye;}
	
	
	
	@Test
	public void view_details()throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		FeedBack_List_Data_Fetcher();	
		Thread.sleep(800);
		for(Map.Entry<String, WebElement> pair:Category_eye.entrySet()){
			
			System.out.println("Keys are  "+pair.getKey());
			System.out.println();}
		Thread.sleep(800);
		WebElement eye_button_to_be_clicked = Category_eye.get("feedback for expert advice");
		js.executeScript("arguments[0].scrollIntoView(true);",eye_button_to_be_clicked );
		Thread.sleep(800);
		eye_button_to_be_clicked.click();
		p.popup();
		List<WebElement> Sublistelements = p.SubList_data();
		for(WebElement Sublistelement:Sublistelements){
			
			Sub_listText.add(Sublistelement.getText());}
		List<WebElement> headings_in_popup = p.popup_headings();
        for(WebElement headings:headings_in_popup){
			
        	Headings_Text.add(headings.getText());}
		IntStream.range(0, 7).forEach(b->{
			Sub_list_section_one_Texts.add(Sub_listText.get(b));
			});
		IntStream.range(8, 10).forEach(n->{
			Sub_list_section_two_Texts.add(Sub_listText.get(n));
			});
        
        popup_inner_texta.put(Headings_Text.get(0),Sub_list_section_one_Texts);
        popup_inner_texta.put(Headings_Text.get(1),Sub_list_section_two_Texts);
        
        for(Map.Entry<String,List<String>> key_value:popup_inner_texta.entrySet()){
        	
        	System.out.println(key_value.getKey()+" :----- ");
        	System.out.println();
        	for(String subitems:key_value.getValue()){
        		System.out.println(subitems);
        		System.out.println();
        	}
        	
        	System.out.println();
        	
        }
	}
	
	
	

}
