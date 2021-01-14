package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	WebDriver driver;

	@BeforeSuite(groups= {"System Testing"})
	public void invokeBrowser() {
		
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		System.out.println("Before Suite of Test1 ....");
		
	}
	@BeforeTest(groups= {"Regression Testing"})
	public void beforeTest() {
		System.out.println("Before Test of Test1....");
	}
	@BeforeClass(groups= {"Regression Testing"})
	public void beforeClass() {
		
		System.out.println("Before Class of Testclass...");
	}
	@BeforeMethod(groups= {"Regression Testing"})
	public void beforeMethod() {
		
		
		System.out.println("before Method of Testclass...");
	}
	@Test(priority=1, groups = {"System Testing"})
	public void checklogin() {
		System.out.println("@Test TestClass");
//		WebElement email =  driver.findElement(By.id("email"));
//		email.sendKeys("vyasjai18@yahoo.com");
//		System.out.println("This is a most important thing in life");
//		System.out.println("This is a new change in devlop and devlopment of this feature is compelted");

	}
	@AfterTest(groups= {"Regression Testing"})
	public void afterTest() {
		System.out.println("After Test of Test1...");	
	}
	public static void main(String[] args) {

	
	}

}
