package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Bidding_Management_Locaters extends Repeatative_Codes{

	
	@FindBy(xpath="//td[1]//figcaption//p[1]")
	private List <WebElement>  property_names_inbidlist; /*
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
	  
	public Bidding_Management_Locaters(WebDriver d){
		
		super(d);
		PageFactory.initElements(d, this);}
	
	
	
	public List <WebElement> property_names_inbidlist(){
		WebElements_waits(property_names_inbidlist);
	return property_names_inbidlist;}/*
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
