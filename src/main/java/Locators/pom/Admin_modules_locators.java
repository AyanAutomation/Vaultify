package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_modules_locators {
	
	@FindBy(xpath="//a[@class='group relative mx-3 my-0.5 flex items-center justify-between rounded-md px-3 py-2 font-medium capitalize lg:my-1 2xl:mx-5 2xl:my-2 text-gray-700 transition-colors duration-200 hover:bg-gray-100 hover:text-gray-900 dark:text-gray-700/90']")
	public List <WebElement> Menu_modules ;
	@FindBy(xpath="(//h2)[1]")
	private WebElement page_headeings; 
	@FindBy(xpath="//*[@class='rizzui-collapse-panel']")  
	public List <WebElement> dropdown_submenu; 
	@FindBy(xpath="//*[@class='rizzui-collapse-panel']//a")
	public List <WebElement>  submenuitems; 
	@FindBy(xpath="//*[@class='simplebar-content']")
	private WebElement  sideMenu; /*
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
	private WebElement  ;  */


	public Admin_modules_locators(WebDriver d){
	PageFactory.initElements(d, this); }

	public WebElement page_headeings(){
	return page_headeings;}  
	public WebElement sideMenu(){
	return sideMenu;} /*
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}
	public WebElement (){
	return ;}  */
}
