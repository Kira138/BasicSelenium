package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyboardStokesUsingKeysClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//Approach1:-KeysClass(always write inside sendkeys) --- Static
		//Approach2:-RobotClass --non Static
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(1000);
		//case1:-
	//WebElement usertext=driver.findElement(By.name("user-name"));
	//usertext.sendKeys("standard_user",Keys.TAB);
	//WebElement password=driver.findElement(By.name("password"));
	//password.sendKeys("secret_sauce",Keys.ENTER);
		//case2:-
	//driver.findElement(By.name("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);

	WebElement UserName=driver.findElement(By.name("user-name"));
	UserName.sendKeys("standard_user",Keys.CONTROL+"a");
	UserName.sendKeys(Keys.CONTROL+"c");
	UserName.sendKeys(Keys.TAB,Keys.CONTROL+"v");


	}//keys class method is called only inside sendkeys

}//try for bigbasket to search apple
