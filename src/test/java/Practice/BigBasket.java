package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasket {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/ps/?q=mango&nc=as");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		List<WebElement>name=driver.findElements(By.xpath("//h3[@class='block m-0 line-clamp-2 font-regular text-base leading-sm text-darkOnyx-800 pt-0.5 h-full']"));
		for(int i=0;i<name.size();i++)
		{
		String Mango=name.get(i).getText();
		if(Mango.contains("Lalbagh Mango - Sindhura"))
		{
			Thread.sleep(2000);
			driver.findElements(By.xpath("//button[text()='Add']")).get(i).click();
			break;
		}
		}
}
}