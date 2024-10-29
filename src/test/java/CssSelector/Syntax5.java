package CssSelector;
//split class
//driver.findElement(By.cssSelector(".class-name"));
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.className("input_error")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");	//partial class name
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".submit-button")).click();
		Thread.sleep(1000);

	}

}
