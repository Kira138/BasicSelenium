package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method18getText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		String name=driver.findElement(By.xpath("//span[text()='Mens Revolution 6 Nn 4e Running Shoes']")).getText(); 
		System.out.println(name);
	}

}
