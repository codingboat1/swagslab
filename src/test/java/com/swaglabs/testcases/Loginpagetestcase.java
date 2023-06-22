package com.swaglabs.testcases;
import com.swaglabs.pageObject.Loginpage;
import com.swaglabs.utlity.*;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaglabs.pageObject.Baseclass;
public class Loginpagetestcase extends Baseclass {
	//WebDriver driver;
  @Test
  public void Logindetails() throws Exception {
	  
	 logger=reporter.createTest("Swagslag "+Libraray_Helpers.getCurrentDateTime()+".html");
	  //created page object using page factory
	  Loginpage loginpage=PageFactory.initElements(driver, Loginpage.class);
	  //calling the method with the login page object reference
	  Testdataprovider data=new Testdataprovider();
	  loginpage.Logindetails(data.getexcelStringdata(0,0),data.getexcelStringdata(0,1));
	  logger.pass("Login sucessfull");
	 String actual_title= driver.getTitle();
	Assert.assertEquals(actual_title,"Swag Labs");
  }  
}
