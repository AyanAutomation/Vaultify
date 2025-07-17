package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Cms_and_versity_locators extends Repeatative_Codes{
	
	
	@FindBy(xpath="//input")
	private WebElement search_bar; 
	@FindBy(xpath="//div[@class='flex h-screen']//button")
	private List<WebElement> buttons; 
	@FindBy(xpath="//li//span[2]")
	private List<WebElement> page_statuses; 
	@FindBy(xpath="//div[@class='p-6']")
	private WebElement add_form; 
	@FindBy(xpath="//div[@class='ck ck-editor__main']/div")
	private WebElement  ck_editor; 
	@FindBy(xpath="//div[@class='flex justify-end w-full mt-4']/button")
	private WebElement form_submit_button; 
	@FindBy(xpath="//div[@class='flex gap-2 mt-4']/button")
	private List<WebElement> page_details_bottom_buttons; /*
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
	
	
	public Cms_and_versity_locators(WebDriver d){
		
	    super(d);
		PageFactory.initElements(d, this);
		
	}
	
	
	
	
	
	
	public WebElement search_bar(){
	WebElement_wait(search_bar);
	return search_bar;} 
	public List<WebElement> buttons(){
	WebElements_waits(buttons);
	return buttons;} 
	public List<WebElement> page_statuses(){
	WebElements_waits(page_statuses);	
	return page_statuses;} 
	public WebElement add_form(){
	WebElement_wait(add_form);
	return add_form;} 
	public List <WebElement> pageTitle_field(){
	List <WebElement> pageTitle_field = add_form().findElements(By.xpath(".//input"));
	WebElements_waits(pageTitle_field);
	return pageTitle_field;}
	public WebElement ck_editor(){
	WebElement_wait(ck_editor);
	return ck_editor;}
	public WebElement form_submit_button(){
	WebElement_wait(form_submit_button);
	return form_submit_button;}
	public List <WebElement> page_details_bottom_buttons(){
	WebElements_waits(page_details_bottom_buttons);
	return page_details_bottom_buttons;} /*
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
