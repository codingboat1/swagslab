package Maven_TestNGNew.Maven_TestNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngDemoClass {
WebDriver driver;
@BeforeMethod
public void DriverInstance() {
	System.setProperty("Webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
}
  @Test
  public void facebooklogin() {
	 driver.get("https://www.facebook.com/");
	 WebElement logo=driver.findElement(By.xpath("//img[@alt='Facebook']"));
	System.out.println(logo.isDisplayed());
  }
  @Test
  public void Google() throws IOException {
	  driver.get("https://www.google.com/");
	  driver.findElement(By.id("APjFqb")).sendKeys("Nature pictures",Keys.ENTER);
	  driver.findElement(By.xpath("//span[text()='Pixabay']")).click();
	  WebElement image1=driver.findElement(By.xpath("//img[@title='Download free HD stock image of Tree Sunset']"));
	 File src1= image1.getScreenshotAs(OutputType.FILE);
	 File trg1=new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\image1.png");
	 FileUtils.copyFile(src1, trg1);
	 WebElement image2=driver.findElement(By.xpath("//div[@class='container--wYO8e']//div[2]//div[1]//div[1]//a[1]//img[1]"));
	 File src2= image2.getScreenshotAs(OutputType.FILE);
	 File trg2=new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\image2.png");
	 FileUtils.copyFile(src2, trg2);
  }
 
@AfterMethod
 public void closewindows() {
	driver.quit();
}

	
}

