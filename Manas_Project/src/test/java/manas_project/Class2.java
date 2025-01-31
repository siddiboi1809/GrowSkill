package manas_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class2 {
	
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
	
	@Test()
	public void ts1() {

		PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class);
		SoftAssert s =	new SoftAssert();
		String att = p.num.getAttribute("placeholder"); 
		s.assertEquals(att.contains("Enter an integer"), true);
		s.assertAll();
	}

		@Test(description = "Verify the Title of the page")
		public void ts2() {

		SoftAssert s = new SoftAssert();
		String appTitle = driver.getTitle();
		String expectedTitle = "Factorial";
		s.assertEquals(appTitle.equals(expectedTitle), true);
		s.assertAll();
		}

		@Test(description ="Verify the URL of the page contains https")

		public void ts3() {
		SoftAssert s = new SoftAssert(); 
		String appURL = driver.getCurrentUrl();
		s.assertEquals(appURL.contains("https"), true); 
		s.assertAll();
		}
}
