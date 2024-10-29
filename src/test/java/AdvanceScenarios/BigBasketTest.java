package AdvanceScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class BigBasketTest {
@Test
	public void bigBasketTest() throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='QuickSearch___StyledMenuButton-sc-rtz2vl-1 dpuSIx']/input[@type='text'])[2]")).sendKeys("Mango");
		Thread.sleep(2000);
		List<WebElement> result= driver.findElements(By.xpath("//div[@class='flex-1 flex items-center mr-2.5 overflow-hidden']"));
         for(WebElement ele:result)
{
	System.out.println(ele.getText());
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    WebElement Mango = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='Label-sc-15v1nk5-0 QuickSearch___StyledLabel2-sc-rtz2vl-7 gJxZPQ gFDEBU'])[2]")));
	Mango.click();
}


	}

}
