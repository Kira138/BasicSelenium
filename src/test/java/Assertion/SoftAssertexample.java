package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertexample {


	@Test
	public void m1()
	{
		System.out.println("Step1");
		System.out.println("Step2");
		SoftAssert soft = new SoftAssert();
		//Assert.assertEquals(true, true);
		Assert.assertEquals(true, false);//actual value,expected value
		System.out.println("Step3");
		System.out.println("Step4");
		soft.assertAll();
	}
	
		

	}


