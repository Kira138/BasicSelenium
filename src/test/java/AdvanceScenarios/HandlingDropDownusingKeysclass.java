package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownusingKeysclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
        //Handling dropdown using keyboard strokes
		//handling dropdown using select class
		//Handling dropdown using webelement
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist=driver.findElement(By.id("day"));
		daylist.click();
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		daylist.sendKeys(Keys.ARROW_UP);
		daylist.sendKeys(Keys.ARROW_UP);


	}

}
