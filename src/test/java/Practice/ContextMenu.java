package Practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/context_menu");
		WebElement rightclick=driver.findElement(By.id("hot-spot"));
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		Alert alt=driver.switchTo().alert();
				alt.accept();
	}

}
