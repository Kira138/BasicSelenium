package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingdropdownusingselectclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//three approach
		//*select by index
		//*select by value
		//*select by visible text
		Thread.sleep(1000);
		WebElement daylist =driver.findElement(By.id("day"));
		Select selectday=new Select(daylist);
		//selectday.selectByIndex(9);
		selectday.selectByValue("10");
		Thread.sleep(1000);
		WebElement monthlist =driver.findElement(By.id("month"));
		Select selectmonth=new Select(monthlist);
		//selectmonth.selectByIndex(11);
		//selectmonth.selectByValue("12");
		selectmonth.selectByVisibleText("Dec");
		Thread.sleep(1000);
		WebElement yearlist =driver.findElement(By.id("year"));
		Select selectyear=new Select(yearlist);
		//selectyear.selectByIndex(24); 2024 is 0th index and 2024 is 24th index
		//selectyear.selectByValue("2000");
		selectyear.selectByVisibleText("2000");
		//this works only for select tag
		
	}

}
