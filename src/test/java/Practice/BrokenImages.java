package Practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		List<WebElement> images = driver.findElements(By.tagName("img"));

        for (WebElement img : images) {
            /*if (img.isDisplayed()) {
                System.out.println("Image is displayed: " + img.getAttribute("src"));
            } else {
                System.out.println("Broken image found: " + img.getAttribute("src"));*/
            }
	{
		

        for (WebElement img : images) {
            String imgUrl = img.getAttribute("src");
            try {
                // Create a URL object
                URL url = new URL(imgUrl);
                // Open a connection to the URL
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("HEAD");
                httpURLConnection.connect();

                // Get the response code
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    System.out.println("Broken image found: " + imgUrl + " - Response Code: " + responseCode);
                } else {
                    System.out.println("Valid image: " + imgUrl);
                }
            } catch (Exception e) {
                System.out.println("Exception for URL: " + imgUrl + " - " + e.getMessage());
            }
        }
        
			

	}
	}
}
