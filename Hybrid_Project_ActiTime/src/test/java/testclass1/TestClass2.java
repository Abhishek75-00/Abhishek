package testclass1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeClass
	public void Launchcode() {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void LoginIntheApplication() {
		System.out.println("BeforeMethod");
	}
	@Test (dependsOnMethods= {"Test_C","Test_B"})
	public void Test_Z() {
		System.out.println("Test-Z");
	}
	@Test(priority=2)
	public void Test_B() {
		System.out.println("Test-B");
	}
	@Test(priority=3)
	public void Test_C() {
		System.out.println("Test-C");
	}
	@Test(timeOut=5000)
	public void Test_D() throws InterruptedException {
		System.out.println("Test-D");
		Thread.sleep(1000);
		System.out.println("hii");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void Closebrowser() {
		System.out.println("AfterClass");
	}
	
}
