package WebDriverMethods;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Method_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.example.com"); //get(String url)---1
		String title = driver.getTitle();//getTitle()---2
		String currentUrl = driver.getCurrentUrl();//getCurrentUrl()---3
		WebElement element = driver.findElement(By.id("element-id"));//findElement(By by)---4
		List<WebElement> elements = driver.findElements(By.className("elements-class"));//findElements(By by)---5
		String pageSource = driver.getPageSource();//getPageSource()---6
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();//manage()---7
		driver.navigate().to("https://www.example.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();//navigate()---8
		driver.switchTo().frame("frameName");
		driver.switchTo().window("windowName");
		driver.switchTo().alert().accept();//switchTo()---9
		String windowHandle = driver.getWindowHandle();//getWindowHandle()---10
		Set<String> windowHandles = driver.getWindowHandles();//getWindowHandles()---11
		driver.close(); //close()---12
		driver.quit(); //quit()---13
				
		
	}

}
