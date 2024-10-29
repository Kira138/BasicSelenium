package AdvanceScenarios;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Capture screenshot as File
        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //downcasting

        // Define the destination path to save the screenshot
        String filePath = "C:\\Program Files\\Doc"; // Update with your desired path

        try {
            // Save the screenshot to the specified location
            FileUtils.copyFile(file, new File(filePath));
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }

        // Capture screenshot as BASE64
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

        // Print BASE64 (if needed)
        System.out.println("BASE64 Screenshot: " + screenshotBase64);

	}

}
