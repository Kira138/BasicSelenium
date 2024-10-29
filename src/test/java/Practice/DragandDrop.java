package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		driver.manage().window().maximize();
		WebElement dragA=driver.findElement(By.id("column-a"));
		WebElement dropB=driver.findElement(By.id("column-b"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragA, dropB).perform();
	}

}

