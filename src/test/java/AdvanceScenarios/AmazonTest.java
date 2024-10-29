package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonTest {
@Test
	public void amazonTest() throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		Thread.sleep(2000);
		List<WebElement> dropdownElements=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		  Thread.sleep(2000);
		  for(WebElement ele:dropdownElements)
			{
				if(ele.getText().contains("15 pro max"))
				{
					ele.click();
				}
				//Thread.sleep(5000);
				//driver.findElement(By.xpath("//button[@id='a-autoid-3-announce']")).click();

			}


			}
		  }




