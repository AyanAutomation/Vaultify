package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.TreeMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Locators.pom.Incentives_locaters;

public class Incentives extends Admin_Modules_Access_and_check{
	
	
	@Test(dataProvider="Incentive_amounts")
	public void Incetive_add_form() throws InterruptedException, IOException, AWTException{
		
		Incentives_locaters p = new Incentives_locaters(d);
		
		
		Dynamic_Incentive_Setting();
		p.Incentive_adButton().click();
		p.Dropdown_Options();
		
		
		
		
		
		
		
	}
	
	@DataProvider
	public TreeMap<String, Integer> Incentive_amounts(){
		
		TreeMap<String, Integer> incentive_value_pair_1 = new TreeMap<String, Integer>();
		
		incentive_value_pair_1.put("Incentive Amount", null);
		incentive_value_pair_1.put("Property Amount", null);
		
		return incentive_value_pair_1;
		
		
	}
	

}
