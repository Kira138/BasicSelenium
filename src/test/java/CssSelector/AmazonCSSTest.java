package CssSelector;
//Syntax 1
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonCSSTest {
@Test
	public void amazonCSSTest() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_3']")).click();
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Nike");
		WebElement submit=driver.findElement(By.cssSelector("[type='submit']"));
		submit.click();
		WebElement result=driver.findElement(By.cssSelector("[class='a-size-base-plus a-color-base a-text-normal']"));
		System.out.println(result.getText());

	}

}
