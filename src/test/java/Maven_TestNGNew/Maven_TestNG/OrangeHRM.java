package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;

import org.testng.asserts.Assertion;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class OrangeHRM {
	WebDriver driver;
  @Test
  public void Admin() {
	  driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	  driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	  driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
	 WebElement name= driver.findElement(By.xpath("//div[text()='Anthony Nolan']"));
	 System.out.println(name.getText());
	  Assert.assertEquals(name.getText(), "Anthony Nolan");
	  
	  }
  @Test
  public void PIM() throws IOException {
	  driver.findElement(By.xpath("oxd-main-menu-item active")).click();
//	  TakesScreenshot ts=(TakesScreenshot) driver;
//	  File src=ts.getScreenshotAs(OutputType.FILE);
//	  File trg= new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\.Amazonlogo.png");
//      FileUtils.copyFile(src, trg);
  }
	  @AfterMethod
	  private void Screenshot() throws IOException {
		  TakesScreenshot ts=(TakesScreenshot) driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File trg= new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\.Amazonlogo.png");
	      FileUtils.copyFile(src, trg);
	
}
@BeforeClass
  public void Loginpage() throws IOException, InterruptedException {
	  System.setProperty("Webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	 // WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
//	 TakesScreenshot ts=(TakesScreenshot)driver;
//	 File source =ts.getScreenshotAs(OutputType.FILE);
//	 File target= new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\.Amazonlogo.png");
//	 FileUtils.copyFile(source, target);
	 String actual=driver.getTitle();
	 System.out.println("Tiltle of the current webpage: "+actual);
	 Assert.assertEquals(actual, "OrangeHRM");
	 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']"));
	Thread.sleep(3000);
  }
@AfterClass
  public void afterClass() {
	driver.quit();  }

}
