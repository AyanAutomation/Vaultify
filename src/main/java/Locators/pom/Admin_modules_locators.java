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
	private WebElement username_field; 
	@FindBy(name="password")
	private WebElement password_field;;
	@FindBy(name="name")
	private WebElement Full_Name_feild;
	@FindBy(name="father_name")
	private WebElement father_name;
	@FindBy(name="mother_name")
	private WebElement  mother_name;
	@FindBy(name="dob")
	private WebElement dob;
	@FindBy(name="email")
	private WebElement email;
	@FindBy(name="phoneNumber")
	private WebElement phoneNumber;
	@FindBy(xpath="//*[@class='h-full']//button")
	private List <WebElement> dropdown_fields;
	@FindBy(xpath="//*[@role='listbox']")
	private List <WebElement> dropdown_list;
	@FindBy(name="qualification")
	private WebElement qualification;
	@FindBy(xpath="//*[@role='listbox']//*[@role='option']")
	private List <WebElement> options;
	@FindBy(name="doj")
	private WebElement date_of_joining;
	@FindBy(xpath="(//*[@class=' css-13cymwt-control']//div)[1]")
	private WebElement role_dropdown_field;
	@FindBy(name="accountOwnerName")
	private WebElement  accountOwnerName;
	@FindBy(name="bankName")
	private WebElement bankName;
	@FindBy(name="accountNumber")
	private WebElement  accountNumber;
	@FindBy(name="ifscCode")
	private WebElement ifscCode;
	@FindBy(name="upiId")
	private WebElement upiId;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit_button;
	@FindBy(name="experience")
	private WebElement experience; 
	@FindBy(xpath="//*[@class='inline-flex']")
	private List <WebElement> list_sort_buttons;
	@FindBy(xpath="(//*[@class='grid gap-0.5']//p)[1]")
	private WebElement first_name_inlist; /*
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
	return username_field;} 
	public WebElement password_field(){
	return password_field;}
	public WebElement Full_Name_feild(){
	return Full_Name_feild;}
	public WebElement father_name(){
	return father_name;}
	public WebElement mother_name(){
	return mother_name;}
	public WebElement dob(){
	return dob;}
	public WebElement email(){
	return email;}
	public WebElement phoneNumber(){
	return phoneNumber;}
	public List <WebElement> dropdown_list(){
	return dropdown_list;}
	public WebElement qualification(){
	return qualification;}
	public List <WebElement> options(){
	return options;}
	public WebElement date_of_joining(){
	return date_of_joining;}
	public WebElement role_dropdown_field(){
	return role_dropdown_field;}
	public WebElement accountOwnerName(){
	return accountOwnerName;}
	public WebElement bankName(){
	return bankName;}
	public WebElement accountNumber(){
	return accountNumber;}
	public WebElement ifscCode(){
	return ifscCode;}
	public WebElement upiId(){
	return upiId;}
	public WebElement submit_button(){
	return submit_button;} 
	public List <WebElement> dropdown_fields(){
	return dropdown_fields;} 
	public WebElement experience(){
	return experience;} 
	public List <WebElement> list_sort_buttons(){
	return list_sort_buttons;}
	public WebElement first_name_inlist(){
	return first_name_inlist;} /*
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
