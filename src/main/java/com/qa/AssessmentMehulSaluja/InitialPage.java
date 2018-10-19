package com.qa.AssessmentMehulSaluja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage 
{
	
	
	@FindBy(xpath ="//*[@id=\"j_username\"]")
	WebElement myuser;
	
	@FindBy(xpath ="/html/body/div/div/form/div[2]/input")
	WebElement mypassword;
	
	@FindBy(xpath ="/html/body/div/div/form/div[3]/input")
	WebElement mysignin;
	
	
		
	//MS_1997
	//mehulsaluja
	
	public void myuname(String username) 
	{
		myuser.sendKeys(username);
	}
	
	public void mypass(String password) 
	{
		mypassword.sendKeys(password);
		mysignin.click();
	}
	
	public void get_first_result() 
	{
		if (mysignin.getText().contains("Sign in")); 
		{
			mysignin.click();
		}
	
	}
}
	

	