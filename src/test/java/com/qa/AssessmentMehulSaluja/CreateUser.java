package com.qa.AssessmentMehulSaluja;


	import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


	public class CreateUser {
	
		
		static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\report\\report.html", true); // Produces report log - always the same
		ExtentTest test;
		
		public WebDriver driver = null;
		
		@BeforeClass
		public static void before() 
		{
			

		}
		

		
		@Before
		public void setup() 
		{
			test = extent.startTest("Start the test and initialise the Driver");
			test.log(LogStatus.INFO, "Browser started and Page loaded");
			
			//ExcelUtils.setExcelFile(Constant.pathTestData + Constant.fileTestData, 0);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			//ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\form\\submitted.html", true);
		}
			
		
		@Test
		public void createuser() 
		
		{
			driver.get("http://localhost:8080/login?from=%2F");
			
			//driver.get("http://localhost:8080/securityRealm/addUser");
			
			InitialPage I = PageFactory.initElements(driver, InitialPage.class);
			I.myuname("MS_1997");
			I.mypass("mehulsaluja");
			
			I.get_first_result();
			
			
		
		    assertEquals("**Successful Login**",I.get_first_result()); //static import not working
			
		    
		    driver.get("http://localhost:8080/login?from=%2F");
			MakeUserJenkins U = PageFactory.initElements(driver, MakeUserJenkins.class);
		    U.myjenkins();
		
			
		 //	MakeUserJenkins U = PageFactory.initElements(driver, MakeUserJenkins.class);
			// U.myjenkins();
			
		
			
		driver.get("");
			AuthenticationCheck A = PageFactory.initElements(driver, AuthenticationCheck.class);
			A.uname("Bob");
			A.pass("12345");
			A.confirmpass("12345");
			A.FullName("Bob Smith");
			A.emailaddress("smith.bob@gmail.com");
			
			
			String check=A.get_result();
			assertEquals("**Successful Login**",check);
			
		}
			
			
			//U.uname("Bob");
			//U.pass("12345");
			
			
			

		
		
		@After
		public void tearDown() {
			//driver.quit();
	}
		
		@AfterClass
		public static void after() {
			extent.flush();			// sends info to where it is meant to go
		}
		*/
		
	}

	
	


