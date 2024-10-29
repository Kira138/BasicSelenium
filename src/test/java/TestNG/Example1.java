package TestNG;
import org.testng.annotations.Test;

public class Example1 {  //if i click on run all,all the methods will be executed
	
     @Test(priority=-1)
	public void CreateContact() { //--independent
    	 System.out.println("Contact Created"); // if i click on run only this method will be executed
     }
     
     @Test(enabled=false) //to skip this step from execution
     public void ModifyContact() {    //--depend on first             // if i click on run only this method will be executed
    	 System.out.println("Contact Modified");
     }
		@Test(invocationCount=3) //execute for three times with same set of data
     public void DeleteContact() {      //--depend on first             // if i click on run only this method will be executed
    	 System.out.println("Contact Deleted");
     }
		

	}
//if independent method gets pass dependents also will pass
//if independent method gets fail dependents will skip
//to avoid writing multiple times of @test we can write one time above the class
