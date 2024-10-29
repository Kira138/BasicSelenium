package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method6getSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//span[text()='Mobiles']"));
		System.out.println(ele.getSize().getHeight());
		System.out.println(ele.getSize().getWidth());
	}

}
