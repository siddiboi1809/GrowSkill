package manas_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Class3 {
	
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
	
	

}
