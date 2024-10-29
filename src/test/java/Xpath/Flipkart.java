package Xpath;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		//------------------------------------------Mouse action------------------------------------------------------------------------------------------
		  /*WebElement dropdown = driver.findElement(By.xpath("//div[@class='H6-NpN _3N4_BX']"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(dropdown).perform();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		  driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8904093548");
		  driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();*/
		//------------------------------------------Adding items to cart-------------------------------------------------------------------------------------
		  driver.findElement(By.xpath("(//div[@class='zlQd20 _1eDlvI'])[5]")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//div[text()='Motorola Edge 50 Fusion (Hot Pink, 128 GB)']")).click();
		  ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		  driver.switchTo().window(tabs.get(1));
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("560073");
		  driver.findElement(By.xpath("//span[text()='Check']")).click();
		  Thread.sleep(9000);
		  WebElement text=driver.findElement(By.xpath("//div[@class='dYhUKY']"));
		  System.out.println(text.getText());
		  driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		  Thread.sleep(4000);
		  driver.navigate().back();
		  WebElement dropdown = driver.findElement(By.xpath("//div[@class='bpjkJb']/span[1]"));
		  Actions actions = new Actions(driver);
		  actions.moveToElement(dropdown).perform();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//a[@title='Apple iPads']")).click();
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("//div[text()='Apple iPad (10th Gen) 64 GB ROM 10.9 inch with Wi-Fi Only (Silver)']")).click();
		  ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
		  if (tab.size() >= 3) {
	      driver.switchTo().window(tab.get(2));
		  Thread.sleep(4000);
		  WebElement Connectivity=driver.findElement(By.xpath("//a[text()='Wi-Fi+5G']"));
		  Connectivity.click();
		  Thread.sleep(8000);
		  WebElement Storage=driver.findElement(By.xpath("//a[text()='256 GB']"));
		  Storage.click();
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//*[text()='Add to cart']")).click();
		  Thread.sleep(8000);
		  WebElement Price=driver.findElement(By.xpath("//div[@class='DOjaWF gdgoEp col-4-12 MfqIAz']"));
		  System.out.println(Price.getText());
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//span[text()='Place Order']")).click();
















	}
	}
}
