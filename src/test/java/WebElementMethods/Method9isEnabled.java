package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method9isEnabled {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
         WebElement link=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		  Thread.sleep(2000);
		if(link.isEnabled()) { 
			link.click();
		}
			else
			{
				System.out.println("Element is not enabled");
			}
		Thread.sleep(2000);
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='1']"));
		radiobutton.click();
	}

}
