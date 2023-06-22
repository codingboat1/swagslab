package Maven_TestNGNew.Maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTestnew {
	WebDriver driver;
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
			driver.findElement(By.xpath("//button[@id='submit']")).click();
		boolean b=driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
		Assert.assertTrue(b);
		driver.quit();
  }
}
