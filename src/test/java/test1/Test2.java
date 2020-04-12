package test1;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 extends Testclass {
@Test
public void clickONLogin() {
	
	driver.findElement(By.id("u_0_b")).click();
}
@AfterTest
public void quitBrowser() {
	
	driver.quit();
}
}
