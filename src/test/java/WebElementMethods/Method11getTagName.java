package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method11getTagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				WebElement search=driver.findElement(By.name("field-keywords"));
				System.out.println(search.getTagName()); 
	}

}
