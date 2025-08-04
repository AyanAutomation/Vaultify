package Locators.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vaultify.Repeat_codes.Repeatative_Codes;

public class Refund_Module_Locators extends Repeatative_Codes{
	
	
	@FindBy(xpath="//td[1]//p")
	private List <WebElement> propnames_in_refund_list; 
	@FindBy(xpath="//div[@class='flex items-center justify-end gap-3 pe-4']//a")
	private List <WebElement> eye_buttons_inlist; 
	@FindBy(xpath="//td[5]//p")
	private List <WebElement> base_bid_prices; 
	@FindBy(xpath="//div[@class='space-y-4']//input")
	private List <WebElement>  filter_dropdowns; 
	@FindBy(xpath="//div[@class='react-datepicker__month']//div[5]")
	private WebElement  date_in_dropdown_calender; 
	@FindBy(xpath="(//*[@class='flex h-full flex-col p-5']//button)[2]")
	private WebElement  filter_result_submit_button; 
	@FindBy(xpath="//td[2]//p")
	private List <WebElement>  second_column_datas;
	@FindBy(xpath="//td[3]//p")
	private List <WebElement> Third_column_datas;
	@FindBy(xpath="//td[4]//p")
	private List <WebElement>  fourth_column_datas;
	@FindBy(xpath="//td[5]//p")
	private List <WebElement>  fifth_column_datas;
	@FindBy(xpath="//td[6]//p")
	private List <WebElement>  sixth_column_datas; 
	@FindBy(xpath="//*[@aria-label='View Property']")
	private List <WebElement> view_details_button; 
	@FindBy(xpath="(//*[@class='w-full']//div//div[2])[2]")
	private WebElement  property_details; 
	@FindBy(xpath="(//*[@class='w-full']//div//div[2])[2]//div//span/parent::div")
	private List <WebElement>  detailed_values;/*
	@FindBy(xpath="")
	private WebElement  ;
	@FindBy(xpath="")
	private WebElement  ;  */
	
	
	public Refund_Module_Locators(WebDriver d){
		super(d);
		PageFactory.initElements(d, this); }
	
	
	
	    public List <WebElement> propnames_in_refund_list(){
		WebElements_waits(propnames_in_refund_list);	
		return propnames_in_refund_list;} 
		public List <WebElement> eye_buttons_inlist(){
		WebElements_waits(eye_buttons_inlist);	
		return eye_buttons_inlist;} 
		public List <WebElement> filter_dropdowns(){
		WebElements_waits(filter_dropdowns);	
		return filter_dropdowns;}
		public WebElement date_in_dropdown_calender(){
		WebElement_wait(date_in_dropdown_calender);	
		return date_in_dropdown_calender;} 
		public WebElement filter_result_submit_button(){
		WebElement_wait(filter_result_submit_button);	
		return filter_result_submit_button;} 
		public List <WebElement> second_column_datas(){
		WebElements_waits(second_column_datas);	
		return second_column_datas;}
		public List <WebElement> Third_column_datas(){
		WebElements_waits(Third_column_datas);	
		return Third_column_datas;}
		public List <WebElement> fourth_column_datas(){
		WebElements_waits(fourth_column_datas);	
		return fourth_column_datas;}
		public List <WebElement> fifth_column_datas(){
		WebElements_waits(fifth_column_datas);	
		return fifth_column_datas;}
		public List <WebElement> sixth_column_datas(){
		WebElements_waits(sixth_column_datas);	
		return sixth_column_datas;} 
		public List <WebElement> view_details_button(){
		WebElements_waits(view_details_button);	
		return view_details_button;}      
		public WebElement property_details(){
		WebElement_wait(property_details);
		return property_details;}
		public List <WebElement> detailed_values(){
		WebElements_waits(detailed_values);
		return detailed_values;} /*
		public WebElement (){
		WebElement_wait();
			return ;} */
}
