package base1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Broswer {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\abhi\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\abhi\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
//	public static WebDriver openOperaBroswer() {
//		System.setProperty("webdriver.opera.driver", "D:\\abhi\\operadriver_win32\\operadriver_win32\\operadriver.exe");
//		WebDriver driver=new OperaDriver();
//		return driver;
//	}
	
}
