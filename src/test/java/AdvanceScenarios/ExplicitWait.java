package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.cssSelector("input[type='submit']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		String ele=driver.findElement(By.xpath("//div(text()='Sauce Labs Backpack']")).getText();
		wait.until(ExpectedConditions.titleContains("Swag Labs"));
		
		
	}

}
