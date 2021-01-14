package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 extends Testclass {

	@BeforeSuite(groups= {"Regression Testing"})
	@Parameters({"URL", "Value"})
	public void invokeBrowser(String x, int y) {
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		System.out.println("Before Suite of Test2 invoked....");
		System.out.println(x+"  "+y);
		
	}
	
@BeforeTest(groups= {"Regression Testing"})
public void beforeTest() {
	System.out.println("Before Test of class Test2....");
}
@BeforeClass(groups= {"Regression Testing"})
public void beforeClass() {
	
	System.out.println("Before Class of Test2...");
}
@BeforeMethod(groups= {"Regression Testing"})
public void beforeMethod() {
	
	
	System.out.println("before Method of Test2...");
}

@Test(priority=0,groups= {"Regression Testing"}  )
public void clickONLogin() {
	
	System.out.println("@Test of class Test2");
//	driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
}

@Test(priority=0, groups= {"Regression Testing"} )
public void alpha() {
	System.out.println("@Test of class Test2  apha priority=0");
}
@AfterMethod(groups= {"Regression Testing"})
public void afterMethod() {
	System.out.println("After method... of Test2");
	
}
@AfterClass(groups= {"Regression Testing"})
public void afterClass() {
	System.out.println("After Class... of Test2");
	
}

@AfterSuite(groups= {"Regression Testing"})
public void quitBrowser() {
	System.out.println("After suite of Test2....");
//	System.out.println("Browser is going to be closed");
//	driver.quit();
//	System.out.println("Browser is closed");
}
}
