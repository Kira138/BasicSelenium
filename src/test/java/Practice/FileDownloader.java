package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownloader {

    public static void main(String[] args) {
        // Set up WebDriver (ensure the ChromeDriver executable is in your PATH)
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/download");

        List<WebElement>allLink=driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement link:allLink) {
			//System.out.println(link.getText());//fetches visible text of link
			System.out.println(link.getAttribute("href"));//fetches href attribute
            count++;
		}
		if (!allLink.isEmpty()) {
            // Get the first link
            WebElement firstLink = allLink.get(2);
            
            // Print the href attribute of the first link
            System.out.println("Clicking on the third link: " + firstLink.getAttribute("href"));
            
            // Wait for the first link to be clickable
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement clickableLink = wait.until(ExpectedConditions.elementToBeClickable(firstLink));
            
            // Click the first link
            clickableLink.click();
   
		System.out.println("total number of links---"+count); //that particular link doesn't contain href so we get null in console
	}
    }
}
