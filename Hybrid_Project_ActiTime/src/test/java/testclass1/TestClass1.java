package testclass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pom1.HomePage;
import pom1.LoginPage;
import utils.Utility;


public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","D:\\abhi\\chromedriver-win32\\chromedriver.exe");
		//ChromeOptions ops=new ChromeOptions();
		//ops.addArguments("remote--allows--origins=*");
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://online.actitime.com/marolix2/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		LoginPage lp=new LoginPage(driver);
		
		
		String Username=Utility.fetchExcelData("Test1", 1, 0);
		lp.SendUserName(Username);
		String Password=Utility.fetchExcelData("Test1", 1, 1);
		lp.SendPassWord(Password);
		lp.ClickOnKeepMeSignIn();
		lp.ClickOnLoginButton();
		
		
		HomePage hp=new HomePage(driver);
		hp.Opentask();
		hp.OpenReports();
		hp.OpenUsers();
		//hp.ClickOnLogout(); 
		
		//driver.quit();
		
		

}}
