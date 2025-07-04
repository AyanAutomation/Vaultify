package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Login_locaters extends Repeatative_Codes{
	
	
	@FindBy(xpath="//*[@name='email']")
	private WebElement  emailid;
	@FindBy(xpath="//*[@type='tel']")
	private WebElement  phnum;
	@FindBy(xpath="//*[@name='password']")
	private WebElement password;
	@FindBy(xpath="(//*[@role='button'])[2]")
	private WebElement  eyebutton;
	@FindBy(xpath="(//*[@type='submit'])")
	private WebElement  submit_button;
	@FindBy(xpath="(//*[text()='OTP.'])")
	private WebElement  OTP_page_Title;
	@FindBy(xpath="//input")
	public List <WebElement> inputs;
	@FindBy(xpath="(//button)[1]")
	private WebElement  verify_otp_BUtton;
	@FindBy(xpath="//*[@class='h-full']//button")
	private WebElement  role_dropdown;
	@FindBy(xpath="//*[@class='text-foreground']")
	private WebElement  drodpdowm_option;
	@FindBy(xpath="//*[text()='Select your']")
	private WebElement  Select_role_page;
	@FindBy(xpath="//*[@class='mt-4 pb-3 3xl:mt-6']")
	private WebElement  Login_confirmed; 
	@FindBy(xpath="//*[@aria-live='polite']")
	private WebElement  success_Toast; 
	@FindBy(xpath="//*[@class='text-red-500 text-sm']")
	private WebElement error_message;/*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;   */
	
	public Login_locaters(WebDriver d){
		
	super(d);
	PageFactory.initElements(d, this);
	
	}
	
	
	
	    public WebElement emailid(){
	    WebElement_wait(emailid);
		return emailid;}
		public WebElement phnum(){
		WebElement_wait(phnum);
		return phnum;}
		public WebElement password(){
		WebElement_wait(password);
		return password;}
		public WebElement eyebutton(){
		WebElement_wait(eyebutton);
		return eyebutton;}
		public WebElement submit_button(){
		WebElement_wait(submit_button);
		return submit_button;}
		public WebElement OTP_page_Title(){
		WebElement_wait(OTP_page_Title);
		return OTP_page_Title;}
		public WebElement verify_otp_BUtton(){
		WebElement_wait(verify_otp_BUtton);
		return verify_otp_BUtton;}
		public WebElement role_dropdown(){
		WebElement_wait(role_dropdown);
		return role_dropdown;}
		public WebElement drodpdowm_option(){
		WebElement_wait(drodpdowm_option);
		return drodpdowm_option;}
		public WebElement Select_role_page(){
		WebElement_wait(Select_role_page);
		return Select_role_page;}
		public WebElement Login_confirmed(){
		WebElement_wait(Login_confirmed);
		return Login_confirmed;}
		public WebElement success_Toast(){
		WebElement_wait(success_Toast);
		return success_Toast;} 
		public WebElement error_message(){
		WebElement_wait(error_message);
		return error_message;} /*
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
		return ;} */

}
