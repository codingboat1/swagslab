package Maven_TestNGNew.Maven_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataprovidersLoginpage {
	WebDriver driver;
	@Parameters("url")
	@BeforeClass
	public void ApplicationUrl(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
  @Test(dataProvider ="Logincrediential")
  public void Loginpage(String username, String password) throws InterruptedException {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys("password");
	  driver.findElement(By.xpath("//button[@type='submit']"));
	  Thread.sleep(2000);
	  driver.close();
  }
  @DataProvider (name="Logincrediential")
  public Object[][] logindetails() {
	  Object[][] data= {{"tomsmith1","SuperSecretPassword!"},{"tomsmith","SuperSecretPassword!"},{"tomsmith","SuperSecretPassword"},{"tomsmith","SuperSecretPassword"}};	
	  return data;
  }
}
