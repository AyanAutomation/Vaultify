package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class user_module_locaters extends Repeatative_Codes{
	
	@FindBy(xpath="//input")
	private WebElement  user_searchbar;
	@FindBy(xpath="//*[text()='Search']")
	private WebElement  Search_button;
	@FindBy(xpath="//a[@rel='nofollow']")
	private List <WebElement> Pagination_change_button;
	@FindBy(xpath="//label//button")
	private WebElement search_clear_crossButton; /*
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
	
	
	public user_module_locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);
	}
	   public WebElement user_searchbar(){
		WebElement_wait(user_searchbar);	
		return user_searchbar;}
		public WebElement Search_button(){
		WebElement_wait(Search_button);
		return Search_button;} 
		public List <WebElement> Pagination_change_button(){
		WebElements_waits(Pagination_change_button);
		return Pagination_change_button;}
		public WebElement search_clear_crossButton(){
		WebElement_wait(search_clear_crossButton);
		return search_clear_crossButton;}/*
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
