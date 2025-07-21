package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class staff_attendance_locaters extends Repeatative_Codes{
	
	
	
	
	
	@FindBy(xpath="(//*[@class='flex h-full flex-col p-5']//button)")
	private List <WebElement>  filter_popupbuttons; 
	@FindBy(xpath="//td//p")
	private WebElement no_content; 
	@FindBy(xpath="//td[1]//figcaption//p[1]")
	private List <WebElement> staff_names; 
	@FindBy(xpath="//td[3]//div[@class='grid gap-1']")
	private List <WebElement> login_times;  
	@FindBy(xpath="//td[5]//div[@class='flex items-center']")
	private List <WebElement> statuses; /*
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
	  
	public staff_attendance_locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);}
	
	public List <WebElement> filter_popupbuttons(){
	WebElements_waits(filter_popupbuttons);
	return filter_popupbuttons;}
	public WebElement no_content(){
	WebElement_wait(no_content);	
	return no_content;} 
	public List <WebElement> staff_names(){
	WebElements_waits(staff_names);	
	return staff_names;} 
	public List <WebElement> login_times(){
	WebElements_waits(login_times);	
	return login_times;} 
	public List <WebElement> statuses(){
	WebElements_waits(statuses);	
	return statuses;} /*
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
	return ;} */

}
