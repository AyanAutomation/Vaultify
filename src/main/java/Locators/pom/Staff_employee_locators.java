package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Staff_employee_locators extends Repeatative_Codes{
	
	
	@FindBy(xpath="//*[@class='flex items-center justify-center gap-4']")
	private WebElement  add_role_button; 
	@FindBy(name="roleName")
	private WebElement  Role_Name_field;
	@FindBy(name="roleDescription")
	private WebElement  Role_Description_Feild; 
	@FindBy(xpath="//form//div[@class='h-full']")
	private List <WebElement> Dropdowns; /*
	@FindBy(xpath="//form//label[@class='rizzui-advanced-checkbox-root relative block']")
	private List <WebElement> Permission_buttons;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;  */
	
	
	public Staff_employee_locators(WebDriver d){
		super(d);
		PageFactory.initElements(d, this); }
	
	
	public WebElement add_role_button(){
	WebElement_wait(add_role_button);	
	return add_role_button;} 
	public WebElement Role_Name_field(){
	WebElement_wait(Role_Name_field);	
	return Role_Name_field;}
	public WebElement Role_Description_Feild(){
	WebElement_wait(Role_Description_Feild);	
	return Role_Description_Feild;} 
	public List <WebElement> Dropdowns(){
	WebElements_waits(Dropdowns);	
	return Dropdowns;} /*
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}
	public WebElement (){
	WebElement_wait();	
	return ;}      */

}
