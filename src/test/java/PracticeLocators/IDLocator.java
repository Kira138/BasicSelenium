package PracticeLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.saucedemo.com/v1/");
Thread.sleep(1000);
driver.findElement(By.name("user-name")).sendKeys("standard_user"); //name
Thread.sleep(1000);
driver.findElement(By.name("password")).sendKeys("secret_sauce");
Thread.sleep(1000);
driver.findElement(By.id("login-button")).click(); //id
Thread.sleep(2000);
List<WebElement> ele=driver.findElements(By.tagName("a")); //tagname
for(WebElement result:ele)
{
	System.out.println(result.getText());
}
driver.findElement(By.className("shopping_cart_link")).click(); //className




	}

}
