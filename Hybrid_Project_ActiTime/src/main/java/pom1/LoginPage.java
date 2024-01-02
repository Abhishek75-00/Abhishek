package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// WebElement -- declare globally  by access specifier private
	//Intialize by using constructor the WebElement by access specifer public
	// Utilized the WebEleemnt by access specfier public
	
	//https://online.actitime.com/marolix2/login.do
	
//	findElement -- Single element -- We will exception like no such Element found
//	findElements -- List of Element -- We will get empty list if on matching element is found

	//StaleExceptionRefrenece 
	//gangadharmarolix@gmail.com
    //jpAyaUML
	
	@FindBy (xpath="//input[@id='username']")
	private WebElement UserName;
	
	@FindBy (xpath="//input[@name='pwd']")
	private WebElement PassWord;
	
	@FindBy(xpath="//input[@id='keepLoggedInCheckBox']")
	private WebElement KeepMeSignInButton;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement LoginButton;

	private WebDriver driver;
	
	//@FindBy -- is used in POM in selenium  to specify the object location stratergy for webelement or a list of webelement

	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	
		this.driver=driver;
		
	}
	
	public void SendUserName(String Username) {
		UserName.sendKeys(Username);
		
	}
	public void SendPassWord(String Password) {
		PassWord.sendKeys(Password);
	}
	public void ClickOnKeepMeSignIn() {
		KeepMeSignInButton.click();
		
	}
	public void ClickOnLoginButton() {
		LoginButton.click();
	}

	
	
	
	// pom class is used to maintain code properly
	// Pom we can resolve the StaleElementRefrenceException
	//Reduce time for the modules
	// Number of Pom element / or variable are equal to no of element we find Html or DOM-(Document object module).
	
	
}
