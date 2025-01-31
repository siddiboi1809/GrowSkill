package automation_testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String Title = driver.getTitle();
		String appURL = driver.getCurrentUrl();
		System.out.println("Title is: "+ Title+ " and Length is: "+Title.length());
		System.out.println("URL is: "+ appURL + " and Length is: "+ appURL.length());
		if(Title.length()>appURL.length()) {
			System.out.println("Title length is greater than URL lenth");
		}
		else {
			System.out.println("Title length is not greater than URL length");
		}
		
		System.out.println();
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		boolean LoginAvailability = driver.findElement(By.id("loginbutton")).isDisplayed();
		System.out.println(LoginAvailability);
		boolean LoginEnable = driver.findElement(By.id("loginbutton")).isEnabled();
		System.out.println(LoginEnable);
		
		System.out.println();
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		String ForgotPasswordTitle = driver.getTitle();
		System.out.println("Title is: "+ForgotPasswordTitle);
		System.out.println(ForgotPasswordTitle.contains("password1"));
		
		System.out.println();
		boolean SearchAvailability = driver.findElement(By.id("did_submit")).isDisplayed();
		System.out.println(SearchAvailability);
		boolean SearchEnable = driver.findElement(By.id("did_submit")).isEnabled();
		System.out.println(SearchEnable);
		

        driver.close();
	}

}
