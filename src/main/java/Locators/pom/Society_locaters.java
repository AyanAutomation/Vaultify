package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Society_locaters extends Repeatative_Codes{
	
	@FindBy(xpath="//a[@href='/soceity-management/create']")
	private WebElement  society_Add_button;
	@FindBy(xpath="//label//span//input")
	private List <WebElement> input_fields ;
	@FindBy(xpath="//*[text()='Add Society']")
	private WebElement landed_in_society_add_form;
	@FindBy(xpath="//*[@class='@container']//div[6]//button")
	private WebElement submit_button;
	@FindBy(xpath="//*[@aria-live='polite']")
	private WebElement  success_Toast;
	@FindBy(xpath="//td[1]//p[@class='rizzui-text-p font-normal text-sm']")
	private List <WebElement> society_names_in_list; 
	@FindBy(xpath="(//*[@class='ml-8']//button)[2]")
	private WebElement Add_society_button_property_details;
	@FindBy(xpath="(//*[@class='h-full']//button)")
	private WebElement dropdown;
	@FindBy(xpath="(//*[@class='h-full'])//ul//li")
	private List <WebElement>  dropdown_options; 
	@FindBy(xpath="(//*[@class='mx-auto w-[94%] sticky bottom-0'])//button")
	private WebElement Assign_button; 
	@FindBy(xpath="//*[@class='md:w-1/2']//h2")
	private WebElement below_society_value; /*
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

	public Society_locaters(WebDriver d){
	super(d);
	PageFactory.initElements(d, this); }


	public WebElement society_Add_button(){
	WebElement_wait(society_Add_button);	
	return society_Add_button;}
	public List <WebElement> input_fields(){
	WebElements_waits(input_fields);
	return input_fields;}
	public WebElement landed_in_society_add_form(){
	WebElement_wait(landed_in_society_add_form);
	return landed_in_society_add_form;}
	public WebElement submit_button(){
	WebElement_wait(submit_button);
	return submit_button;}
	public WebElement success_Toast(){
	WebElement_wait(success_Toast);
	return success_Toast;} 
	public List <WebElement> society_names_in_list(){
	WebElements_waits(society_names_in_list);
	return society_names_in_list;}
	public WebElement Add_society_button_property_details(){
	WebElement_wait(Add_society_button_property_details);	
	return Add_society_button_property_details;}
	public WebElement dropdown(){
	WebElement_wait(dropdown);
	return dropdown;}
	public List <WebElement> dropdown_options(){
	WebElements_waits(dropdown_options);
	return dropdown_options;}  
	public WebElement Assign_button(){
	WebElement_wait(Assign_button);
	return Assign_button;} 
	public WebElement below_society_value(){
	WebElement_wait(below_society_value);
	return below_society_value;} /*
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
