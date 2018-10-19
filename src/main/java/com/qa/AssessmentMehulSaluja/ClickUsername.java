package com.qa.AssessmentMehulSaluja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ClickUsername 

{
	//Actions action = new Actions(driver);
	@FindBy(xpath = "//*[@id=\"person-MS_1997\"]/td[2]/a")
	WebElement userclick;
	
	
	
	public void canyouclickonuser(String click)
	{
		userclick.sendKeys(click);
		userclick.click();
	
	}
	
	
	//action.moveToElement(item).click().perform();

}


