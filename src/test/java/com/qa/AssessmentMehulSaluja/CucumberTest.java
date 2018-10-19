package com.qa.AssessmentMehulSaluja;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberTest 
{
	public WebDriver driver = null;

	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\report\\report.html", true); // Produces report log - always the same
	ExtentTest test;
	
	
	
	@Before
	public void setup() 
	{
	test = extent.startTest("Start the test and initialise the Driver");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	}
	@After
	public void tearDown() 
	{
		driver.quit();			//Stops the driver/browser
		extent.endTest(test);	//Ends the test - test
		extent.flush();		//Send results to report
	}
	
	
	
	@Given("^that you are on the create UserScreen$")
	public void that_you_are_on_the_create_UserScreen() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		test = extent.startTest("Start the test and initialise the Driver");
		test.log(LogStatus.INFO, "Browser started and Page loaded");
		driver.get(Constants.startpage);
		
		
		
		
		//ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, 0);
	
		
	    throw new PendingException();
	}

	@When("^the User details are entered on the Create UserScreen$")
	public void the_User_details_are_entered_on_the_Create_UserScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		test.log(LogStatus.INFO, "Nav to Menu Page");
		//homePage goTo = PageFactory.initElements(driver, homePage.class);
		//goTo.menu();
		
		InitialPage I = PageFactory.initElements(driver, InitialPage.class);
		I.myuname("MS_1997");
		I.mypass("mehulsaluja");
		
		I.get_first_result();
		
	    throw new PendingException();
	}

	@When("^the details are submitted on the Create UserScreen$")
	public void the_details_are_submitted_on_the_Create_UserScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		the_User_details_are_entered_on_the_Create_UserScreen();
	    throw new PendingException();
	}

	@Then("^the Username should be visible on the UsersScreen$")
	public void the_Username_should_be_visible_on_the_UsersScreen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		the_User_details_are_entered_on_the_Create_UserScreen();
	    throw new PendingException();
	}
	
	

	@When("^the User details \"([^\"]*)\" username, \"([^\"]*)\" password, \"([^\"]*)\" confirm Password, and \"([^\"]*)\" Fullname are entered on the Create UserScreen$")
	public void the_User_details_username_password_confirm_Password_and_Fullname_are_entered_on_the_Create_UserScreen(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("http://localhost:8080/securityRealm/addUser");
		AuthenticationCheck A = PageFactory.initElements(driver, AuthenticationCheck.class);
	    A.uname("Bob");
		A.pass("12345");
		A.confirmpass("12345");
		A.FullName("Bob Smith");
		A.emailaddress("smith.bob@gmail.com");
		
		
		String check=A.get_result();
		assertEquals("**Successful Login**",check);
	    throw new PendingException();
	}

	@Then("^the \"([^\"]*)\" username should be visible on the UsersScreen$")
	public void the_username_should_be_visible_on_the_UsersScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("http://localhost:8080/asynchPeople/");
		
		
	    throw new PendingException();
	}

	@Given("^the \"([^\"]*)\" username is visible on the UsersScreen$")
	public void the_username_is_visible_on_the_UsersScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		DoesUserExist D = PageFactory.initElements(driver, DoesUserExist.class);
		
		if (D.doesnameexist()==true) 
		{
			test.log(LogStatus.PASS, "Username is visible on screen!");
		}
		
		else 
		{
			test.log(LogStatus.FAIL, "Username is visible on screen!");
		}
	    throw new PendingException();
	    
	}

	@When("^the \"([^\"]*)\" username is clicked on the UserScreen$")
	public void the_username_is_clicked_on_the_UserScreen(String arg1) throws Throwable 
	{
		ClickUsername CU = PageFactory.initElements(driver, ClickUsername.class);
		
			
			{
				test.log(LogStatus.PASS, "Username is clicked on user screen!");
			}
			
			else 
			{
				test.log(LogStatus.FAIL, "Username is not clicked on user screen!");
			}	
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the User Profile should display the \"([^\"]*)\" username on the ProfileScreen$")
	public void the_User_Profile_should_display_the_username_on_the_ProfileScreen(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the \"([^\"]*)\" Username's profile page has been loaded$")
	public void the_Username_s_profile_page_has_been_loaded(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^the configure button has been clicked on the profile page$")
	public void the_configure_button_has_been_clicked_on_the_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I change the old FullName on the Configure Page to a new FullName \"([^\"]*)\"$")
	public void i_change_the_old_FullName_on_the_Configure_Page_to_a_new_FullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I save the changes to the Configure Page$")
	public void i_save_the_changes_to_the_Configure_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the Configure Page should show the NewFullName \"([^\"]*)\"$")
	public void the_Configure_Page_should_show_the_NewFullName(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	


}
