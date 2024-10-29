package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CliniqueTest {
@Test
	public void cliniqueTest() throws Throwable  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.clinique.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class='product-card-image'])[1]")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//button[@class='product-details-add-to-bag-button']")).click();
		//[name()='svg' and @AttributeName='AttributeValue']
		//or
		driver.findElement(By.xpath("//*[@aria-labelledby='gnav-cart-icon']")).click(); //for svg

		//retry this xpath and add items to the cart
		//bigbbasket auto suggestion
	}

}
