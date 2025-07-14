package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Refund_Module_Locators extends Repeatative_Codes{
	
	
	@FindBy(xpath="//td[1]//p")
	private List <WebElement> propnames_in_refund_list; 
	@FindBy(xpath="//div[@class='flex items-center justify-end gap-3 pe-4']//a")
	private List <WebElement> eye_buttons_inlist; 
	@FindBy(xpath="//td[5]//p")
	private List <WebElement> base_bid_prices; /*
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
	private WebElement  ;  */
	
	
	public Refund_Module_Locators(WebDriver d){
		super(d);
		PageFactory.initElements(d, this); }
	
	
	
	    public List <WebElement> propnames_in_refund_list(){
		WebElements_waits(propnames_in_refund_list);	
		return propnames_in_refund_list;} 
		public List <WebElement> eye_buttons_inlist(){
		WebElements_waits(eye_buttons_inlist);	
		return eye_buttons_inlist;} /*
		public List <WebElement> (){
		WebElements_waits();	
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
		return ;}      */

}
