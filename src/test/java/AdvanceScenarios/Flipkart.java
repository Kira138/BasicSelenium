package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("nike");
		Thread.sleep(2000);
		  List<WebElement> dropdownElements=driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		  Thread.sleep(2000);
		  for(WebElement ele:dropdownElements)
			{
				System.out.println(ele.getText());
				if(ele.getText().contains("nike t shirt"))
				{
					ele.click();
				}
			}



			}
		  }




