package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathwithMultipleAttributes_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id='nav_cs_5']")).click(); //both attribute should be true
		//driver.findElement(By.xpath("//a[@tabindex=' ' or @data-csa-c-slot-id='nav_cs_4']")).click();//either 1 should be true
		driver.findElement(By.xpath("//a[@class='nav-a  ' and text()='Mobiles']")).click();//by visible text
	} //tagname[@attribute1='value1' and @attribute2='value2']
	 //tagname[@attribute1='value1' or @attribute2='value2']

}
