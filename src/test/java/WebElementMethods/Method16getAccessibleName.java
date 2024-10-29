package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method16getAccessibleName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbar=driver.findElement(By.name("field-keywords")); //field type
		WebElement ele=driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(searchbar.getAccessibleName());
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		System.out.println(logo.getAccessibleName());
		WebElement link=driver.findElement(By.cssSelector("[data-csa-c-content-id='nav_cs_bestsellers']"));
		System.out.println(link.getAccessibleName());
	}

}
