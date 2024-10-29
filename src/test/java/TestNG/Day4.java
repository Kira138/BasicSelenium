package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day4 {
	@BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod: Executing before each test method");
    }
	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(enabled=false) //to skip this test case
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHome");
	}
	@BeforeTest
    public void setUp() {
        System.out.println("BeforeTest: Setting up before any test runs");
    }
	@AfterClass
    public void afterClass() {
        System.out.println("AfterClass: Executing after all test methods in the class");
    }
}
