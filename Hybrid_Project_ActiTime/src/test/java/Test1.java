import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","D:\\abhi\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://www.facebook.com/");
	
	}

}
