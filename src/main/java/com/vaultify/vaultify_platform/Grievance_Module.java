package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Locators.pom.Grievances_Locaters;




@Listeners(Reports_and_Listeners.Listeners.class)
public class Grievance_Module extends Admin_Modules_Access_and_check{
	
	TreeMap<String, List<String>> GRIEVANCE_ID = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> User_Comment = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> Created_date = new TreeMap<String, List<String>>();
	TreeMap<String, List<String>> Status = new TreeMap<String, List<String>>();
	List<String> Grievance = new ArrayList<String>();
	List<String> UserComments = new ArrayList<String>();
	List<String> Createddates = new ArrayList<String>();
	List<String> Statuses = new ArrayList<String>();
	
	public void Grievance_staff_assign_check() throws InterruptedException, IOException, AWTException{
		
		
		Grievances_Locaters p = new Grievances_Locaters(d);
		
		Grievance_List_data_fetcher();
		
		}
	
	
	
	
	
	@Test
	public void Grievance_List_data_Inserter() throws InterruptedException, IOException, AWTException{
		
        Grievances_Locaters p = new Grievances_Locaters(d);
		
		
		
		Grivance_Management();
		Thread.sleep(800);
		int Count = p.Grievance_Column_id_datas().size();
		IntStream.range(0, Count).forEach(n->{
			Grievance.add(p.Grievance_Column_id_datas().get(n).getText());
			UserComments.add(p.User_comment_Column_datas().get(n).getText());
			Createddates.add(p.Grievance_creation_date_datas().get(n).getText());
			Statuses.add(p.Statuses().get(n).getText());});
			
		GRIEVANCE_ID.put("GRIEVANCE_ID --------------------------", Grievance);
		User_Comment.put("User Comments --------------------------", UserComments);
		Created_date.put("Created date --------------------------", Createddates);
		Status.put("Statuses --------------------------", Statuses);
		Grievance_List_data_fetcher();}
		
		
	    
		public void Grievance_List_data_fetcher() throws InterruptedException, IOException, AWTException {
		
		
		Grievance_List_data_Inserter();
		for(Map.Entry<String, List<String>> pair1:GRIEVANCE_ID.entrySet()) {
		System.out.println(pair1.getKey());
		System.out.println();
		for(String value1:pair1.getValue()){
			System.out.println(value1);
			System.out.println();}}
		for(Map.Entry<String, List<String>> pair2:User_Comment.entrySet()) {
			System.out.println(pair2.getKey());
			System.out.println();
			for(String value2:pair2.getValue()){
				System.out.println(value2);
				System.out.println();}}
		for(Map.Entry<String, List<String>> pair3:Created_date.entrySet()) {
			System.out.println(pair3.getKey());
			System.out.println();
			for(String value3:pair3.getValue()){
				System.out.println(value3);
				System.out.println();}}
		for(Map.Entry<String, List<String>> pair4:Status.entrySet()) {
			System.out.println(pair4.getKey());
			System.out.println();
			for(String value4:pair4.getValue()){
				System.out.println(value4);
				System.out.println();}}}
		
		
		@Test
		public void all_collections_cleaner(){
			
			GRIEVANCE_ID.clear();
			if(GRIEVANCE_ID.size()==0){
			       System.out.println("GRIEVANCE_ID cleared");
			       System.out.println();}
			User_Comment.clear();
			if(User_Comment.size()==0){
			       System.out.println("User_Comment cleared");
			       System.out.println();}
			Created_date.clear();
			if(Created_date.size()==0){
			       System.out.println("Created_date cleared");
			       System.out.println();}
			Status.clear();
			if(Status.size()==0){
			       System.out.println("Status cleared");
			       System.out.println();}
			Grievance.clear();
			if(Grievance.size()==0){
			       System.out.println("Grievance cleared");
			       System.out.println();}
			UserComments.clear();
			if(UserComments.size()==0){
			       System.out.println("UserComments cleared");
			       System.out.println();}
			Createddates.clear();
			if(Createddates.size()==0){
			       System.out.println("Createddates cleared");
			       System.out.println();}
			Statuses.clear();
			if(Statuses.size()==0){
			       System.out.println("Statuses cleared");
			       System.out.println();}}
		
		
		
		
		
		
}
