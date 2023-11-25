
package nb_c12s10_Util_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LoginTest {

	
	
	
	
	
	// IQA 1: Have you tested in mutliple countries environment? How wuold you do it?
		// I need to create a multi dimensional list or array for my string....and save my list. then object where I can ..
		// use @DataProvider annotation to run the testNG before @Test method....we need
		// to also add the parameters in our loginTest basd on our list

	// IQA 2: What kind of reporting system have you used?
		// For reporting, I have used JUnit....
		// For reporting, I have used TestNG...
		// For resporting, I have also used extent report...

	// IQA 3: How to explain framework?
		// 1. Language:
		// 2. Project Management Tool:
		// 3. Automation Tool: Selenium
		// 4. Framework Management Tool: Junit or TestNG
		// 5. Data Management: for data driven, talk about excel
		// 6. Reporting: JUnit Vs TestNG Vs Extent Report (use this for TestNG as well)
		// 7. POM : Page Object Model: talk about 3 different packages (Page, Util, and Test), what goes in there and how it works

	
	// if you want to learn moure about Extent reports and its detailed aspects:
		// Log4j: learn it from this....watch some youtube videos.....
	
	
	// Before hitting to the market, make sure you practice all the topics from w3schools website:
		// 1. From SQL, make sure to learn these topics:
			// distinct, order by, update, aggregate function, all types of joins, unions, having, 
			// they might ask you to get second highest number, or 10th highest number from the table....
			// Where do they keep all the stored procedure?
				// under SQL Programmability
		
		// 2. From Java: 
			// learn every topics and try to answer in short and precise answer rather than long, and multiple sentences
	
		// 3. From Selenium Automation:
			// 
	
		// 4. From API:
			//
	
		
	// Link for Shihab's github code from this session"
		// https://github.com/techfios-git/session10Feb23.git
	
	
	// one gitbash connects to one github account only... 
		// so you cannot push your code to another person's github account unless you switch back between their logins
	
	// Other ways to manage github:
		// eclipse git plugin
		// git tortoise
	
	
	// TDD: Test Driven Development
		// we will have our requirements so we will do our unit testing on it based on that..... 
		// testing framework for unit are JUnit and TestNG, protractor, child, mocha?
		// Unit tests become the regression tests
	
	// BDD: Behavior Driven Development; specification of Behavior
		// dealing with software, applications, etc.
		// Functional testing become the regression test
	
	
	
	
	// =================================================================================================

	
	
	
	
	

	WebDriver driver;
	ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	ExtentTest test;

	@BeforeClass
	public void reportGenerator() {

		extent = new ExtentReports();

		htmlReporter = new ExtentHtmlReporter("extentReport.html");
		extent.attachReporter(htmlReporter);
		test = extent.createTest("DataProvider", "Description");
		
	} 
	
	By USER_NAME_FIELD = By.xpath("//input[@id='username']");
	By PASSWORD_FIELD = By.xpath("//input[@id='password']");
	By SIGN_IN_BUTTON = By.xpath("//button[@name='login']");
	By DASHBOARD_HEADER_FIELD = By.xpath("//hr[text()=' Dashboard ']");
	By Customer_Menu_Field = By.xpath("//span[contains(text(), 'Customers')]");
	By Add_Customer_Menu_Field = By.xpath("//span[contains(text(), 'Add Customer')]");
	By Full_Name_Field = By.xpath("//*[@id=\"account\"]");
	By Company_Dropdown_Field = By.xpath("//select[@id='cid']");

	@BeforeMethod
	public void init() {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	}

	@DataProvider(name = "loginDataMultiUser")
	public String[][] loginData() {

		String[][] data = new String[][] { 
			{ "demo@techfios.com", "abc123" }, 
			{ "demo@techfios1.com", "abc123" },
			{ "demo@techfios.com", "123abc123" }, 
		};
		return data;

	}

	@Test(dataProvider = "loginDataMultiUser")
	public void loginTest(String userName, String password) {

		driver.findElement(USER_NAME_FIELD).sendKeys(userName);
		driver.findElement(PASSWORD_FIELD).sendKeys(password);
		driver.findElement(SIGN_IN_BUTTON).click();

	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(1500);
		driver.close();
		driver.quit();
	}
	
	@AfterClass
	public void reporterClose() {
		extent.flush();
	}

}
