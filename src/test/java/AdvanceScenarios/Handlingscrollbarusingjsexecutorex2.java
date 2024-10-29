package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingscrollbarusingjsexecutorex2 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com ");
		//WebElement ele=driver.findElement(By.xpath("//a[text()='Instagram']"));
		//Point loc=ele.getLocation(); //point is return type of getlocation
		//System.out.println(loc.getX());
		//System.out.println(loc.getY());
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(392,825)");
		//Thread.sleep(2000);
		//ele.click();
		                      //or
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView()", ele);
		//ele.click();
		
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//complete scroll down to the bottom
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//complete scroll up to the top
	}

}
