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
	private WebElement no_content; /*
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
	  
	public staff_attendance_locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);}
	
	public List <WebElement> filter_popupbuttons(){
	WebElements_waits(filter_popupbuttons);
	return filter_popupbuttons;}
	public WebElement no_content(){
	WebElement_wait(no_content);	
	return no_content;} /*
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
