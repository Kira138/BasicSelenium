package Xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentChildRelationship_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx']/input[@type='text'])[2]")).sendKeys("Mango");
		Thread.sleep(2000);
		WebElement result=driver.findElement(By.xpath("//a[@class='QuickSearch___StyledLink2-sc-rtz2vl-14 eDvWYJ']"));
		result.click();
		Thread.sleep(2000);
		List<WebElement>MangoNames=driver.findElements(By.xpath("//div[@class='break-words h-10 w-full']"));
		List<WebElement>MangoPrices=driver.findElements(By.xpath("//span[@class='Label-sc-15v1nk5-0 Pricing___StyledLabel-sc-pldi2d-1 gJxZPQ AypOi']"));
		for(int i = 0;i<3 && i<MangoNames.size();i++)
		{
			System.out.println(MangoNames.get(i).getText()+"---"+MangoPrices.get(i).getText());
		}
		//parent_tag/child_tag[@attribute='value']

	}

}
