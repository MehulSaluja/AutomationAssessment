package com.qa.AssessmentMehulSaluja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoesUserExist 
{
	
	
	@FindBy(xpath ="//*[@id=\"page-body\"]")
	WebElement body;
	
	public boolean doesnameexist() 
	{
		{
			
			if (AuthenticationCheck.this.input_username.isDisplayed())
			{
				body.sendKeys();
				body.click();
				return true;
			}
			else {return false;}
		}
	}
	

}
