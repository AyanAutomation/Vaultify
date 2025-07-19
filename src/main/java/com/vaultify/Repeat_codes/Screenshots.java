package com.vaultify.Repeat_codes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.vaultify.vaultify_platform.Base;

public class Screenshots extends Base{
	
	
	public String Take_Screenshots(String Testname , WebDriver d)throws IOException{
		
		
		TakesScreenshot ts = (TakesScreenshot)d;
		
		File screenShot = ts.getScreenshotAs(OutputType.FILE);
		String filepath = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator + Testname + ".png";
		FileUtils.copyFile(screenShot, new File(filepath));
		return filepath;
		
	}

}
