package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
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
	private List <WebElement> Dropdowns; 
	@FindBy(xpath="//form//div[@class='flex flex-col gap-2 pb-3 pt-3 md:flex-row md:items-center md:justify-between']")
	private List <WebElement> Permission_Section_rows;
	@FindBy(xpath="//form")
	private WebElement role_add_form; 
	@FindBy(xpath="//form//div[@class='scrollbar-thin scrollbar-track-gray-100 scrollbar-thumb-gray-300 grid gap-2 divide-y divide-gray-200 overflow-x-auto']")
	private WebElement Permission_Section; 
	@FindBy(xpath="//div[@class='@container']")
	private WebElement role_section;  
	@FindBy(xpath="//*[text()='Remove Role']")
	private WebElement  role_remove_option;
	@FindBy(xpath="(//div[@class='flex flex-col @lg:flex-row @lg:items-center @lg:justify-between'])[3]//button")
	private WebElement  Admin_user_Add_Button;/*
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
	private WebElement  ; */
	
	
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
	return Dropdowns;} 
	public WebElement Dropdown_list(){
	role_add_form();
	WebElement roletype_drodown_list = role_add_form().findElement(By.xpath(".//ul"));
	WebElement_wait(roletype_drodown_list);	
	return roletype_drodown_list;}
	public WebElement role_add_form(){
	WebElement_wait(role_add_form);	
	return role_add_form;}
	public List<WebElement> dropdown_OPTIONS(){
	Dropdown_list();
	List<WebElement> options = Dropdown_list().findElements(By.xpath(".//li"));
	WebElements_waits(options);	
	return options;}
	public List<WebElement> Permission_Section_rows(){
	WebElements_waits(Permission_Section_rows);	
	return Permission_Section_rows;}
	public List<WebElement> permission_module_names(){
	Permission_Section_rows();
	role_add_form();
	List<WebElement> modulenames = role_add_form().findElements(By.xpath(".//h6"));
	WebElements_waits(modulenames);	
	return modulenames;}
	public List<WebElement> permission_module_Buttons(){
	Permission_Section();
	List<WebElement> permission_Buttons = Permission_Section().findElements(By.xpath(".//label"));
	WebElements_waits(permission_Buttons);	
	return permission_Buttons;} 
	public WebElement Permission_Section(){
	WebElement_wait(Permission_Section);	
	return Permission_Section;}
	public WebElement form_submit_button(){
	role_add_form();
	WebElement form_submit_button = role_add_form().findElement(By.xpath(".//button[@type='submit']"));
	WebElement_wait(form_submit_button);	
	return form_submit_button;} 
	public WebElement roles(String name){
	role_section();
	WebElement roles = role_section().findElement(By.xpath(".//h4[text()='"+name+"']"));
	WebElement_wait(roles);	
	return roles;} 
	public WebElement role_section(){
	WebElement_wait(role_section);	
	return role_section;}
	public WebElement three_dot_dash_button(String nameis) {
	WebElement role = roles(nameis);
	WebElement threeDot = role.findElement(By.xpath("ancestor::div[contains(@class,'border-muted')]//div[@class='rizzui-dropdown-button']"));
    WebElement_wait(threeDot);    
	return threeDot;}
    public WebElement role_remove_option(){
	WebElement_wait(role_remove_option);	
	return role_remove_option;}
	public WebElement Admin_user_Add_Button(){
	WebElement_wait(Admin_user_Add_Button);	
	return Admin_user_Add_Button;} /*
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
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();	
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
	public WebElement (){
	wait_for_theElement();
	return ;}
*/
    
    
    
}
