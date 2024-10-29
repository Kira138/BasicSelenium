package CssSelector;
//Syntax 1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonBluetoothTest {
@Test
	public void amazonBluetoothTest() {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("bluetooth earphones");
		WebElement submit=driver.findElement(By.cssSelector("[type='submit']"));
		submit.click();
		WebElement result=driver.findElement(By.cssSelector("[class='a-row a-size-base a-color-base']"));
		System.out.println(result.getText());
	}

}
