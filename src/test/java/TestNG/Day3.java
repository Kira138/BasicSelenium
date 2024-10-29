package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Day3 {
	
	@Test(groups={"Smoke"})
	public void WebLoginCarLoan()
	{
		System.out.println("Selenium Code");
	}
	 @BeforeSuite
	    public void beforeSuite() {
	        System.out.println("BeforeSuite: Executing before the entire test suite");
	    }
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("Appium Code");
	}
	
	@Test(dependsOnMethods= {"WebLoginCarLoan"})
	public void APICarLoan()
	{
		System.out.println("Rest API");
	}
	

	
}
