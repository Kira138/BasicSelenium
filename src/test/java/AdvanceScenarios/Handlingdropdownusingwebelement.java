package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingdropdownusingwebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//option[@value='18']")).click();
		driver.findElement(By.xpath("//option[text()='Mar']")).click();
		driver.findElement(By.xpath("//option[@value=\"1980\"]")).click();
		//or
		//driver.findElement(By.xpath("//option[@value='1980']")).click();
	}

}
