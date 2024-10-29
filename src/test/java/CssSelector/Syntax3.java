package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//#idattributevalue: driver.findElement(By.cssSelector("#id"));
public class Syntax3 { //only for id

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#login-button")).click();
		Thread.sleep(1000);
	}

}
