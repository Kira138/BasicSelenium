package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method14getDomProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));//amazon logo
		System.out.println(logo.getDomProperty("namespaceURI")); //check under properties*/
	}

}
