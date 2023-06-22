package org.test.groupingtestng;

import org.testng.annotations.Test;

public class Grouptest1 {
	
  @Test(groups= {"smoke"})
  public void Test1() {
	  System.out.println("Test1");
  }
  @Test(groups= {"sanity"})
  public void Test2() {
	  System.out.println("Test2");
  }
  
  @Test(groups= {"sanity","regression"})
  public void Test3() {
	  System.out.println("Test3");
  }
  
  @Test(groups= {"smoke","functional","sanity"})
  public void Test4() {
	  System.out.println("Test4");
  }
}
