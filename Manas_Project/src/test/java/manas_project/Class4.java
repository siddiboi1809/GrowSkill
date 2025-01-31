package manas_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class4 {

	
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws Exception {
	driver = new ChromeDriver();
	driver.get("https://qainterview.pythonanywhere.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	}
	
	@AfterMethod
	public void closeApp() {
	driver.close();
	}
	
	@Test(description = "BUG - Title of the page")
	public void ts1() {

	SoftAssert s = new SoftAssert();
	String appTitle = driver.getTitle();
	String expectedTitle = "Factorial";
	s.assertEquals(appTitle.equals(expectedTitle), true);
	s.assertAll();
	}
}
