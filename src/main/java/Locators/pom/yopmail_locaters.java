package Locators.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class yopmail_locaters extends Repeatative_Codes{

	
	@FindBy(xpath="//input[@class='ycptinput']")
	private WebElement  search_bar;
	@FindBy(xpath="//button[@class='md']")
	private WebElement  search_button;
	@FindBy(id="refresh")
	private WebElement refresh_button; /*
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
	
	
	public yopmail_locaters(WebDriver d){
		
	super(d);	
    PageFactory.initElements(d, this);	}
	
	
	
	
	    public WebElement search_bar(){
		WebElement_wait(search_bar);	
		return search_bar;}
		public WebElement search_button(){
		WebElement_wait(search_button);
		return search_button;}
		public WebElement refresh_button(){
		WebElement_wait(refresh_button);
		return refresh_button;} /*
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
