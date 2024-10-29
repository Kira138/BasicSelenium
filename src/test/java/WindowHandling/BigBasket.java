package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[1]")).sendKeys("Apple",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//img[@title='fresho! Apple - Red Delicious / Washington, Regular 2x4 pcs']")).click();
		String win1=driver.getWindowHandle();
		Set<String>allId=driver.getWindowHandles();
		for(String Id:allId)
		{
			if(!win1.equals(Id))
			{
				driver.switchTo().window(Id);
				String applename=driver.findElement(By.xpath("//div[@class='flex flex-col']//section//h1")).getText();
				System.out.println(applename);
				String Price=driver.findElement(By.xpath("//tr[@class='flex items-center justify-start mb-1 text-base font-bold text-darkOnyx-800']")).getText();
				System.out.println(Price);
			}
			
		}
		
		
		
		
		
}

	}

