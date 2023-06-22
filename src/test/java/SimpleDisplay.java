import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SimpleDisplay {
  @Test
  public void main1() {
	 
	  System.out.println("This is Test 1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
	  
  }
@Test
public void main2(){
	System.out.println("This is Second Test");
}
{
	
}
}

