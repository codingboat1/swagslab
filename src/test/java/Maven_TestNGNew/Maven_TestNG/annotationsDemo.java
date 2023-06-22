package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotationsDemo {
  @Test
  public void Test3() {
	  System.out.println("This Test3 in another class");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Beforeclass in another class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is Afterclass in another class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is Before Test in another class");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is After Test in another class");
  }
  @BeforeMethod
  public void Beforemethod() {
	  System.out.println("This is Before method in another class");  
  }
@AfterMethod
public void Aftermethod() {
	System.out.println("This is After method in another class");
}
}
