package com.qa.AssessmentMehulSaluja;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationCheck 

{
	
	
	@FindBy(xpath = "//*[@id=\"username\"]")
	WebElement input_username;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
	WebElement input_password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
	WebElement confirm_password;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
	WebElement input_fullname;
	
	@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
	WebElement input_email;
	
	@FindBy(xpath = "//*[@id=\"yui-gen1\"]/span")
	WebElement create_user;
	
	
	public void uname(String username) 
	{
		input_username.sendKeys(username);
		
	}
	
	public void pass(String password) 
	{
		input_password.sendKeys(password);
	}
	
	public void confirmpass(String confirmpassword) 
	{
		confirm_password.sendKeys(confirmpassword);
	}
	
	public void FullName(String fullname) 
	{
		input_fullname.sendKeys(fullname);
	}
	
	public void emailaddress(String email) 
	{
		input_email.sendKeys(email);
		
		create_user.click();
	}
	
	public String get_result() 
	{
		return create_user.getText();
	}
	
	

}

