package Validations_check;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.vaultify.vaultify_platform.Property_management;

import Locators.pom.Property_locaters;

public class Property_search_Validation extends Property_management{
	
	
	@Test(dataProvider="propertynames")
	public void Property_Search(String Property_names) throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		Pagination_change();
		
		p.property_searchbar().sendKeys(Property_names);
		Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);
		String propertynamelabel= p.property_listNames().get(0).getText();
    	String[] propertynamelabel_split = propertynamelabel.split(": ");
		Resultant_propertyname = propertynamelabel_split[1];
		System.out.println(Property_names.equalsIgnoreCase(Resultant_propertyname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");
	}
	
	
	
	@DataProvider
	public Object[][] propertynames(){
		
		return new Object[][]{{"Burj Khalifa"},{"Palm Jumera"}};
		
		
		
	}
	

}
