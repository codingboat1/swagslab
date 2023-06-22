package com.swaglabs.utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basefactory {
	 public WebDriver driver;
public  static WebDriver setUpBrowser(WebDriver driver,String browsername,String url) throws InterruptedException {
	switch(browsername) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		break;
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();break;
	case "ie":
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();break;
		default:
			System.out.println("Webpage is not supported to your preffered browser");
	}
	driver.get(url);
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	return driver;
}

}

