package Xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Blueetooth");
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		//String res=driver.findElement(By.xpath("//span[text()='amazon basics True Wireless in-Ear Earbuds with Mic, Touch Control, IPX5 Water-Resistance, Bluetooth 5.3, Up to 55 Hours Play Time, Voice Assistance and Fast Charging (Blue)']")).getText();
		//System.out.println(res);
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		//driver.findElement(By.xpath("//input[contains(@placeholder,'S')]")).sendKeys("Puma");
		//driver.findElement(By.xpath("//input[contains(@id,'ton')]")).click();



	}

}
