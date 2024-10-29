package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		WebElement dropwdown=driver.findElement(By.xpath("//select[@id='dropdown']"));
		dropwdown.click();
		WebElement option2=driver.findElement(By.xpath("//option[@value='2']"));
		option2.click();
	}

}
