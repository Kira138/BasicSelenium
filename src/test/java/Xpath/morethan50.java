package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class morethan50 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement>IphonePrices=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for(WebElement PhnPrice:IphonePrices)
		{
			 String PriceText = PhnPrice.getText();
			 PriceText = PriceText.replace("₹", "").replace(",", "").trim();
			  int price = Integer.parseInt(PriceText);
			if(price>60000)
			{
				System.out.println("₹" + price);
			{
		}
	}
		}
}
}
