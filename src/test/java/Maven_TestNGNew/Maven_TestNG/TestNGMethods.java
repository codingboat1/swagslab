package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestNGMethods {
	WebDriver driver;
  @Test(enabled = false)
  public void checkbox() {
	 driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();
	 driver.findElement(By.xpath("//form[@id='checkboxes']//child::input[1]")).click();
  }
  @AfterMethod(dependsOnMethods ="checkbox")
  public void Screenshotnew() throws IOException {
	  int i=1;
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg= new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\Screenshot["+i+1+"]+.png");
	      FileUtils.copyFile(src, trg);
	     String HW= driver.getWindowHandle();
	      System.out.println(HW);
  }
  @BeforeClass
  public void beforeClass() {
	 System.setProperty("Webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.navigate().to("https://the-internet.herokuapp.com/");
	 String actual= driver.getTitle();
	 Assert.assertEquals(actual,"The Internet");
	 
  }

  @AfterClass
  public void afterClass() {
	 // driver.close();
  }

}
