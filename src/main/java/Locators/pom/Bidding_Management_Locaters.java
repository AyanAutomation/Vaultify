package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Bidding_Management_Locaters extends Repeatative_Codes{

	
	@FindBy(xpath="//td[1]//figcaption//p[1]")
	private List <WebElement>  property_names_inbidlist; 
	@FindBy(xpath="(//div[@class='ms-4 flex flex-shrink-0 items-center']//button[@type='button'])[1]")
	private WebElement  filter_button; 
	@FindBy(xpath="//div[@class='flex h-full flex-col p-5']//button[@aria-expanded='false']")
	private WebElement  dropdown_button; 
	@FindBy(xpath="//div[@class='h-full']//ul//li")
	private List <WebElement> filter_dropdown_options; 
	@FindBy(xpath="//*[text()='Show Results']")
	private WebElement  filter_result_submit_Button; 
	@FindBy(xpath="//td//div[@class='flex items-center']")
	private List <WebElement> statses; 
	@FindBy(xpath="//td//button")
	private List <WebElement> View_buttons;
	@FindBy(xpath="(//*[text()='Bid Details'])[2]")
	private WebElement Inside_bid_details;  /*
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
	  
	public Bidding_Management_Locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);}
	
	
	
	public List <WebElement> property_names_inbidlist(){
	WebElements_waits(property_names_inbidlist);
	return property_names_inbidlist;}
	public WebElement filter_button(){
	WebElement_wait(filter_button);
	return filter_button;} 
	public WebElement dropdown_button(){
	WebElement_wait(dropdown_button);	
	return dropdown_button;} 
	public List <WebElement> filter_dropdown_options(){
	WebElements_waits(filter_dropdown_options);
	return filter_dropdown_options;} 
	public WebElement filter_result_submit_Button(){
	WebElement_wait(filter_result_submit_Button);
	return filter_result_submit_Button;} 
	public List <WebElement> statses(){
	WebElements_waits(statses);
	return statses;} 
	public List <WebElement> View_buttons(){
	WebElements_waits(View_buttons);
	return View_buttons;} 
	public WebElement Inside_bid_details(){
	WebElement_wait(Inside_bid_details);
	return Inside_bid_details;} /*
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
