package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import testClass.TestClass1;




	public class Browsers extends TestClass1{
		  public static WebDriver openChromeBrowser() {
			  System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Browsers\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   return driver;
		  }
		  
		  public static WebDriver openFirefoxbrowser() {
			  System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Browsers\\geckodriver.exe");
			  WebDriver driver= new FirefoxDriver();
			  return driver;
			  
		  }
			public static WebDriver openOperaminibrowser() {
				System.setProperty("webdriver.operamini.driver","D:\\abhi\\operadriver_win32\\operadriver_win32\\operadriver.exe");
				WebDriver driver=new OperaDriver();
				return driver;
			}
			public static WebDriver openMicrosoftedge() {
				System.setProperty("webdriver.microsoftedge.driver", "path for microsoftdriver");
				WebDriver driver=new EdgeDriver();
				return driver;
				
			}
			
			// base or pojo will use inheritance concept to extend the  parent to child classes
		}


