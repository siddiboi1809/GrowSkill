package testNG;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Annotation {

	@Test (priority = 3, description = "Verifying the Availibility of Login button")
	public void ts1() {
		System.out.println("This is Test Scenario 1");
	}
	
	@Test (priority = 1, description = "Verify the Login button is Enabled or not", invocationCount = 2)
	public void ts2() {
		System.out.println("This is Test Scenario 2");
	}
	
	@Ignore @Test 
	public void ts3() {
		System.out.println("This is Test Scenario 3");
	}
	
	@Test (priority = 2, description = "Verify the Login button is Disabled or not", invocationCount = 4)
	public void ts4() {
		System.out.println("This is Test Scenario 4");
	}
}
