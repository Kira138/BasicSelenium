package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssertionexample {

		@Test
		public void m1()
		{
			System.out.println("Step1");
			System.out.println("Step2");
			Assert.assertEquals(true, true);
			System.out.println("Step3");
			System.out.println("Step4");
		}
		
		@Test
		public void m2()
		{
			String expData = "Shobha";
			String actData = "Shobha";
			Assert.assertEquals(actData, expData);
		}
	}


