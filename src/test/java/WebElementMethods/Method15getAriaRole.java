package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method15getAriaRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.name("field-keywords")); //field type
		System.out.println(searchbar.getAriaRole());
		WebElement ele=driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(ele.getAriaRole());
	}

}
