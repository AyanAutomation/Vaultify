package Locators.pom;

import java.util.List;

import org.openqa.selenium.By;
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
	private List <WebElement>  Action_buttons; 
	@FindBy(xpath="//tbody//tr[@class='rc-table-row rc-table-row-level-0']")
	private List <WebElement> rows; 
	@FindBy(xpath="//div[@role='alert']")
	private WebElement  error_message;
	@FindBy(xpath="//div[@class='bg-white rounded-lg shadow-lg p-6 w-1/3']")
	private WebElement  pop_up; 
	@FindBy(xpath="//ul[@aria-orientation='vertical']")
	private WebElement  dropdown_list; 
	@FindBy(xpath="//*[@class='bg-black text-white px-4 py-2 rounded']")
	private WebElement Assign_button; /*
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
	return Action_buttons;} 
	public List <WebElement> rows(){
	WebElements_waits(rows);
	return rows;} 
	public WebElement error_message(){
	WebElement_wait(error_message);
	return error_message;}
	public WebElement pop_up(){
	WebElement_wait(pop_up);
	return pop_up;}
	public WebElement popup_dropdown(){
	pop_up();
	WebElement popup_dropdown = pop_up().findElement(By.xpath(".//div[@class='h-full']//button"));
	WebElement_wait(popup_dropdown);
	return popup_dropdown;}
	public WebElement dropdown_list(){
	WebElement_wait(dropdown_list);
	return dropdown_list;} 
	public List <WebElement> Drodpwn_options(){
	dropdown_list();	
	List <WebElement> Drodpwn_options = dropdown_list().findElements(By.xpath(".//li"));
	WebElements_waits(Drodpwn_options);
	return Drodpwn_options;}
	public WebElement Assign_button(){
	WebElement_wait(Assign_button);
	return Assign_button;} /*
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

*/
}
