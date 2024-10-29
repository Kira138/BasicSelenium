package Xpath;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUsingAncestor_8 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//launching an application
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).click();
		driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='DOjaWF gdgoEp col-8-12']/div[@class='cPHDOP col-12-12'])[5]//div[1]//div[1]//li[@id='swatch-1-color']")).click();
		//ancestor_tag//descendant_tag[@attribute='value']
//	    /---->Traversing from parent to immd child
			//   //---->Traversing from parent to any child
			//   /..--->Traversing from child to parent
	}

}
