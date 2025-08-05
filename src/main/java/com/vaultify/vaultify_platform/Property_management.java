package com.vaultify.vaultify_platform;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vaultify.Repeat_codes.List_slide;

import Locators.pom.Admin_modules_locators;
import Locators.pom.Bidding_Management_Locaters;
import Locators.pom.Property_locaters;
import Locators.pom.Society_locaters;

@Listeners(Reports_and_Listeners.Listeners.class)
public class Property_management extends Admin_Modules_Access_and_check{
	
	
	public String Resultant_propertyname;
	public List<WebElement> rolespresent;
	public List<WebElement> employeepresent_in_eachroles;
	public List<String> societies_in_list = new ArrayList<>();;
	List<String> hiddengems_status = new ArrayList<>();

	
	@Test
	public void Property_Search() throws InterruptedException, IOException, AWTException{
		
		
		Property_locaters p = new Property_locaters(d);
		TreeSet <String> tree = new TreeSet<String>();
		
		Property_Soceity_Management(0);
		p.property_searchbar();
		tree = Pagination_change();
		System.out.println("Extracted Property Names =  "+tree);
		System.out.println();
		p.property_searchbar().sendKeys(tree.getLast());
		Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);
		String propertynamelabel= p.property_listNames().get(0).getText();
    	String[] propertynamelabel_split = propertynamelabel.split(": ");
		Resultant_propertyname = propertynamelabel_split[1];
		System.out.println(tree.getLast().equalsIgnoreCase(Resultant_propertyname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");
		System.out.println();
		//propertydelete();
		}
	
    public TreeSet<String> Pagination_change() throws InterruptedException{
    	
    	Property_locaters p = new Property_locaters(d);
    	JavascriptExecutor js = (JavascriptExecutor)d;
    	TreeSet <String> tree = new TreeSet<String>();
    	
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,1800)");
    	Thread.sleep(800);
    	p.pagination_box().click();
    	p.pagination_options();
    	p.pagination_options().get(4).click();
    	Thread.sleep(800);
    	js.executeScript("window.scrollBy(0,-800)");
    	Thread.sleep(800);
    	p.property_listNames();
    	IntStream.range(0, p.property_listNames().size()).forEach(pname->{
    	String propnamelabel= p.property_listNames().get(pname).getText();
    	String[] propnamelabel_split = propnamelabel.split(": ");
    	tree.add(propnamelabel_split[1]);
    	});
    	
    	return tree;
    	
    	}

    
        @Test
        public void propertydelete() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        List_slide lsd = new List_slide(d);	
        
        Property_Soceity_Management(0);
		p.property_searchbar();	
        lsd.List_slides(2);
        p.list_Delete_buttons();	
        p.list_Delete_buttons().get(2).click();	
        p.popup_Tooltip();
        Thread.sleep(400);	
        p.Tooltip_buttons().get(0).click();	
        Thread.sleep(1400);}

        @Test
        public void Home_visit_pending_property_Search() throws IOException, InterruptedException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);
        Admin_modules_locators ad = new Admin_modules_locators(d);	
        TreeSet<String> st = new TreeSet<String>();
        
        
        st.addAll(Home_visit_Pending_Module_Access());
        System.out.println("Listed Homevisit pending Properties are --->>   "+st);
        System.out.println();
        p.property_searchbar().sendKeys(st.last());	
        Thread.sleep(800);
		p.Search_button().click();
		Thread.sleep(800);	
		ad.Home_visit_pending_properties();	
		Thread.sleep(800);
        String pendingpropname = 	ad.Home_visit_pending_properties().get(0).getText();
        System.out.println(st.last().equalsIgnoreCase(pendingpropname) ? "Testcase Passed search wokring" :"Testcase Failed search notwokring");	
        System.out.println();
        }
        
        
        @Test
        public void Property_Update_Approval_Propertynames() throws InterruptedException, IOException, AWTException{
        	
        Property_locaters p = new Property_locaters(d);	
        TreeSet <String> tree = new TreeSet<String>();
        	
        Property_Update_Approval_Module_Access();	
        p.property_update_list_loaded();	
        p.Pending_update_property_names();
        IntStream.range(0, p.Pending_update_property_names().size()).forEach(nam->{
        tree.add(p.Pending_update_property_names().get(nam).getText());});
        for(String eachtreevalue : tree) {
        System.out.print(eachtreevalue);
        System.out.println();}
        }
        
        
        
       @Test
       public void Property_Staff_assign() throws InterruptedException, IOException, AWTException{
        	
       Property_locaters p = new Property_locaters(d);
       TreeMap <String,String> treemap = new TreeMap<String, String>();
       
       property_view_details_accessor(0);
       p.Assign_Employee_button().click();
       Thread.sleep(600);
       rolespresent =   p.Role_Names();
       employeepresent_in_eachroles = p.employees_in_role();
       IntStream.range(0, rolespresent.size()).forEach(rc->{
       treemap.put(rolespresent.get(rc).getText(),employeepresent_in_eachroles.get(rc).getText());});
       System.out.println(treemap);
       System.out.println();
       try{
       Civil_engineer_assign();}catch(Exception e){
       System.out.println("Exception found in Civil engineer assign");}try{
       loan_adviser_assign();}catch(Exception f){
       System.out.println("Exception found in loan_adviser_assign");
       System.out.println();}try{
       lawyer_assign();}catch(Exception g){
 	   System.out.println("Exception found in lawyer_assign");
 	   System.out.println();}
 	   try{Relationship_Managers_assign();}catch(Exception h){
 	   System.out.println("Exception found in Relationship_Managers_assign");
 	   System.out.println();}
 	   try{CA_assign();}catch(Exception i){
 	   System.out.println("Exception found in CA_assign");
 	   System.out.println();}
 	   try{Investment_Advisors_assign();}catch(Exception jk){
 	   System.out.println("Exception found in Investment_Advisors_assign");
 	   System.out.println();}
 	   try{Multitasking_Partner_assign();}catch(Exception kj){
 	   System.out.println("Exception found in Multitasking_Partner_assign");
 	   System.out.println();}
 	   p.modal_close_button().click();
 	   Thread.sleep(500);
 	   try{p.approve_property_button();}catch(Exception mo){
 	   System.out.println("post assigning all employee assign property button don't appear thereby have to refresh the page");
 	   d.navigate().refresh();
 	   p.approve_property_button();}}
         
      
         
         
         
       
       public void property_view_details_accessor(int l)throws InterruptedException, IOException, AWTException{
    	   
    	   Property_locaters p = new Property_locaters(d);
    	   List_slide lsd = new List_slide(d);	
    	   
    	   Property_Soceity_Management(0);
    	   p.property_searchbar();	
           lsd.List_slides(2);
           p.list_view_buttons();	
           p.list_view_buttons().get(l).click();
           p.Assign_Employee_button();
           Thread.sleep(800);}  
       
        
        
        
        
      public void Civil_engineer_assign() throws InterruptedException{
    	  
      Property_locaters p = new Property_locaters(d);	
      JavascriptExecutor js = (JavascriptExecutor)d;
      
      
      for(WebElement rolepresent:rolespresent){
   	  if(rolepresent.getText().equalsIgnoreCase("Civil Engineers *")){
   		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
   		   rolepresent.click();
   		   Thread.sleep(700);
   		   List <WebElement> employees_inside_roles = p.inside_employees();
   		   Thread.sleep(600);
   		   for(WebElement eachemployee: employees_inside_roles){
   		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
   		   			System.out.println("Civil engineer Assigned is  "+eachemployee.getText());
   		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
   		   			break;}}}}}
      
      
      public void loan_adviser_assign() throws InterruptedException{
    	  
          Property_locaters p = new Property_locaters(d);	
          JavascriptExecutor js = (JavascriptExecutor)d;
        
	
         
          for(WebElement rolepresent:rolespresent){
       	  
              if(rolepresent.getText().equalsIgnoreCase("Loan Advisors *")){
       		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
       		   rolepresent.click();
       		   Thread.sleep(700);
       		   List <WebElement> employees_inside_roles = p.inside_employees();
       		   Thread.sleep(600);
       		   for(WebElement eachemployee: employees_inside_roles){
       		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
       		   			System.out.println("Loan Advisors Assigned is  "+eachemployee.getText());
       		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
       		   			break;}}}}}

        public void lawyer_assign() throws InterruptedException{
    	  
          Property_locaters p = new Property_locaters(d);	
          JavascriptExecutor js = (JavascriptExecutor)d;
        	
         
          for(WebElement rolepresent:rolespresent){
       	  
              if(rolepresent.getText().equalsIgnoreCase("Lawyers *")){
       		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
       		   rolepresent.click();
       		   Thread.sleep(700);
       		   List <WebElement> employees_inside_roles = p.inside_employees();
       		   Thread.sleep(600);
       		   for(WebElement eachemployee: employees_inside_roles){
       		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
       		   			System.out.println("Lawyers Assigned is  "+eachemployee.getText());
       		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
       		   			break;}}}}}
        
        public void Relationship_Managers_assign() throws InterruptedException{
      	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          
           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Relationship Managers *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
         		   			System.out.println("Relationship Managers Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        
        public void CA_assign() throws InterruptedException{
        	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          

           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("CA *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
         		   			System.out.println("CA Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        public void Investment_Advisors_assign() throws InterruptedException{
      	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          

           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Investment Advisors *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
         		   			System.out.println("Investment Advisors Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
        
        
        public void Multitasking_Partner_assign() throws InterruptedException{
        	  
            Property_locaters p = new Property_locaters(d);	
            JavascriptExecutor js = (JavascriptExecutor)d;
          
           
            for(WebElement rolepresent:rolespresent){
         	  
                if(rolepresent.getText().equalsIgnoreCase("Multitasking Partner *")){
         		   js.executeScript("arguments[0].scrollIntoView(true);",rolepresent); 
         		   rolepresent.click();
         		   Thread.sleep(700);
         		   List <WebElement> employees_inside_roles = p.inside_employees();
         		   Thread.sleep(600);
         		   for(WebElement eachemployee: employees_inside_roles){
         		   		 if(!eachemployee.getText().contains("Nikolai Ivanov")){
         		   			System.out.println("Multitasking Partner Assigned is  "+eachemployee.getText());
         		   			eachemployee.findElement(By.xpath(".//button[contains(text(),'Assign')]")).click();
         		   			break;}}}}}
      
        
        
        @Test
        public TreeMap<String,String> property_details_Data_fetch()throws InterruptedException, IOException, AWTException{
        	
        	 Property_locaters p = new Property_locaters(d);
             JavascriptExecutor js = (JavascriptExecutor)d;
             List<String> property_card_details = new ArrayList<>();
             List<String> property_details_below_Datas = new ArrayList<>();
             TreeMap<String,String> user_property_names = new TreeMap<String,String>();
        	
             property_view_details_accessor(0);
        	 p.property_card_details();
        	 p.property_details_below_Datas();
        	 System.out.println("property_card_details list size "+p.property_card_details().size());
        	 System.out.println();
        	 System.out.println("property_details_below_Datas list size "+p.property_details_below_Datas().size());
        	 System.out.println();
        	 for(WebElement card:p.property_card_details()){
        		  property_card_details.add(card.getText());}
        	 for(WebElement below_details:p.property_details_below_Datas()){
        		 property_card_details.add(below_details.getText());}
        	 for(int o=0; o<property_card_details.size();o++){
        		 
        		 System.out.println(property_card_details.get(o));
        		 System.out.println();
        	 }
             for(int n=0; n<property_details_below_Datas.size();n++){
            	 
            	 System.out.println(property_details_below_Datas.get(n));
        		 System.out.println(); }       	 
        	 
         p.security_deposit_details();
         String usernameline_text =  p.security_deposit_details().get(v).getText();
         String[] userlinesplit = usernameline_text.split("-");
         String user = userlinesplit[1].trim();
         System.out.println("user who added this property and paid security deposit is   "+user);
         System.out.println();
         user_property_names.put("username", user);
         js.executeScript("arguments[0].scrollIntoView(true);",p.property_name_text());
         Thread.sleep(800);
         p.property_name_text();
         user_property_names.put("property name", p.property_name_text().getText());
         return user_property_names;
        	
        }
        
        
        
        
        
        
        
        
        
        
        @Test 
        public void propertyList_filtercheck()throws InterruptedException, IOException, AWTException{
    	  
        Property_locaters p = new Property_locaters(d);
        Bidding_Management_Locaters pp = new Bidding_Management_Locaters(d); 
        TreeSet<String> settr = new TreeSet<String>();
        
        Property_Soceity_Management(0);
		p.property_searchbar();  
		 p.property_list_hiddenGems_data();
		for(WebElement gems:p.property_list_hiddenGems_data()){
			hiddengems_status.add(gems.getText());
		}
    	pp.filter_button().click();
        p.filter_dropdowns().get(0).click();
        String selected_option= pp.filter_dropdown_options().get(0).getText();
		System.out.println("Status selected "+selected_option);
		System.out.println();
    	pp.filter_dropdown_options().get(0).click();  
    	Thread.sleep(1800);
    	try { p.property_list_hiddenGems_data();
    	for(WebElement hiddengem: p.property_list_hiddenGems_data()){
    		
    		System.out.println(hiddengem.getText());
    		settr.add(hiddengem.getText());
    		} 
    	if(hiddengems_status.contains("Marked")) {
    	if(settr.contains("Not Marked")){
    		
    		System.out.println(" testcase failed filter not working selected hidden gems showing non hidden gems");
    		System.out.println();}
    	}}catch(Exception keo){
    		
    		System.out.println(" testcase failed filter not working selected hidden gems showing not hidden gems");
    		System.out.println();
    		}}}



        @Listeners(Reports_and_Listeners.Listeners.class)
        class Society_management extends Property_management{
        	
            @Test(dataProvider="getSocietyData")	
        	public void Society_add(TreeMap<String, String> data)throws InterruptedException, IOException, AWTException{
        		
        	Society_locaters p = new Society_locaters(d); 
        	TreeSet <String> tst = new TreeSet<String>();
        	
        	Property_Soceity_Management(2);
        	p.society_Add_button().click();
        	p.landed_in_society_add_form();
        	Thread.sleep(600);
        	p.input_fields();
        	p.input_fields().get(0).sendKeys(data.get("Societyname"));
        	p.input_fields().get(1).sendKeys(data.get("Area"));	
        	p.input_fields().get(2).sendKeys(data.get("Landmark"));		
        	p.input_fields().get(3).sendKeys(data.get("AddressAddress"));	
        	p.input_fields().get(4).sendKeys(data.get("Short Description"));
        	p.submit_button().click();
        	Thread.sleep(600);;
        	System.out.println(p.success_Toast().getText());
        	System.out.println();
        	p.society_names_in_list();
        	for(WebElement societyname:p.society_names_in_list()){
            	  
        		  tst.add(societyname.getText());
            	if(societyname.getText().contains(data.get("Societyname"))) {
            		
            		System.out.println("Testcase passed "+societyname.getText()+" is present in list");
            		System.out.println();
            		break;}}}
            
            
            
            
            
            
        	@DataProvider
            public Object[][] getSocietyData() {
        		
        		
        		TreeMap<String, String> tmap1 = new TreeMap<>();
                tmap1.put("Societyname", "Silver Sand Residency");
                tmap1.put("Area", "Naktala");
                tmap1.put("Landmark", "Near Usha Bus Stop");
                tmap1.put("AddressAddress", "22, Garia Main Road, Naktala, Kolkata - 700047");
                tmap1.put("Short Description", "Quiet family-centric flats near schools and parks.");

                TreeMap<String, String> tmap2 = new TreeMap<>();
                tmap2.put("Societyname", "Amber Heights");
                tmap2.put("Area", "Teghoria");
                tmap2.put("Landmark", "Opposite Haldiram Flyover");
                tmap2.put("AddressAddress", "99, V.I.P Road, Teghoria, Kolkata - 700059");
                tmap2.put("Short Description", "Urban-styled tower with 360° rooftop lounge.");

                TreeMap<String, String> tmap3 = new TreeMap<>();
                tmap3.put("Societyname", "Shree Durga Residency");
                tmap3.put("Area", "Sodepur");
                tmap3.put("Landmark", "Next to Panihati Municipality");
                tmap3.put("AddressAddress", "Ghoshpara Road, Sodepur, Kolkata - 700110");
                tmap3.put("Short Description", "Spiritual vibe with temple complex and aarti mandap.");

                TreeMap<String, String> tmap4 = new TreeMap<>();
                tmap4.put("Societyname", "Eastern Harmony");
                tmap4.put("Area", "Kalikapur");
                tmap4.put("Landmark", "Beside Metro Cash & Carry");
                tmap4.put("AddressAddress", "Kalikapur Bypass, Kolkata - 700099");
                tmap4.put("Short Description", "Corporate-friendly flats near IT hubs with concierge.");

                TreeMap<String, String> tmap5 = new TreeMap<>();
                tmap5.put("Societyname", "Navya Niketan");
                tmap5.put("Area", "Jadavpur");
                tmap5.put("Landmark", "Near 8B Bus Stand");
                tmap5.put("AddressAddress", "Gariahat Road (South), Jadavpur, Kolkata - 700032");
                tmap5.put("Short Description", "Gated society with indoor games and library corner.");

                TreeMap<String, String> tmap6 = new TreeMap<>();
                tmap6.put("Societyname", "Sunset Heights");
                tmap6.put("Area", "Joka");
                tmap6.put("Landmark", "Near IIM Calcutta");
                tmap6.put("AddressAddress", "Diamond Harbour Road, Joka, Kolkata - 700104");
                tmap6.put("Short Description", "Modern apartments built for students and families alike.");

                TreeMap<String, String> tmap7 = new TreeMap<>();
                tmap7.put("Societyname", "Rose Garden Estates");
                tmap7.put("Area", "Manicktala");
                tmap7.put("Landmark", "Adjacent to Manicktala Market");
                tmap7.put("AddressAddress", "2A, Vivekananda Road, Manicktala, Kolkata - 700054");
                tmap7.put("Short Description", "Boutique apartments with terrace café and library.");

                TreeMap<String, String> tmap8 = new TreeMap<>();
                tmap8.put("Societyname", "Starview Apartments");
                tmap8.put("Area", "Baghajatin");
                tmap8.put("Landmark", "Next to Peerless Hospital");
                tmap8.put("AddressAddress", "47, Baghajatin Station Road, Kolkata - 700086");
                tmap8.put("Short Description", "Compact flats perfect for small families and seniors.");

                return new Object[][] {
                    {tmap1},
                    {tmap2},
                    {tmap3},
                    {tmap4},
                    {tmap5},
                    {tmap6},
                    {tmap7},
                    {tmap8}
                };}	
        	
        	
        	@Test(dataProvider="getSocietyData")
        	public void checking_added_society_in_propertyDetails(TreeMap<String, String> data) throws InterruptedException, IOException, AWTException{
        		
        		
        		Society_locaters p = new Society_locaters(d);
        		JavascriptExecutor js = (JavascriptExecutor)d;
        		
        		
        		property_view_details_accessor(1);	
        		p.Add_society_button_property_details().click();
        		p.dropdown().click();
        		p.dropdown_options();
        		for(WebElement societyname:p.dropdown_options()){
        			
        		 if(societyname.getText().equalsIgnoreCase(data.get("Societyname"))){
        				System.out.println(societyname.getText()+" is present thereby Testcase passed");
        				System.out.println();
        				societyname.click();
        				break;}}
        		Thread.sleep(800);
        		p.Assign_button().click();
        		Thread.sleep(800);
        		js.executeScript("window.scrollBy(0,1450)"); 
        		Thread.sleep(1800);
        		System.out.println(p.below_society_value().getText().equalsIgnoreCase(data.get("Societyname"))?" Testcase Passed society selected is shown below":" Testcase Failed society selected is not shown below");
        		System.out.println();
        	} 
        	
        	@Test
        	public void Society_search()throws InterruptedException, IOException, AWTException{
        		
        		Society_locaters p = new Society_locaters(d);
        		Pagination_nextpage_navigation pgn = new Pagination_nextpage_navigation();
        		Property_locaters pp = new Property_locaters(d);
     
        		
        		Property_Soceity_Management(2);
        		Thread.sleep(800);
        	   Thread.sleep(800);
        		for(WebElement Societyname:p.society_names_in_list()){
        			System.out.println("Society names are =  "+Societyname.getText());
        			System.out.println();
        			Thread.sleep(200);
        			societies_in_list.add(Societyname.getText());}
        		System.out.println("Society name that is searched is "+societies_in_list.get(2));
    			System.out.println();
        		pp.property_searchbar().sendKeys(societies_in_list.get(2));
        		pp.Search_button().click();
        		Thread.sleep(2200);
        		String Society_search_result_firstpage = p.society_names_in_list().get(0).getText();
        		System.out.println(Society_search_result_firstpage.equalsIgnoreCase(societies_in_list.get(2))?" Testcase Passes society search result of first page matches searched society":" Testcase Failed society search result of first page doesn't matches searched society");
        		System.out.println();try {
        		pgn.nextpage_navigate(d);
        		pp.property_searchbar().sendKeys(societies_in_list.get(2));
        		pp.Search_button().click();
        		Thread.sleep(2200);
        		String Society_search_result_secondpage = p.society_names_in_list().get(0).getText();
        		System.out.println(Society_search_result_secondpage.equalsIgnoreCase(societies_in_list.get(2))?" Testcase Passes society search result second page also matches with searched society":" Testcase Failed society search result second page also doesn't match with searched society");
        		}catch(Exception kog){
        			System.out.println("pagination not implemented in Society list");
        			System.out.println();	
        		}
        	}
        	
        	
        	
        	
        	
        	
        }



