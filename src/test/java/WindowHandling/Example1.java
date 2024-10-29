package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Apple iphone 15(Black,128GB']")).click();
		String mainid=driver.getWindowHandle();
		System.out.println(mainid);
		Set<String>allIds=driver.getWindowHandles();
		System.out.println(allIds);
		for(String ID:allIds)
		{
			if(!mainid.equals(ID))
			{
			driver.switchTo().window(ID);
			String phn=driver.findElement(By.xpath("//span[text()='Apple iphone 15(Black,128GB']")).getText();
			System.out.println(phn);
			
			}
		}
	}

}
