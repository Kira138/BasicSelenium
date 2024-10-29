package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method8isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		if(logo.isDisplayed()) { 
			System.out.println("Facebook name is displayed");
		}
			else
			{
				System.out.println("Facebook name is not displayed");
			}
	}

}
