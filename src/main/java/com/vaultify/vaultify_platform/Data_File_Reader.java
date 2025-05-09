package com.vaultify.vaultify_platform;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Data_File_Reader {
	
	
	public String DataKeys(String key) throws IOException{
		
		   FileInputStream fis = new FileInputStream("C:\\Users\\PC-129\\Documents\\NetBeansProjects\\Vaultify\\src\\main\\java\\Datas\\data.properties");
		   Properties p = new Properties();
		   p.load(fis);
		   String data = p.getProperty(key);
		   return data;
		
	}
	
	

}
