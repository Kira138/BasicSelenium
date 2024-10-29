package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   single frame //iframe. multipleframe //frame
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		driver.switchTo().frame("frame-top");
		 driver.switchTo().frame("frame-left");
		WebElement print = driver.findElement(By.xpath("//body"));
		System.out.println(print.getText());
		driver.switchTo().parentFrame();
		 driver.switchTo().frame("frame-right");
		 WebElement right = driver.findElement(By.xpath("//body"));
			System.out.println(right.getText());
			driver.switchTo().parentFrame();
			driver.switchTo().defaultContent();
			driver.switchTo().frame("frame-bottom");
			WebElement bottom = driver.findElement(By.xpath("//body"));
			System.out.println(bottom.getText());
			
		

	}

}
