package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Param {
	WebDriver driver;
@Parameters("Browser")
	@BeforeClass
	public void Browserlaunch(String Browser) {
		switch ((Browser).toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;
        default:
        	System.out.println("Invalid browser");
			break;
		}
		}
	
	@Parameters("Url")
	@Test
	public void Launchapplication(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl=Url; 
	AssertJUnit.assertEquals(expectedUrl,actualUrl);	
	}
  @Parameters("username")
  @Test 
  public void Logincrediential(String username, String password) {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys("Password123");
	  driver.findElement(By.id("submit")).click();
	 boolean loggedinpage= driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
	 AssertJUnit.assertTrue(loggedinpage);
	   }
  @AfterClass
  public void Teardown() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }
  
}
