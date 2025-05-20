package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_modules_locators {
	
	@FindBy(xpath="//a[@class='group relative mx-3 my-0.5 flex items-center justify-between rounded-md px-3 py-2 font-medium capitalize lg:my-1 2xl:mx-5 2xl:my-2 text-gray-700 transition-colors duration-200 hover:bg-gray-100 hover:text-gray-900 dark:text-gray-700/90']")
	public List <WebElement> Menu_modules ;
	@FindBy(xpath="(//h2)[1]")
	private WebElement page_headeings; 
	@FindBy(xpath="//*[@class='rizzui-collapse-panel']")  
	public List <WebElement> dropdown_submenu; 
	@FindBy(xpath="//*[@class='rizzui-collapse-panel']//a")
	public List <WebElement>  submenuitems; 
	@FindBy(xpath="//*[@class='simplebar-content']")
	private WebElement  sideMenu; 
	@FindBy(xpath="//*[@class='flex items-center']")
	public List <WebElement> dropdown_module  ; 
	@FindBy(xpath="//*[@class='mb-2 flex w-full items-center justify-between']")
	private WebElement  Employee_list_section; 
	@FindBy(xpath="//form")
	private WebElement pop_up_employeeAdd_Form; 
	@FindBy(name="username")
	private WebElement username_field; /*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
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


	public Admin_modules_locators(WebDriver d){
	PageFactory.initElements(d, this); }

	public WebElement page_headeings(){
	return page_headeings;}  
	public WebElement sideMenu(){
	return sideMenu;} 
	public WebElement Employee_list_section(){
	return Employee_list_section;}
	public WebElement Employee_add_button(){
	return  Employee_list_section.findElement(By.xpath(".//button[@type='button']")) ;}    
	public WebElement pop_up_employeeAdd_Form(){
	return pop_up_employeeAdd_Form;} 
	public WebElement username_field(){
	return username_field;} /*
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}  */
}
