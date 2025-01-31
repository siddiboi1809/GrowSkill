package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class FastApp {
	
	WebDriver driver;

	@BeforeMethod
	public void launchApp() throws Exception {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Documents\\Software Testing\\Manual Testing and Core Java\\eclipseSeleniumPractice\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.fast.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	@Test (description = "	Verifying the Internet speed")
	public void speed() throws Exception {
		
		Thread.sleep(16000);
		WebElement speed = driver.findElement(By.id("speed-value"));
		WebElement speedUnit = driver.findElement(By.id("speed-units"));
		
		System.out.println("Internet Speed is: "+speed.getText()+" "+speedUnit.getText());
		
	}
	
	@Test (description = "Verifying the Title of the app")
	public void appTitle() {
	String appTitle =	driver.getTitle();
	
	boolean res =  appTitle.contains("fast");
	Assert.assertEquals(res, true);
	
	}

}
