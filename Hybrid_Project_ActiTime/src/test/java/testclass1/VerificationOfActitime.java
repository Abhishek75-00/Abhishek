package testclass1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base1.Broswer;
import pom1.HomePage;
import pom1.LoginPage;
import utils.Utility;




public class VerificationOfActitime extends Broswer{
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	SoftAssert soft;

	String Username;
	String Password;
	int testid;

	@Parameters("browserName")
	  @BeforeTest
	  public void launchBrowser(String browser) {
		  System.out.println("Before test");
			//System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver-win32\\chromedriver.exe");
			//driver=new ChromeDriver();
		  if(browser.equals("Chrome")){
			  driver=openChromeBrowser();
		  }
		  if(browser.equals("Firefox")){
			  driver=openFirefoxBrowser();
		  }
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
	  }



		@BeforeClass // launch browser code are written in this annotation
		public void createPOMObjects() {
			System.out.println("BeforeClass");
			
		
			lp=new LoginPage(driver);
			hp=new HomePage(driver);
			
		}
		
		@BeforeMethod // login - object creations - invoke browser
		public void LoginToApplication() {
			System.out.println("Before Method");
			driver.get("https://online.actitime.com/marolix10/login.do");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			 lp=new LoginPage(driver);
			
			String Username=Utility.fetchExcelData("Sheet1", 1, 0);
			
			lp.SendUserName(Username);
			String Password=Utility.fetchExcelData("Sheet1", 1, 1);
			lp.SendPassWord(Password);
			lp.ClickOnKeepMeSignIn();
			lp.ClickOnLoginButton();
			
			
			hp=new HomePage(driver);
			
			soft=new SoftAssert();
		}
		
		
		@Test
		public void ToverifyOpenTask() {
			testid=001;
			System.out.println("Test-A");
			
			hp.Opentask();
			String url=driver.getCurrentUrl();
			String title=driver.getTitle();
			System.out.println(url);
			System.out.println(title);
			//Assert.assertNotEquals("https://online.actitime.com/marolix2/timetrack/enter.", "https://online.actitime.com/marolix2/timetrack/enter.do");
		soft.assertEquals("https://online.actitime.com/marolix10/timetrack/enter.do","https://online.actitime.com/marolix10/timetrack/enter.do");
	   soft.assertAll();
		}

		@Test 
		public void ToVerifyOpenReports() throws InterruptedException {
			testid=002;
			System.out.println("Test-b");
			
			hp.OpenReports();
			String url1=driver.getCurrentUrl();
			String title1=driver.getTitle();
			System.out.println(url1);
			System.out.println(title1);
			Assert.assertEquals("https://online.actitime.com/marolix10/reports/dashboard.do","https://online.actitime.com/marolix10/reports/dashboard.do");

			//Assert.assertTrue(true);
		
		}
		@Test
		public void ToVerifyUser() throws InterruptedException {
			testid=003;
			System.out.println("Test-c");
			
			hp.OpenUsers();;
			String url1=driver.getCurrentUrl();
			String title1=driver.getTitle();
			System.out.println(url1);
			System.out.println(title1);
			
			Assert.assertEquals("https://online.actitime.com/marolix10/administration/userlist.do","https://online.actitime.com/marolix10/administration/userlist.do");
			//Assert.assertFalse(true);
		//Assert.fail();
		}
		
		
		@AfterMethod //  logout from application
		public void  LogoutFromApplication(ITestResult result) throws IOException {
			System.out.println("AfterMethod");
			if(ITestResult.FAILURE==result.getStatus()) {
				Utility.capture(driver, testid=002, "ToVerifyOpenReports");
				}
			hp.ClickOnLogout();
		}
		
		@AfterClass // closed the browser
		public void clearObject() {
			lp=null;
			hp=null;
		}
		@AfterTest
		public void ClosedBrowser() {
			System.out.println("afterclass");
			
			driver.quit();
			driver=null;
			System.gc();//garbage collected
			
		}
}
