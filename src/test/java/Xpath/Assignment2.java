package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement>IphoneNames=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement>IphonePrices=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		//int size= IphoneNames.size();
		//int count = 0; //to count number of phones
		for(int i = 0;i<IphoneNames.size();i++)
		{
			System.out.println(IphoneNames.get(i).getText()+"---"+IphonePrices.get(i).getText());
			//count++;
			//List<WebElement>is return type for multiple element
			//WebElement - return type for single element
			//only for single element getText()
		}
		//System.out.println("total num of phones" +count);
	}

}
