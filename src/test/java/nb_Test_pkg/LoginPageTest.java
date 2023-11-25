
// Class on Sunday, July 23, 2023 with new Instructor MD Islam:


package nb_Test_pkg;

import java.sql.Driver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest {

	
	
	
	
	// TDD: Test Driven Development
			// we will have our requirements so we will do our unit testing on it based on that..... 
			// testing framework for unit are JUnit and TestNG, protractor, child, mocha?
			// Unit tests become the regression tests
		
		// BDD: Behavior Driven Development; 
			// specification of Behavior: we are just describing what it is supposed to happen
			// dealing with software, applications, etc.
			// Functional testing become the regression test
			// Functional testing is closely tied with the behavior of the application
			// User Acceptance Testing(UAT): is all about behavior the site delivers
			// BDD is an approach, a methodology to our software development and testing


		// WHY BDD?
			// 1. Functionality
			// 2. Easy to access
			// 3. User friendly
			// 4. Reflecting balance properly
	
	// Core Principles:
		// 1. Enough is enough:
		// 2. Deliver stakeholder value: 
		// 3. It's a behavior:
	
	// Business side: will only have domain driven design
	// Technology side: will have test driven development (TDD)
	// BDD takes place in the middle or the intersectino of above 2
	
	
	// Feature file: aka Gherkin Language: business people and tech people comes into mutual understanding 
		// technology and business has their inputs into making this Feature file
		// 1. Given: The pre-condition- what and where page for the testing
		// 2. When: The actions to test - the valid and invalid credentials
				// different test steps to conduct testing...
		// 3. Then: The expected result	--> what's the result out of valid vs invalid credentials
				// here we validate the result
	
	// Step definition: using any languages like Java Language , C#, Python, Javascript, etc.
		// we need a tool to help us convert the feature file to step definition
		// I need a class called Runner Class to help me run the feature file	
		// BDD is an approach, a methodology to our software development and testing
		// Cucumber is a tool to help implement our BDD approach
	
	
	// IntellIJ:
	
	// While creating Maven project:
		// Group ID: BDD
		// Artfact ID: Cucumber
	
	
		
	
	// even if you dont have anything inside the @Test method, given its empty inside the curly brace, it still counts as test case...
		// it might not do anything but it still will run through it before moving onto another @Test
	
	// this class, LoginPageTest, itself is a Test Suite: it has 1 or more test cases inside of it....
		// any method with @Test annotations are considered test cases
	
	// as long as we have something inside the semi-colon, it is working in the background so considered part of test steps
		// Basically, each semi-colon is a test step
	
	
	// Differentiate between:
		// 1. Test case: every single method which has @Test annotations
		// 2. Test step: every single semi-colon statement
		// 3. Test suite: the class which has all the test cases and test steps which will be used to run the testing

	
	// In the pom.xml: depenedency we use is Junit instead of TestNG
		// for Junit, we have to use cucumber-junit dependency as well
		// for TestNG, we hve to use cucumber-testNG dependency....
	
	
	
	
	// ============== ============= ============= ============== ================ =====================
	
	
	
	/*
	LoginPage = loginPageObj;
	
	@BeforeMethod
	public void setUp() {
		
		initDriver();
		loginPageObj = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void loginTest() throws Throwable{
		loginPageObj.enterUserName("demo@techfios.com");
		loginPageObj.enterPassword("abc123");
		loginPageObj.clickSignInButton();
		takeScreenshot(driver);
	}
	
	@Test
	public void pageTitleTest() throws Throwable{
		loginPageObj.enterUserName("demo@techfios.com");
		loginPageObj.enterPassword("abc123");
		loginPageObj.clickSignInButton();
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPageObj.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		takeScreenshot(driver);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	*/
	
	
	
}
