package CssSelector;
//Syntax2: driver.findElement(By.cssSelector("tag[attribute='value']"))
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Syntax2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("[data-csa-c-slot-id='nav_cs_3']")).click();
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Nike");
		WebElement submit=driver.findElement(By.cssSelector("[type='submit']"));
		submit.click();
	}

}
