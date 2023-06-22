/**
 * 
 */
package com.swaglabs.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author swarna
 *
 */
public class Loginpage {
	
	WebDriver driver;
	
   // Locating and indentifying the Webelements on Login page	
 
	 @FindBy(how=How.ID,using="user-name")
	 WebElement username;
	 
	 @FindBy(how=How.NAME,using="password")
	 WebElement password;
	 
	 @FindBy(how=How.XPATH,using=("//input[@type='submit']"))
     WebElement loginbtn;
	
	 
	 // Constructor to instatiate the driver
	 public Loginpage(WebDriver driver) {
		 this.driver=driver; 
	 }
	 // methods to perform action/operations on webelements
//	 public void user() {
//		 username.sendKeys("standard_user");
//	 }
//     public void pass() {
//    	 password.sendKeys("secret_sauce");
//     }
//     public void login() {
//    	 loginbtn.click();
//     }
	 public void Logindetails(String usname,String pass) {
		 username.sendKeys(usname);
		 password.sendKeys(pass);
		 loginbtn.click();
	 }
}
