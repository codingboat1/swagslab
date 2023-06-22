package com.swaglabs.pageObject;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.swaglabs.utlity.Basefactory;
import com.swaglabs.utlity.Libraray_Helpers;
import com.swaglabs.utlity.configpropertyfile;


public class Baseclass {
	public WebDriver driver;
	public configpropertyfile config;
	public ExtentReports reporter;
	public ExtentTest logger;
	@BeforeSuite
	public void objectcreations() throws Exception {
		config=new configpropertyfile();
		ExtentHtmlReporter extent=new ExtentHtmlReporter(new File("./Reports/swagslab.html"));
		 reporter=new ExtentReports();
		reporter.attachReporter(extent);
		
		 
	}
	@BeforeClass
	public void loginurl() throws InterruptedException {
		
		//This will launch the browser and specific url
		  driver=Basefactory.setUpBrowser(driver, config.getbrowserdetails(),config.StagingURLdetails());
		//driver=Basefactory.setUpBrowser("chrome","https://www.saucedemo.com/");
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	
	}
	
@AfterMethod
public void screenshot(ITestResult result) throws IOException{
	if(result.getStatus()==ITestResult.FAILURE) {
		Libraray_Helpers.capturescreenshots(driver);
		reporter.flush();
	}
	 
	
}
}
