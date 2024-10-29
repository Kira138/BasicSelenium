package CssSelector;
//Syntax 6:By Tag and class. driver.findElement(By.cssSelector("tag.class-name"));
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax6 {

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
		driver.findElement(By.cssSelector("input.submit-button")).click();//html tag with class.
		Thread.sleep(1000);

	}

}
