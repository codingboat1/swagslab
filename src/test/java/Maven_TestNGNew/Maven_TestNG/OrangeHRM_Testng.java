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
import org.testng.annotations.Test;

public class OrangeHRM_Testng {
	WebDriver driver;		
  @Test
  public void LaunchURL() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
  @Test
  public void capturelogo() throws IOException {
	  WebElement titlelogo=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img]"));
	 File src=titlelogo.getScreenshotAs(OutputType.FILE);
	 File trg=new File("C:\\Users\\swarn\\eclipse-workspace\\Maven_TestNG\\Screenshots\\logonew.png");
	 FileUtils.copyFile(src, trg);
	 }
  @Test
  public void Logindetails() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123",Keys.ENTER);
	 String Windid= driver.getWindowHandle();
	 System.out.println(Windid);
	 System.out.println(driver.findElement(By.xpath("//p[text()='Venkatesh Krishnan']")).isDisplayed());
	  
  }
  @Test
  public void Timesheet() {
	  driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	  String text=driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']")).getText();
	  Assert.assertEquals(text,"Timesheets");
	  driver.quit();
  
  }
 
 
 }

  

