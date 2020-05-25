package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testclass {
	WebDriver driver;
	@BeforeTest
	public void invokeBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	public void checklogin() {
		WebElement email =  driver.findElement(By.id("email"));
		email.sendKeys("vyasjai18@yahoo.com");
		System.out.println("This is a most important thing in life");
		System.out.println("This is a new change in devlop and devlopment of this feature is compelted");


	}
	
	
	public static void main(String[] args) {
	System.out.println("This is pull Request");
	System.out.println("This is for fetching the code");
	System.out.println("This is a new change in devlop and devlopment of this feature is compelted");
	
	}

}
