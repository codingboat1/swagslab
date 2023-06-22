package org.test.groupingtestng;

import org.testng.annotations.Test;

public class Grouptest2 {
  @Test(groups= {"regression"})
  public void Test5() {
	  System.out.println("Test5");
  }
  @Test(groups= {"smoke","sanity"})
  public void Test6() {
	  System.out.println("Test6");
  }
  @Test(groups= {"functional"})
  public void Test7() {
	  System.out.println("Test7");
  }
  @Test(groups= {"regression","functional"})
  public void Test8() {
	  System.out.println("Test8");
  }
  @Test
  public void Test9() {
	  System.out.println("Test9");
  }
}
