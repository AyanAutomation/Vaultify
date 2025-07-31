package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class FeedBack_Locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//td[2]//p")
	private List <WebElement>  Category_details; 
	@FindBy(xpath="//td[6]//div//span")
	private List <WebElement>  Eye_buttons; /*
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
	
	public FeedBack_Locaters(WebDriver d){
		
	super(d);	
	PageFactory.initElements(d, this);	
		
		
		
	}
	
	
	
	public List <WebElement> Category_details(){
	WebElements_waits(Category_details);
	return Category_details;}
	public List <WebElement> Eye_buttons(){
	WebElements_waits(Eye_buttons);
	return Eye_buttons;}/*
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
