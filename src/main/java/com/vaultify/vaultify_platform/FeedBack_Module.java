package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.IntStream;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.FeedBack_Locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class FeedBack_Module extends Admin_Modules_Access_and_check{

	HashMap<String,WebElement> Category_eye = new HashMap<String,WebElement>();
	List<String> Sub_listText = new ArrayList<String>();
	List<String> Headings_Text = new ArrayList<String>();
	HashMap<String,List<String>> popup_inner_text = new HashMap<String,List<String>>();
	List<String> Sub_list_section_one_Texts = new ArrayList<String>();
	List<String> Sub_list_section_two_Texts = new ArrayList<String>();
	TreeSet<String> Category = new TreeSet<String>();
	String Category_key;
	List<String> category_key_listList = new ArrayList<String>();
	
	public void FeedBack_List_Data_Fetcher() 
			throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		Feedback_Management();
		Thread.sleep(800);
		List<WebElement> categories = p.Category_details();
		List<WebElement> View_Buttons = p.Eye_buttons();
		Thread.sleep(800);
		js.executeScript("arguments[0].scrollIntoView(true);",View_Buttons.get(0) );
		IntStream.range(0, categories.size()).forEach(k->{
			Category_eye.put(categories.get(k).getText(), View_Buttons.get(k));
		});
		
		}
	
	
	
	@Test
	public void FeedBack_View_details()throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		JavascriptExecutor js = (JavascriptExecutor)d;
		
		FeedBack_List_Data_Fetcher();	
		Thread.sleep(800);
		category_key_data_viewer();
		Category_key = category_key_listList.get(1);
		WebElement eye_button_to_be_clicked = Category_eye.get(Category_key);
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
        popup_inner_text.put(Headings_Text.get(0),Sub_list_section_one_Texts);
		popup_inner_text.put(Headings_Text.get(1),Sub_list_section_two_Texts);
        

        }
	
	@Test
	public void feedback_Search() throws InterruptedException, IOException, AWTException{
		
		FeedBack_Locaters p = new FeedBack_Locaters(d);
		
		FeedBack_List_Data_Fetcher();
		category_key_data_viewer();
		p.Feedback_search().sendKeys(category_key_listList.get(1));
		p.search_button().click();
		Thread.sleep(800);
		List<WebElement> searched_categories = p.Category_details();
		for(WebElement searched_category:searched_categories){
			Category.add(searched_category.getText());}
		System.out.println(Category.contains(category_key_listList.get(1))? " Testcase Passed search working search item "+Category+"  shown in result  ":"Testcase Failed search not working search item"+Category+" not shown in result");
		System.out.println();  
	}
	 
	
	public void category_key_data_viewer() throws InterruptedException{
		
		
		Thread.sleep(800);   
		for(Map.Entry<String, WebElement> pair:Category_eye.entrySet()){
			
			System.out.println("Keys are  "+pair.getKey());
			System.out.println();
			category_key_listList.add(pair.getKey());}
		Thread.sleep(800); }
	
	
	
	@Test
	public void all_collections_cleaner(){
		
		Category_eye.clear();
		if(Category_eye.size()==0){
		       System.out.println("Category_eye cleared");
		       System.out.println();}
		Sub_listText.clear();
		if(Sub_listText.size()==0){
		       System.out.println("Sub_listText cleared");
		       System.out.println();}
		Headings_Text.clear();
		if(Headings_Text.size()==0){
		       System.out.println("Headings_Text cleared");
		       System.out.println();}
		popup_inner_text.clear();
		if(popup_inner_text.size()==0){
		       System.out.println("popup_inner_text cleared");
		       System.out.println();}
		Sub_list_section_one_Texts.clear();
		if(Sub_list_section_one_Texts.size()==0){
		       System.out.println("Sub_list_section_one_Texts cleared");
		       System.out.println();}
		Sub_list_section_two_Texts.clear();
		if(Sub_list_section_two_Texts.size()==0){
		       System.out.println("Sub_list_section_two_Texts cleared");
		       System.out.println();}}
	
	
	

}
