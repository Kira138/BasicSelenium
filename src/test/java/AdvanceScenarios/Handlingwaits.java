package AdvanceScenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
