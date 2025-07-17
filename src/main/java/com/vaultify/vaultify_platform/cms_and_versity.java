package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Cms_and_versity_locators;

public class cms_and_versity extends Admin_Modules_Access_and_check{
	
	
	List<String> cardTexts = new ArrayList<String>();
	
	@Test
	public void Cms_Page_list_checker() throws InterruptedException, IOException, AWTException{
		
		
	 List<WebElement> cards =	CMS_Module_Accessor();
		
		for(WebElement card :cards){
			
			System.out.println(card.getText().trim());
			System.out.println();
			cardTexts.add(card.getText().trim());}}
	
	
	@Test
	public void cms_search() throws InterruptedException, IOException, AWTException{
		
		Admin_modules_locators pp = new Admin_modules_locators(d);
		Cms_and_versity_locators p = new Cms_and_versity_locators(d);
		
		Cms_Page_list_checker();
		Thread.sleep(800);
        p.search_bar().click();
        Thread.sleep(800);
        String search = cardTexts.get(2);
		p.search_bar().sendKeys(search);
		Thread.sleep(1850);
		d.navigate().refresh();
		System.out.println(pp.cms_cards().get(0).getText().equalsIgnoreCase(cardTexts.get(2))?"Testcase passed searched item "+cardTexts.get(2)+" found in searched result ":" Testcase Failed searched item "+cardTexts.get(2)+" not found in searched result ");
		
		
		
	}
	
	
	
	
	
	
	

}
