package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//td//figcaption//p[1]")
	private List <WebElement>  property_listNames;
	@FindBy(xpath="(//div[@class='table-filter mb-4 flex items-center justify-between']//button)[2]")
	private WebElement  Search_button; 
	@FindBy(xpath="//*[@class='rc-table-content']")
	private WebElement slider;
	@FindBy(xpath="//div[@class='flex items-center justify-end gap-3 pe-4']//button")
	private List <WebElement>  list_buttons;
	@FindBy(xpath="//div[@role='tooltip']")
	private WebElement  popup_Tooltip;/*
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
	return property_listNames;} 
	public WebElement Search_button(){
	WebElement_wait(Search_button);
	return Search_button;} 
	public WebElement slider(){
	WebElement_wait(slider);
	return slider;}
	public List <WebElement> list_buttons(){
	WebElements_waits(list_buttons);	
	return list_buttons;}
	public WebElement popup_Tooltip(){
	WebElement_wait(popup_Tooltip);
	return popup_Tooltip;}
	public List <WebElement> Tooltip_buttons(){
	WebElement_wait(popup_Tooltip);
	List<WebElement> buttons = popup_Tooltip.findElements(By.xpath(".//button"));
	return buttons;}/*
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
