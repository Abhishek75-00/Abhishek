package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import pom1.HomePage;
import pom1.LoginPage;
import utils.Utility;

public class Verification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			//WebDriverManager.chromiumdriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	// testcase - Task verify -- test Case 1
		
		
		driver.get("https://online.actitime.com/marolix2/login.do");
		
		LoginPage lp=new LoginPage(driver);
		String user=Utility.fetchExcelData("Sheet1", 1, 0);
		lp.SendUserName(user);
		String pass=Utility.fetchExcelData("Sheet1", 1, 1);
		lp.SendPassWord(pass);
		lp.ClickOnKeepMeSignIn();
		lp.ClickOnLoginButton();
		
		HomePage hp=new HomePage(driver);
//		
//		Thread.sleep(2000);
//		hp.Opentask();
//		
//		
//		String url=driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		System.out.println(url);
//		System.out.println(title);
//		
//		if(url.equals("https://online.actitime.com/marolix2/tasks/tasklist.do")&& title.equals("actiTIME - Task List"))
//		{
//			System.out.println("Pass");
//		}
//		else 
//		{
//			System.out.println("Failed");
//		}
//		
//		hp.ClickOnLogout();
//		
//		
//		// testcase - Report verify === Test case 2
//		driver.get("https://online.actitime.com/marolix2/login.do");
//		
//			
//		//LoginPage lp=new LoginPage(driver);
//		//String user1=Utility.fetchExcelData("Sheet1", 1, 0);
//		lp.SendUserName();
//	//	String pass1=Utility.fetchExcelData("Sheet1", 1, 1);
//		lp.SendPassWord();
//		lp.ClickOnKeepMeSignIn();
//		lp.ClickOnLoginButton();
//				
//		
//		hp.OpenReports();
//				
//		String url1=driver.getCurrentUrl();
//	String title1 = driver.getTitle();
//				
//	System.out.println(url1);
//	System.out.println(title1);
//				
//	if(url1.equals("https://online.actitime.com/marolix2/reports/dashboard.do")&& title1.equals("actiTIME - Reports Dashboard"))
//		{
//			System.out.println("Pass");
//	}
//	else 
//	{
//		
//		System.out.println("Failed");
//				}
//				hp.ClickOnLogout();
//	
//				
				
				
				// test case 3
	}

}
