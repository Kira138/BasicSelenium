package PracticeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//driver.navigate().to("https://www.amazon.in"); //alternate method to launch application but this is not used much
//as it doesn't wait for elements to get loaded in GUI
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		//driver.close(); close the current driver where webdriver is operating
		//driver.quit(); close entire browser
	}

}
