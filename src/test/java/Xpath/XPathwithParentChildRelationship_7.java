package Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathwithParentChildRelationship_7 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx']/input[@type='text'])[2]")).sendKeys("Mango");
		Thread.sleep(2000);


		WebElement result=driver.findElement(By.xpath("//a[@class='QuickSearch___StyledLink2-sc-rtz2vl-14 eDvWYJ']"));
		result.click();
		Thread.sleep(2000);
		List<WebElement>MangoAdd=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='flex items-center justify-between w-full h-full']")));
		for(int i = 0;i<4 && i<MangoAdd.size();i++)
		{
			 WebElement addButton = MangoAdd.get(i);
			 wait.until(ExpectedConditions.elementToBeClickable(addButton)).click();

			//parent_tag/child_tag[@attribute='value']
		}
	}

	}

