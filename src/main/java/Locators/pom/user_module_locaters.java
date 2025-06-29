package Locators.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class user_module_locaters extends Repeatative_Codes{
	
	
	
	
	public user_module_locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);
	}
	
	
	

}
