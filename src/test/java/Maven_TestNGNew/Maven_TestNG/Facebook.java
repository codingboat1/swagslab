package Maven_TestNGNew.Maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook {
  @Test
  public void facebooklogin() {
	  System.setProperty("Webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("qwertyui@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("Asdfg@123",Keys.ENTER);
	    String header=driver.findElement(By.xpath("//h2[@class='uiHeaderTitle']")).getText();
	    Assert.assertEquals(header, "We'll send you a code to your email");
	    // SoftAssertion
	  String Actualbgcolor= driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color");
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(Actualbgcolor, "rgb(24, 119, 242)");
	    driver.quit();
	  
  }
}
