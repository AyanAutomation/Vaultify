package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.pom.Incentives_locaters;

public class Incentives extends Admin_Modules_Access_and_check{
	
	
	
	@Test(dataProvider="Incentive_amounts")
	public void Incetive_add_form(TreeMap<String, Object> data) throws InterruptedException, IOException, AWTException{
		
		Incentives_locaters p = new Incentives_locaters(d);
		
		
		Dynamic_Incentive_Setting();
		p.Incentive_add_button().click();
		p.Inside_form_Confirmation();
		Thread.sleep(800);
		p.Form_dropdown_buttons().get(0).click();
		Thread.sleep(800);
		List<WebElement> userTypes = p.Dropdown_Options();
		for(WebElement pair1: userTypes){
			
			if(pair1.getText().equalsIgnoreCase((String) data.get("Enter User Type"))){
				
				pair1.click();
				break;}}
		p.Form_dropdown_buttons().get(1).click();
		Thread.sleep(800);
		List<WebElement> RoleTypes = p.Dropdown_Options();
		for(WebElement pair2: RoleTypes){
			
			if(pair2.getText().equalsIgnoreCase((String) data.get("Enter Role"))){
				
				pair2.click();
				break;}}
		p.Form_dropdown_buttons().get(2).click();
		Thread.sleep(800);
		List<WebElement> IncentiveTypes = p.Dropdown_Options();
		for(WebElement pair3: IncentiveTypes){
			
			if(pair3.getText().equalsIgnoreCase((String) data.get("Enter Incentive Type"))){
				
				pair3.click();
				break;}}}
	
	@DataProvider
	public Object[][] Incentive_amounts(){
		
		
		
		TreeMap<String, Object> incentive_value_pair_1 = new TreeMap<>();
        incentive_value_pair_1.put("Incentive Amount", 3000);
        incentive_value_pair_1.put("Property Amount", 10000000);   // 1 cr
        incentive_value_pair_1.put("Enter User Type", "NRI");
        incentive_value_pair_1.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_1.put("Enter Role", "Bidding Manager");
       
        
        
        TreeMap<String, Object> incentive_value_pair_2 = new TreeMap<>();
        incentive_value_pair_2.put("Incentive Amount", 3000);
        incentive_value_pair_2.put("Property Amount", 10000000);   // 1 cr
        incentive_value_pair_2.put("Enter User Type", "Indian");
        incentive_value_pair_2.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_2.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_3 = new TreeMap<>();
        incentive_value_pair_3.put("Incentive Amount", 6000);
        incentive_value_pair_3.put("Property Amount", 20000000);   // 2 cr
        incentive_value_pair_3.put("Enter User Type", "NRI");
        incentive_value_pair_3.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_3.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_4 = new TreeMap<>();
        incentive_value_pair_4.put("Incentive Amount", 6000);
        incentive_value_pair_4.put("Property Amount", 20000000);   // 2 cr
        incentive_value_pair_4.put("Enter User Type", "Indian");
        incentive_value_pair_4.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_4.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_5 = new TreeMap<>();
        incentive_value_pair_5.put("Incentive Amount", 9000);
        incentive_value_pair_5.put("Property Amount", 30000000);   // 3 cr
        incentive_value_pair_5.put("Enter User Type", "NRI");
        incentive_value_pair_5.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_5.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_6 = new TreeMap<>();
        incentive_value_pair_6.put("Incentive Amount", 9000);
        incentive_value_pair_6.put("Property Amount", 30000000);   // 3 cr
        incentive_value_pair_6.put("Enter User Type", "Indian");
        incentive_value_pair_6.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_6.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_7 = new TreeMap<>();
        incentive_value_pair_7.put("Incentive Amount", 12000);
        incentive_value_pair_7.put("Property Amount", 40000000);   // 4 cr
        incentive_value_pair_7.put("Enter User Type", "NRI");
        incentive_value_pair_7.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_7.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_8 = new TreeMap<>();
        incentive_value_pair_8.put("Incentive Amount", 12000);
        incentive_value_pair_8.put("Property Amount", 40000000);   // 4 cr
        incentive_value_pair_8.put("Enter User Type", "Indian");
        incentive_value_pair_8.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_8.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_9 = new TreeMap<>();
        incentive_value_pair_9.put("Incentive Amount", 15000);
        incentive_value_pair_9.put("Property Amount", 50000000);   // 5 cr
        incentive_value_pair_9.put("Enter User Type", "NRI");
        incentive_value_pair_9.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_9.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_10 = new TreeMap<>();
        incentive_value_pair_10.put("Incentive Amount", 15000);
        incentive_value_pair_10.put("Property Amount", 50000000);  // 5 cr
        incentive_value_pair_10.put("Enter User Type", "Indian");
        incentive_value_pair_10.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_10.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_11 = new TreeMap<>();
        incentive_value_pair_11.put("Incentive Amount", 18000);
        incentive_value_pair_11.put("Property Amount", 60000000);  // 6 cr
        incentive_value_pair_11.put("Enter User Type", "NRI");
        incentive_value_pair_11.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_11.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_12 = new TreeMap<>();
        incentive_value_pair_12.put("Incentive Amount", 18000);
        incentive_value_pair_12.put("Property Amount", 60000000);  // 6 cr
        incentive_value_pair_12.put("Enter User Type", "Indian");
        incentive_value_pair_12.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_12.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_13 = new TreeMap<>();
        incentive_value_pair_13.put("Incentive Amount", 21000);
        incentive_value_pair_13.put("Property Amount", 70000000);  // 7 cr
        incentive_value_pair_13.put("Enter User Type", "NRI");
        incentive_value_pair_13.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_13.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_14 = new TreeMap<>();
        incentive_value_pair_14.put("Incentive Amount", 21000);
        incentive_value_pair_14.put("Property Amount", 70000000);  // 7 cr
        incentive_value_pair_14.put("Enter User Type", "Indian");
        incentive_value_pair_14.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_14.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_15 = new TreeMap<>();
        incentive_value_pair_15.put("Incentive Amount", 24000);
        incentive_value_pair_15.put("Property Amount", 80000000);  // 8 cr
        incentive_value_pair_15.put("Enter User Type", "NRI");
        incentive_value_pair_15.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_15.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_16 = new TreeMap<>();
        incentive_value_pair_16.put("Incentive Amount", 24000);
        incentive_value_pair_16.put("Property Amount", 80000000);  // 8 cr
        incentive_value_pair_16.put("Enter User Type", "Indian");
        incentive_value_pair_16.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_16.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_17 = new TreeMap<>();
        incentive_value_pair_17.put("Incentive Amount", 27000);
        incentive_value_pair_17.put("Property Amount", 90000000);  // 9 cr
        incentive_value_pair_17.put("Enter User Type", "NRI");
        incentive_value_pair_17.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_17.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_18 = new TreeMap<>();
        incentive_value_pair_18.put("Incentive Amount", 27000);
        incentive_value_pair_18.put("Property Amount", 90000000);  // 9 cr
        incentive_value_pair_18.put("Enter User Type", "Indian");
        incentive_value_pair_18.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_18.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_19 = new TreeMap<>();
        incentive_value_pair_19.put("Incentive Amount", 30000);
        incentive_value_pair_19.put("Property Amount", 100000000); // 10 cr
        incentive_value_pair_19.put("Enter User Type", "NRI");
        incentive_value_pair_19.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_19.put("Enter Role", "Bidding Manager");

        TreeMap<String, Object> incentive_value_pair_20 = new TreeMap<>();
        incentive_value_pair_20.put("Incentive Amount", 30000);
        incentive_value_pair_20.put("Property Amount", 100000000); // 10 cr
        incentive_value_pair_20.put("Enter User Type", "Indian");
        incentive_value_pair_20.put("Enter Incentive Type", "Property Incentive");
        incentive_value_pair_20.put("Enter Role", "Bidding Manager");

        return new Object[][]{
            { incentive_value_pair_1  },
            { incentive_value_pair_2  },
            { incentive_value_pair_3  },
            { incentive_value_pair_4  },
            { incentive_value_pair_5  },
            { incentive_value_pair_6  },
            { incentive_value_pair_7  },
            { incentive_value_pair_8  },
            { incentive_value_pair_9  },
            { incentive_value_pair_10 },
            { incentive_value_pair_11 },
            { incentive_value_pair_12 },
            { incentive_value_pair_13 },
            { incentive_value_pair_14 },
            { incentive_value_pair_15 },
            { incentive_value_pair_16 },
            { incentive_value_pair_17 },
            { incentive_value_pair_18 },
            { incentive_value_pair_19 },
            { incentive_value_pair_20 }
        };
		
		
	}
	
	
}
