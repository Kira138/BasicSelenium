package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExitIntent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
          driver.get("https://the-internet.herokuapp.com/exit_intent");
          WebElement body = driver.findElement(By.tagName("body"));
          Actions actions = new Actions(driver);

          // Move to an element and then move the mouse slightly out of the viewport
      
          actions.moveToElement(body, 0, 0).perform(); // Move to top-left corner
          actions.moveByOffset(0, 500).perform(); // Move 500 pixels down
        
        
	}

}
