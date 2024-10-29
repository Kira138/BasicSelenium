package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshotexample {
@Test
	public void screenshot() throws Throwable 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
TakesScreenshot ts=(TakesScreenshot)driver; //downcasting
File src=ts.getScreenshotAs(OutputType.FILE);
File dest = new File("./ScreenShotFailedScript.png");
FileUtils.copyFile(src, dest);
//refresh the project, and check under test-output folder for screenshot
	}

}
