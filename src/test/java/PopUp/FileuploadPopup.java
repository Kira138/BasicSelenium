package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\kiran\\Documents\\Kiran Jaya Prakash Agile Project Manager.pdf");
		driver.findElement(By.id("file-submit")).click();

	}

}
