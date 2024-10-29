package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathwithContainsFunction_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("Puma");
		driver.findElement(By.xpath("//input[contains(@id,'ton')]")).click();
	}//tagname[contains(@attribute, 'partial_value')]

}
