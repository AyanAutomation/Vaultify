package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class FeedBack_Locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//td[2]//p")
	private List <WebElement>  Category_details; 
	@FindBy(xpath="//td[6]//div[@class='flex items-center justify-end gap-3 pe-4']//span")
	private List <WebElement>  Eye_buttons; 
	@FindBy(xpath="//*[@class='p-4 space-y-4']")
	private WebElement  popup;/*
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
	return Eye_buttons;}
	public WebElement popup(){
	WebElement_wait(popup);
	return popup;} 
	public List<WebElement> SubList_data(){
	popup();
	List<WebElement> SubList_data = popup().findElements(By.xpath(".//p"));
	WebElements_waits(SubList_data);	
	return SubList_data;}
	public List<WebElement> popup_headings(){
	popup();
	List<WebElement> popup_headings = popup().findElements(By.xpath(".//h3"));
	WebElements_waits(popup_headings);	
	return popup_headings;} /*
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

*/
	
	
	

}
