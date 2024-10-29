package PracticeLocators;
//linktext
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//launching an application
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Best Sellers")).click();
		driver.findElement(By.partialLinkText("Best")).click();
	}

}
