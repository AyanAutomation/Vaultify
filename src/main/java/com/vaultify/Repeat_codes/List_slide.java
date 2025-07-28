package com.vaultify.Repeat_codes;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.vaultify.vaultify_platform.Admin_Modules_Access_and_check;

import Locators.pom.Property_locaters;

public class List_slide {
	
	WebDriver d;;
	
	public List_slide(WebDriver d){
		
		this.d=d;}
	
	
	public void List_slides(int l) throws InterruptedException{
		
        Property_locaters p = new Property_locaters(d);
        JavascriptExecutor js = (JavascriptExecutor)d;
        Actions a = new Actions(d);
		
        for(int m=0; m<l;m++){
            a.moveToElement(p.slider()).clickAndHold().moveByOffset(110, 0).release().perform();
            Thread.sleep(800);}
        
	    
	
	
	
	}


		
		
		
	}


