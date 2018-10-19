package com.qa.AssessmentMehulSaluja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeUserJenkins 

{	
	
	
	
	
	@FindBy(xpath ="//*[@id=\"tasks\"]/div[4]/a[2]")
	WebElement clickmanagejenkins;
	
	public void myjenkins()
	{
		
		if (clickmanagejenkins.getText().contains("Manage Jenkins"));
		{
			clickmanagejenkins.sendKeys();
			clickmanagejenkins.click();
		}
	}
	
	
	
}
