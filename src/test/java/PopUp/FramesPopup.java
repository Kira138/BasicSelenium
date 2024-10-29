package PopUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Switching frames using index------>Index value starts from 0
		 * Switching frames using id or name attribute
		 * Switching frames using WebElement
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
 
		driver.get("https://jqueryui.com/droppable/");
		//Switching frames using index------>Index value starts from 0.search //iframe and check for which index it will highlight
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag, drop).perform();
}
	
	}


