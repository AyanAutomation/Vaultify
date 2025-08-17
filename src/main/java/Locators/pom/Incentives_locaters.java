package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Incentives_locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//*[text()='Add Master Incentives']")
	private WebElement  Incentive_add_button;
	@FindBy(xpath="//*[text()='Enter User Type']")
	private WebElement  Inside_form_Confirmation;
	@FindBy(xpath="(//form[@class='relative z-[19]']//div)[3]//button")
	private List <WebElement> Form_dropdown_buttons ;
	@FindBy(xpath="//ul//li")
	private List <WebElement>  Dropdown_Options;
	@FindBy(xpath="//input")
	private List <WebElement>  Amount_input_Boxes;
	@FindBy(xpath="//button[text()='Create Incentive']")
	private WebElement Incentive_adButton; /*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;   */
	
	
	public Incentives_locaters(WebDriver d){
		
	super(d);	
    PageFactory.initElements(d, this);	}
	
	public WebElement Incentive_add_button(){
	WebElement_wait(Incentive_add_button);
	return Incentive_add_button;}
	public WebElement Inside_form_Confirmation(){
	WebElement_wait(Inside_form_Confirmation);
	return Inside_form_Confirmation;}
	public List <WebElement> Form_dropdown_buttons(){
	WebElements_waits(Form_dropdown_buttons);
	return Form_dropdown_buttons;}
	public List <WebElement> Dropdown_Options(){
	WebElements_waits(Dropdown_Options);	
	return Dropdown_Options;}
	public List <WebElement> Amount_input_Boxes(){
	WebElements_waits(Amount_input_Boxes);
	return Amount_input_Boxes;}
	public WebElement Incentive_adButton(){
		WebElement_wait(Incentive_adButton);
	return Incentive_adButton;}
	
	
	
	

}
