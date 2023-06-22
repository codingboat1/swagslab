package com.swaglabs.utlity;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class configpropertyfile {
	public Properties pro;
	//public WebDriver driver;
	public  configpropertyfile()throws Exception {
		File fi=new File("./configuration/config.properties");
		FileInputStream fs=new FileInputStream(fi);
		 pro=new Properties();
		pro.load(fs);
		
	}
//	public String getDtatFromConfig(String KeyTPSearch) {
//		return pro.getProperty(KeyTPSearch);
//	}
	public String getbrowserdetails() {
	return	pro.getProperty("Browser");
		
	}
    public String StagingURLdetails() {
    	return	pro.getProperty("AppURL");
		
    }
}

