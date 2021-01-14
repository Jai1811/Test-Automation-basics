package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test(groups= {"Regression"})
  public void f() {
	  System.out.println("test of class Newtest");
  }
  @BeforeTest(groups= {"System Testing"})
  public void beforeTest() {
	  System.out.println("beforeTest of test");
  }

}
