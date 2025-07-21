package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.IntStream;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Refund_Module_Locators;
import Locators.pom.staff_attendance_locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class Staff_Attendance extends Admin_Modules_Access_and_check{

	List<String> names = new ArrayList<String>();
	List<String> time_and_date = new ArrayList<String>();
	List<String> attendance_status = new ArrayList<String>();
	TreeMap<String,String> name_and_time = new TreeMap<String,String>();
	
	
	@Test
	public void Attendence_filter_check()throws InterruptedException, IOException, AWTException{
		
		Bidding_Management_Locaters pp = new Bidding_Management_Locaters(d);
		Refund_Module_Locators p = new Refund_Module_Locators(d);
		staff_attendance_locaters s = new staff_attendance_locaters(d);
		
		Staff_Attendance_Management();
		pp.filter_button().click();
		p.filter_dropdowns().get(0).clear();
		p.filter_dropdowns().get(0).sendKeys("18-07-2025");
		s.filter_popupbuttons().get(2).click();
		try{
			s.no_content();
			System.out.println("Table has  "+s.no_content().getText());
			System.out.println();}catch(Exception kkl){
			
			System.out.println("data present in list");
			System.out.println();
		}}
	
	
	@Test
	public void Staff_attendance_List_data_fetcher() throws InterruptedException, IOException, AWTException{
		
		
	staff_attendance_locaters s = new staff_attendance_locaters(d);	
		
	Staff_Attendance_Management();	
	s.staff_names();
	IntStream.range(0, s.staff_names().size()).forEach(m->{
		names.add(s.staff_names().get(m).getText());
		time_and_date.add(s.login_times().get(m).getText());
		attendance_status.add(s.statuses().get(m).getText());});
	
	IntStream.range(0, s.staff_names().size()).forEach(p->{
		name_and_time.put(names.get(p), time_and_date.get(p));
		System.out.println(names.get(p)+"    "+ time_and_date.get(p));
		System.out.println();
		});	
		
	}
	
	
	
	
	
}
