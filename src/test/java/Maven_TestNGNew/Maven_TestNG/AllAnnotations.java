package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AllAnnotations {
  @Test
  public void Testcase1() {
	  System.out.println("This is first Testcase");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is afer suite");
  }
@Test
public void Testcase2() {
	System.out.println("This is second Test case ");
	}
}