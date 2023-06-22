package Maven_TestNGNew.Maven_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Welcome");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Welcome to ");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Welcome to TestNG Project");
  }

}
