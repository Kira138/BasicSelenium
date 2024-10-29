package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAllProducts {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/ps/?q=mango&nc=as");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1500,500)");
		 //Actions actions = new Actions(driver);
		 //actions.sendKeys(Keys.PAGE_DOWN).perform();
	        Thread.sleep(1000);
        List<WebElement> productNames = driver.findElements(By.xpath("//h3[@class='block m-0 line-clamp-2 font-regular text-base leading-sm text-darkOnyx-800 pt-0.5 h-full']"));
        List<WebElement> addButtons = driver.findElements(By.xpath("//button[text()='Add']"));
        for(int i=0;i<productNames.size();i++)
        {
        	productNames.get(i).getText();
        	addButtons.get(i).click();

        }
	}
	}

