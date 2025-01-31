package manas_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class1 {
	
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

	@Test(description ="To check num UI")	
	public void ts1() throws Exception {
	PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class);
	SoftAssert s =	new SoftAssert();
	boolean numDisplay = p.num.isDisplayed(); 
	s.assertEquals(numDisplay, true);
	boolean numEnable = p.num.isEnabled();
	s.assertEquals(numEnable, true);
	p.num.click();
	Thread.sleep(2000);
	s.assertAll();
	}

	
	@Test (description = "To check cal UI")
	public void ts2() throws Exception{
	PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class); 
	SoftAssert s = new SoftAssert();
	//WebDriverWait w = new WebDriverWait(driver, null ); 
	boolean calDisplay = p.cal.isDisplayed();
	s.assertEquals(calDisplay, true);
	boolean calEnable = p.cal.isEnabled(); s.assertEquals(calEnable, true);
	s.assertEquals(calEnable, true);
	p.cal.click();
	//w.until (ExpectedConditions.elementTolleClickable(p.cal));
	Thread.sleep(2000);
	s.assertAll();
	}
	
	@Test(description = "To check. Terms and Condition UI")
	public void ts3() throws Exception {
	PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class);
	SoftAssert s = new SoftAssert(); 
	//WebOriverkait new WebDriverWait(driver, null
	boolean tandcDisplay = p.tandc.isDisplayed();
	s.assertEquals(tandcDisplay, true); 
	boolean tandcEnable = p.tandc.isEnabled();
	s.assertEquals(tandcEnable, true); 
	p.tandc.click();
	//w.until(ExpectedConditions.element TolleClickable(p.tandc));
	Thread.sleep(2000);
	s.assertAll();
	}

	@Test (description = "To check Terms and Condition UI")
	public void ts4() throws Exception {
	PageObjectModel p = PageFactory.initElements(driver, PageObjectModel.class);
	SoftAssert s = new SoftAssert();
	//WebDriverwalt new WebDriverkait (driver, null);
	boolean privacyDisplay = p.privacy.isDisplayed();
	s.assertEquals(privacyDisplay, true);
	boolean privacyEnable = p.privacy.isEnabled(); 
	s.assertEquals(privacyEnable, true);
	p.privacy.click();
	//w.until (Expected Conditions.elementToBeClickable(p.privacy));
	Thread.sleep(2000); 
	s.assertAll();
			}
}
