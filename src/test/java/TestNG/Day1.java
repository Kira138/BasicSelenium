package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Day1 {
	  @BeforeClass
	    public void beforeClass() {
	        System.out.println("BeforeClass: Executing before the first test method in the class");
	    }

@Test  (timeOut=4000)            //first test case
	public void Demo() {
		System.out.println("Hello");
	}
@Test(groups={"Smoke"})
public void SecondTest(){

	System.out.println("bye");	 //second test case
}
@AfterTest
public void tearDown() {
    System.out.println("AfterTest: Cleaning up after all tests have run");
}
@AfterMethod
public void afterMethod() {
    System.out.println("AfterMethod: Executing after each test method");
    

}
}
