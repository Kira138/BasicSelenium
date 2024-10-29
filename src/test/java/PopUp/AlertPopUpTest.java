package PopUp;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpTest {
	
	@Test
public void alertPopUpTest()throws Throwable
{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();	
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		//or
		//driver.switchTo().alert().accept();
		//String ele=driver.switchTo().alert().getText();
		//System.out.println(ele);
		   
		 //driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		 //driver.switchTo().alert().accept();//------>click on Ok button
		 //driver.switchTo().alert().dismiss();//------>click on cancel button*/
		   
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		 driver.switchTo().alert().sendKeys("Gud evng");
		 driver.switchTo().alert().accept();
	}

}
