package manas_project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectModel {
	
	@FindBy(id="number") WebElement num;
	@FindBy(id="getFactorial") WebElement cal;
	@FindBy(xpath="//*[@href='/privacy']") WebElement tandc;
	@FindBy(xpath="//*[@href='/terms']") WebElement privacy;
	
	
	
	

}
