package CssSelector;
//Syntax 1 By Attribute:driver.findElement(By.cssSelector("[attribute='value']"));
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[placeholder='Username']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name='password']")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(1000);
	}

}
