package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Youtube {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Dwapara Lyrical | Krishnam Pranaya Sakhi | Golden⭐Ganesh | Malvika Nair|Arjun Janya| Shekhar, Dr.VNP");
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("(//div[@class='style-scope ytd-video-renderer']/div/div/div//a)[1]")).click();
		Thread.sleep(7000);
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\kiran\\Downloads\\Sample\\Youtube.jpg"));
	}

}
