package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Property_locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//*[@class='rizzui-input-root flex flex-col']//label//span//input")
	private WebElement property_searchbar;
	@FindBy(xpath="//*[@class='rizzui-select-value block w-full truncate text-left rtl:text-right pe-1.5']")
	private WebElement  pagination_box;
	@FindBy(xpath="//ul[@data-headlessui-state=\"open\"]//li")
	private List <WebElement> pagination_options  ;
	@FindBy(xpath="//td//figcaption//p[1]")
	private List <WebElement>  property_listNames;
	@FindBy(xpath="(//div[@class='table-filter mb-4 flex items-center justify-between']//button)[2]")
	private WebElement  Search_button; 
	@FindBy(xpath="//*[@class='rc-table-content']")
	private WebElement slider;
	@FindBy(xpath="//*[@aria-label='Delete Item']")
	private List <WebElement>  list_Delete_buttons;
	@FindBy(xpath="//div[@role='tooltip']")
	private WebElement  popup_Tooltip;
	@FindBy(xpath="//*[text()='Update request Status']")
	private WebElement  property_update_list_loaded; 
	@FindBy(xpath="//td[1]//p[1]")
	private List <WebElement> Pending_update_property_names; 
	@FindBy(xpath="//*[@aria-label='View Property']")
	private List <WebElement>  list_view_buttons;
	@FindBy(xpath="//*[text()='Assign Employee']")
	private WebElement  Assign_Employee_button;
	@FindBy(xpath="//*[@class='space-y-4']//h4")
	private List <WebElement> Role_Names;
	@FindBy(xpath="//*[@class='space-y-4']//p")
	private List <WebElement> employees_in_role;
	@FindBy(xpath="//tr[@class='hover:bg-gray-100']")
	private List <WebElement> inside_employees;
	@FindBy(xpath="//*[@class='mb-4 flex items-center justify-between']//button")
	private WebElement  modal_close_button;
	@FindBy(xpath="//*[@class='rizzui-switch col-span-full']//label")
	private List <WebElement> property_toggle_buttons;
	@FindBy(xpath="//*[text()='Approve This Property']")
	private WebElement  approve_property_button;
	@FindBy(xpath="//*[@class='mt-1 text-sm text-gray-600']//div")
	private List <WebElement>  property_card_details; 
	@FindBy(xpath="//*[@class='col-span-5 @container']//ul")
	private List <WebElement> property_details_below_Datas ;
	@FindBy(xpath="//div[@class='flex h-full flex-col p-5']//button[@aria-expanded='false']")
	private List <WebElement> filter_dropdowns;      
	@FindBy(xpath="//td[4]//p")
	private List <WebElement>  property_list_hiddenGems_data; 
	@FindBy(xpath="//td//p[2]")
	private List <WebElement>  property_datas_inList;       
	@FindBy(xpath="//td[4]//p")
	private List <WebElement>  Employee_staff_list_phnumbers;   /*
	@FindBy(xpath="//tbody//tr")
	private WebElement  Property_list_rows;
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

	public Property_locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this); }


	public WebElement property_searchbar(){
	WebElement_wait(property_searchbar);	
	return property_searchbar;} 
	public WebElement pagination_box(){
	WebElement_wait(pagination_box);
	return pagination_box;}
	public List <WebElement> pagination_options(){
	WebElements_waits(pagination_options);
	return pagination_options;}
	public List <WebElement> property_listNames(){
	WebElements_waits(property_listNames);
	return property_listNames;} 
	public WebElement Search_button(){
	WebElement_wait(Search_button);
	return Search_button;} 
	public WebElement slider(){
	WebElement_wait(slider);
	return slider;}
	public List <WebElement> list_Delete_buttons(){
	WebElements_waits(list_Delete_buttons);	
	return list_Delete_buttons;}
	public WebElement popup_Tooltip(){
	WebElement_wait(popup_Tooltip);
	return popup_Tooltip;}
	public List <WebElement> Tooltip_buttons(){
	WebElement_wait(popup_Tooltip);
	List<WebElement> buttons = popup_Tooltip.findElements(By.xpath(".//button"));
	return buttons;}
	public WebElement property_update_list_loaded(){
	WebElement_wait(property_update_list_loaded);
	return property_update_list_loaded;}
	public List<WebElement> Pending_update_property_names(){
	WebElements_waits(Pending_update_property_names);
	return Pending_update_property_names;}
	public List<WebElement> list_view_buttons(){
	WebElements_waits(list_view_buttons);
	return list_view_buttons;}
	public WebElement Assign_Employee_button(){
	WebElement_wait(Assign_Employee_button);	
	return Assign_Employee_button;}
	public List<WebElement> Role_Names(){
	WebElements_waits(Role_Names);
	return Role_Names;}
	public List<WebElement> employees_in_role(){
	WebElements_waits(employees_in_role);
	return employees_in_role;} 
	public List<WebElement> inside_employees(){
	WebElements_waits(inside_employees);
	return inside_employees;}
	public WebElement modal_close_button(){
	WebElement_wait(modal_close_button);	
	return modal_close_button;}
	public List<WebElement> property_toggle_buttons(){
	WebElements_waits(property_toggle_buttons);
	return property_toggle_buttons;}
	public WebElement approve_property_button(){
	WebElement_wait(approve_property_button);	
	return approve_property_button;}
	public List<WebElement> property_card_details(){
	WebElements_waits(property_card_details);	
	return property_card_details;}
	public List <WebElement> property_details_below_Datas(){
	WebElements_waits(property_details_below_Datas);	
	return property_details_below_Datas;} 
	public List <WebElement> filter_dropdowns(){
	WebElements_waits(filter_dropdowns);	
	return filter_dropdowns;} 
	public List <WebElement> property_list_hiddenGems_data(){
	WebElements_waits(property_list_hiddenGems_data);	
	return property_list_hiddenGems_data;}
	public List <WebElement> property_datas_inList(){
	WebElements_waits(property_datas_inList);	
	return property_datas_inList;}  
	public List <WebElement> Employee_staff_list_phnumbers(){
	WebElements_waits(Employee_staff_list_phnumbers);	
	return Employee_staff_list_phnumbers;}  
	public List <WebElement> security_deposit_details(){
	property_details_below_Datas();
	List <WebElement> securitydetails = property_details_below_Datas().get(5).findElements(By.xpath(".//li"));
	WebElements_waits(securitydetails);	
	return securitydetails;} 
	public WebElement property_name_text(){
	property_card_details();
	WebElement property_name_text = property_card_details().get(0).findElement(By.xpath(".//span"));
	WebElement_wait(property_name_text);	
	return property_name_text;}  /*
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
	
	
	*/

}
