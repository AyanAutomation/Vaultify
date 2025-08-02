package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Grievances_Locaters extends Repeatative_Codes{

	
	
	@FindBy(xpath="//td[2]//p")
	private List <WebElement> Grievance_Column_id_datas;
	@FindBy(xpath="//td[3]//p")
	private List <WebElement>  User_comment_Column_datas;
	@FindBy(xpath="//td[4]//time[1]")
	private List <WebElement>  Grievance_creation_date_datas;
	@FindBy(xpath="//td[5]//p")
	private List <WebElement>  Statuses;
	@FindBy(xpath="//td[6]//div//span")
	private List <WebElement>  Action_buttons; /*
	@FindBy(xpath="")
	private List <WebElement>  ;
	@FindBy(xpath="")
	private List <WebElement>  ;
	@FindBy(xpath="")
	private List <WebElement>  ;
	@FindBy(xpath="")
	private List <WebElement>  ;
	@FindBy(xpath="")
	private List <WebElement>  ;
	@FindBy(xpath="")
	private List <WebElement>  ;  */
	
	
	
	public Grievances_Locaters(WebDriver d){
		
	super(d);	
    PageFactory.initElements(d, this);	}
	
	 
	public List <WebElement> Grievance_Column_id_datas(){
	WebElements_waits(Grievance_Column_id_datas);
	return Grievance_Column_id_datas;}
	public List <WebElement> User_comment_Column_datas(){
	WebElements_waits(User_comment_Column_datas);
	return User_comment_Column_datas;}
	public List <WebElement> Grievance_creation_date_datas(){
	WebElements_waits(Grievance_creation_date_datas);
	return Grievance_creation_date_datas;}
	public List <WebElement> Statuses(){
	WebElements_waits(Statuses);	
	return Statuses;}
	public List <WebElement> Action_buttons(){
	WebElements_waits(Action_buttons);
	return Action_buttons;} /*
	public List <WebElement> (){
	WebElements_waits();
	return ;}
	public List <WebElement> (){
	WebElements_waits();
	return ;}
	public List <WebElement> (){
	WebElements_waits();
	return ;}
	public List <WebElement> (){
	WebElements_waits();
	return ;}

*/
}
