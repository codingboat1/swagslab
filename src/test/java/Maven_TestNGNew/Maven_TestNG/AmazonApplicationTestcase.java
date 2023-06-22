package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class AmazonApplicationTestcase {
	WebDriver driver;
  @Test
  public void Amazon() {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	  String actualtile=driver.getTitle();
	  Assert.assertEquals(actualtile,"Amazon.com : T-shirts");
  }
  @Test
  public void  Tshirtspage() throws IOException{
	  driver.findElement(By.xpath("//span[contains(text(),'$100 to $200')]")).click();
	 WebElement ss= driver.findElement(By.xpath("//img[@class='nav-categ-image']"));
	File source=  ss.getScreenshotAs(OutputType.FILE);
	File target= new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\.Amazonlogo.png");
	FileUtils.copyFile(source,target);
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get("https://www.amazon.com/");
	  driver.manage().window().maximize();
	  System.out.println("The title of the page: "+driver.getTitle());
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
