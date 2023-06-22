package Maven_TestNGNew.Maven_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldataprovidertestcase {
	WebDriver driver;
	@BeforeClass
	public void Lauchapplication() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider ="testdata",dataProviderClass = ExcelDataprovider.class)
	public void logincrediantials(String us,String ps) throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(us);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	boolean b=driver.findElement(By.xpath("//h1[text()='Logged In Successfully']")).isDisplayed();
	Assert.assertTrue(b);
	driver.quit();
		
	}
	
}