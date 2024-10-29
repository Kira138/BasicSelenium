package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Samsung phone");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		String result=driver.findElement(By.xpath("//div[text()='SAMSUNG 1207']")).getText();
		System.out.println(result);
		String price=driver.findElement(By.xpath("//div[contains(text(),'\u20B91,699')]")).getText();
		System.out.println(price);

	}

}
