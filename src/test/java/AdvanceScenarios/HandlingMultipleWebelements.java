package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement>allLink=driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement link:allLink) {
			//System.out.println(link.getText());//fetches visible text of link
			System.out.println(link.getAttribute("href"));//fetches href attribute

			count++;
		}
		System.out.println("total number of links---"+count); //that particular link doesn't contain href so we get null in console
	}

}
