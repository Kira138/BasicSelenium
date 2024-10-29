package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoading {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	        driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']")).click();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement startButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']/button")));
	        startButton.click();
	        WebElement print = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='finish']/h4")));
	        System.out.println(print.getText());
	        driver.navigate().back();
	        
	        driver.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']")).click();
	        WebElement startButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='start']/button")));
	        startButton1.click();
	        WebElement print1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='finish']/h4")));
	        System.out.println(print1.getText());
	}

}
