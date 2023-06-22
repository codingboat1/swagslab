package com.swaglabs.utlity;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Libraray_Helpers {
	WebDriver driver;
	
	public static void capturescreenshots(WebDriver driver)throws IOException {
	//one approach to capture a screenshot	
//	TakesScreenshot ts=(TakesScreenshot) driver;
//	File Src=ts.getScreenshotAs(OutputType.FILE);
//	File trg=new File("./Screenshots/loginpage.png");
//	FileUtils.copyFile(Src, trg);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshots/"+getCurrentDateTime()+".png"));
		
	}
	public static String getCurrentDateTime() {
		DateFormat date=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
		Date currentdate=new Date();
		 return date.format(currentdate);
	}
}