package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Admin_modules_locators extends Repeatative_Codes{
	
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
	@FindBy(xpath="(//header[@class='mb-6 @container xs:-mt-2 lg:mb-7']//div[@class='flex flex-col @lg:flex-row @lg:items-center @lg:justify-between'])[2]")
	private WebElement Employee_list_section; 
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
	private WebElement mother_name;
	@FindBy(name="dob")
	private WebElement dob;
	@FindBy(name="email")
	private WebElement email;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement phoneNumber;
	@FindBy(xpath="//*[@class='h-full']//button")
	private List <WebElement> dropdown_fields;
    @FindBy(xpath="//div[@class='rizzui-select-root grid w-full grid-cols-1']//*[@class='h-full']//button")
	private WebElement whatsapp_dropdown;
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
	private WebElement first_name_inlist; 
	@FindBy(xpath="//*[@class='flex space-x-4 border-b-2 border-gray-200']//button")
	private List <WebElement> module_internal_Tabs;
	@FindBy(xpath="//*[text()='Visit Status']")
	private WebElement home_visit_pending_list_loaded;
	@FindBy(xpath="//td[1]//figcaption[@class='grid gap-0.5']//p[1]")
	private List <WebElement> Home_visit_pending_properties;
	@FindBy(xpath="//div[@class='mt-4 flex items-center gap-3 @lg:mt-0']")
	private WebElement update_approval_request_button;  
	@FindBy(xpath="//input")
	private WebElement employee_search_button;
	@FindBy(xpath="//td//div[@class='flex items-center']")
	private List <WebElement> PropertyBid_statuses;
    @FindBy(xpath="//li")
	private List <WebElement> cms_cards;
	
	


	public Admin_modules_locators(WebDriver d){
	super(d);
	PageFactory.initElements(d, this); }

	public WebElement page_headeings(){
	WebElement_wait(page_headeings);
	return page_headeings;}  
	public WebElement sideMenu(){
	WebElement_wait(sideMenu);
	return sideMenu;} 
	public WebElement Employee_list_section(){
	WebElement_wait(Employee_list_section);
	return Employee_list_section;}
	public WebElement Employee_add_button(){
	WebElement_wait(Employee_list_section.findElement(By.xpath(".//button[@type='button']")));
	return Employee_list_section.findElement(By.xpath(".//button[@type='button']"));}    
	public WebElement pop_up_employeeAdd_Form(){
	WebElement_wait(pop_up_employeeAdd_Form);
	return pop_up_employeeAdd_Form;} 
	public WebElement username_field(){
	WebElement_wait(username_field);
	return username_field;} 
	public WebElement password_field(){
	WebElement_wait(password_field);
	return password_field;}
	public WebElement Full_Name_feild(){
	WebElement_wait(Full_Name_feild);
	return Full_Name_feild;}
	public WebElement father_name(){
	WebElement_wait(father_name);
	return father_name;}
	public WebElement mother_name(){
	WebElement_wait(mother_name);		
	return mother_name;}
	public WebElement dob(){
	WebElement_wait(dob);	
	return dob;}
	public WebElement email(){
	WebElement_wait(email);
	return email;}
	public WebElement phoneNumber(){
	WebElement_wait(phoneNumber);
	return phoneNumber;}
	public List <WebElement> dropdown_list(){
	WebElements_waits(dropdown_list);
	return dropdown_list;}
	public WebElement qualification(){
	WebElement_wait(qualification);
	return qualification;}
	public List <WebElement> options(){
	WebElements_waits(options);
	return options;}
	public WebElement date_of_joining(){
	WebElement_wait(date_of_joining);
	return date_of_joining;}
	public WebElement role_dropdown_field(){
	WebElement_wait(role_dropdown_field);
	return role_dropdown_field;}
	public WebElement accountOwnerName(){
	WebElement_wait(accountOwnerName);
	return accountOwnerName;}
	public WebElement bankName(){
	WebElement_wait(bankName);
	return bankName;}
	public WebElement accountNumber(){
	WebElement_wait(accountNumber);
	return accountNumber;}
	public WebElement ifscCode(){
	WebElement_wait(ifscCode);
	return ifscCode;}
	public WebElement upiId(){
	WebElement_wait(upiId);
	return upiId;}
	public WebElement submit_button(){
	WebElement_wait(submit_button);
	return submit_button;} 
	public List <WebElement> dropdown_fields(){
	WebElements_waits(dropdown_fields);
	return dropdown_fields;} 
	public WebElement experience(){
	WebElement_wait(experience);
	return experience;} 
	public List <WebElement> list_sort_buttons(){
	WebElements_waits(list_sort_buttons);
	return list_sort_buttons;}
	public WebElement first_name_inlist(){
	WebElement_wait(first_name_inlist);
	return first_name_inlist;} 
	public WebElement whatsapp_dropdown(){
	WebElement_wait(whatsapp_dropdown);
	return whatsapp_dropdown;} 
	public List <WebElement> module_internal_Tabs(){
	WebElements_waits(module_internal_Tabs);
	return module_internal_Tabs;}
	public WebElement home_visit_pending_list_loaded(){
	WebElement_wait(home_visit_pending_list_loaded);
	return home_visit_pending_list_loaded;}
	public List <WebElement> Home_visit_pending_properties(){
	WebElements_waits(Home_visit_pending_properties);
	return Home_visit_pending_properties;}
	public WebElement update_approval_request_button(){
	WebElement_wait(update_approval_request_button);
	return update_approval_request_button;}
	public WebElement employee_search_button(){
	WebElement_wait(employee_search_button);
	return employee_search_button;}
	public List <WebElement> Menu_modules(){
	WebElements_waits(Menu_modules);
	return Menu_modules;}
	public List <WebElement> submenuitems(){
	WebElements_waits(submenuitems);
	return submenuitems;}
	public List <WebElement> PropertyBid_statuses(){
	WebElements_waits(PropertyBid_statuses);
	return PropertyBid_statuses;}
	public List <WebElement> cms_cards(){
	WebElements_waits(cms_cards); 
	return cms_cards;} /*
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}  */
}
