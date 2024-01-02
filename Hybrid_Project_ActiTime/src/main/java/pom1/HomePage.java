package pom1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy (xpath="//a[@class='content tt']")
	private WebElement timetrack;
	
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement task;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement user;
	
	@FindBy(xpath="(//a[@id='logoutLink'])[1]")
	private WebElement Logout;
	
	@FindBy(xpath="")
	private List<WebElement> list;
	
	
	private Actions act;
	private JavascriptExecutor js;
	private WebDriverWait wait;
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		act=new Actions(driver);
		js=(JavascriptExecutor)driver;
		this.driver=driver;
	}
	public void Opentask() {
		
		js.executeScript("arguments[0].click();",task);
		//act.moveToElement(task).click().build().perform();
		//task.click();
	}
	public void OpenReports() {
		
		js.executeScript("arguments[0].click();",reports);
		//reports.click();
	}
	public void OpenUsers() {
			user.click();
	}
	public void ClickOnLogout() {
		
		js.executeScript("arguments[0].click();",Logout);
	}
	
}
