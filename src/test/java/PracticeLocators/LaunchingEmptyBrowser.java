package PracticeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//empty browser
		//old method becoz they keep changing browser version
/*String key = "webdriver.chrome.driver";
String value="./src/main/resources/chromedriver.exe";
System.setProperty(key,value);
WebDriver driver=new ChromeDriver();*/
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(); //webdriver is an interface
		//WebDriver driver=new EdgeDriver();

	}

}
