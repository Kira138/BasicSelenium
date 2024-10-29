package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.prokabaddi.com/standings");
        driver.manage().window().maximize();
        Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[1]/p[@class='count']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[2]/p[@class='count']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[3]/p[@class='count']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[4]/p[@class='count']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[5]/p[@class='count']")).getText());
		System.out.println(driver.findElement(By.xpath("//p[text()='Bengaluru Bulls']/../../../following-sibling::div[7]/p[@class='count']")).getText());
	}

}
