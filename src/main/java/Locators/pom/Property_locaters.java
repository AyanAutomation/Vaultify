package Locators.pom;

import java.util.List;

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
	@FindBy(xpath="//td//figcaption//p")
	private List <WebElement>  property_listNames;/*
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
	return property_listNames;} /*
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
