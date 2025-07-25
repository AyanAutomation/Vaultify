package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Talk_to_Expert_locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//td[1]//figure")
	private List <WebElement> user_details;  
	@FindBy(xpath="//td[2]//figure")
	private List <WebElement> Plan_details; 
	@FindBy(xpath="//td[5]//p")
	private List <WebElement> Expert_details; 
	@FindBy(xpath="//td[6]//p[1]")
	private List <WebElement> Assigned_staff; 
	@FindBy(xpath="//td//button")
	private List <WebElement>  talk_toExpert_assign_buttons; 
	@FindBy(xpath="//h4")
	private List <WebElement> staff_names; 
	@FindBy(xpath="//div[@class='space-y-4']//button")
	private List <WebElement> staff_assign_buttons; 
	@FindBy(xpath="//div[@class='space-y-4']")
	private WebElement  popup_staff_list; /*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ; */
	
      public Talk_to_Expert_locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);}
      
      
  	public List <WebElement> user_details(){
  	WebElements_waits(user_details);	
  	return user_details;} 
  	public List <WebElement> Plan_details(){
  	WebElements_waits(Plan_details);	
  	return Plan_details;} 
  	public List <WebElement> Expert_details(){
  	WebElements_waits(Expert_details);	
  	return Expert_details;}
  	public List <WebElement> Assigned_staff(){
  	WebElements_waits(Assigned_staff);	
  	return Assigned_staff;}
	public List <WebElement> talk_toExpert_assign_buttons(){
  	WebElements_waits(talk_toExpert_assign_buttons);	
  	return talk_toExpert_assign_buttons;}
	public List <WebElement> staff_names(){
	WebElements_waits(staff_names);	
	return staff_names;}
	public List <WebElement> staff_assign_buttons(){
	WebElements_waits(staff_assign_buttons);	
	return staff_assign_buttons;}
	public WebElement popup_staff_list() throws InterruptedException{
	WebElement_wait(popup_staff_list);	
	movetoElements(popup_staff_list);
	return popup_staff_list;}
      
      
      
      
	

}
