package test1;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import dataProvider.DataProviderClass;
import dataProvider.DataProviderClass.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	WebDriver driver;




	@BeforeSuite(groups= {"System Testing"})
	public void invokeBrowser() {

		WebDriverManager.chromedriver().setup();

		//		driver = new ChromeDriver();
		//		driver.get("https://www.facebook.com/");



	}
	@Test
	@Parameters ({"val1", "val2"})
	public void Sum(int v1, int v2) {
		int finalsum = v1 + v2;
		System.out.println("The final sum of the given values is " + finalsum);
	}
	@BeforeTest(groups= {"Regression Testing"})
	@Parameters ({"val1", "val2"})
	public void beforeTest(int x, int y) {
		System.out.println(x+y);
		System.out.println("Before Test of Test1....");
	}
	@BeforeClass(groups= {"Regression Testing"})
	public void beforeClass() {

		System.out.println("Before Class of Testclass...");
	}
	@BeforeMethod(groups= {"Regression Testing"})
	public void beforeMethod() {

		Reporter.log("This is the Before method in Testclass");
		System.out.println("before Method of Testclass...");
	}
	@Test(priority=1, groups = {"Regression Testing"})
	public void checklogin() {
		System.out.println("@Test TestClass");
		//		WebElement email =  driver.findElement(By.id("email"));
		//		email.sendKeys("vyasjai18@yahoo.com");
		//		System.out.println("This is a most important thing in life");
		//		System.out.println("This is a new change in devlop and devlopment of this feature is compelted");

	}
	@Test(dataProvider="DataTable", dataProviderClass = DataProviderClass.class)
	public void Sum2DataProvider(Map<Integer, Integer> z) 
	{

		Set<Integer> s =z.keySet();
		Set<Entry<Integer,Integer>> entry=z.entrySet();
		for (Entry<Integer,Integer> i : entry) {

			System.out.println("The final sum of the given values is " +i.getKey()+i.getValue()  +" optained in testClass @test");

		}

	}
	@Test(dataProvider="methodacceptingDataTable",dataProviderClass= DataProviderClass.class)
	public void DataProvidingMethod(Map<Integer, Integer> z) 
	{

		Set<Integer> s =z.keySet();
		Set<Entry<Integer,Integer>> entry=z.entrySet();
		for (Entry<Integer,Integer> i : entry) {
		int k=i.getKey();
		int d=i.getValue();
		
			System.out.println("The final sum of the given values is " +(k+d)+" optained in testClass @test");

		}

	}

	@AfterTest(groups= {"System"})
	@Parameters("message")
	public void afterTest(@Optional("Optional to be selected")String message) 
	{
		System.out.println("After Test of Test1..."+message);	
	}
	public static void main(String[] args) {


	}

}
