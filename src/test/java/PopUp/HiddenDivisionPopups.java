package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopups {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)");//(x-axis,y-axis)--for scroll down
		Thread.sleep(2000);
		//not prefered 
		//driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='5']")).click(); //  /..backward traversing to parent and then // from parent to any child
		//driver.findElement(By.xpath("//div[text()='September 2024']/Ancestor::div[@class='DayPicker-Month']//p[text()='5']")).click();
		//driver.findElement(By.xpath("//div[text()='September 2024']/Ancestor::div[@class='DayPicker-Month']/descendant::p[text()='5']")).click();
	//dynamic xpath is prefered
		String month="September 2024";
		String date="7";
		driver.findElement(By.xpath("//div[text()='" + month + "']/ancestor::div[@class='DayPicker-Month']//p[text()='" + date + "']")).click();
	    
		
	}
	
	

}
