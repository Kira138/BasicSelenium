package PracticeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.dream11.com/");
String url=driver.getCurrentUrl();
System.out.println(url);
String title=driver.getTitle();
System.out.println(title);
String src=driver.getPageSource();
System.out.println(src);
driver.navigate().back();
Thread.sleep(1000);
driver.navigate().forward();
Thread.sleep(1000);
driver.navigate().refresh();
driver.manage().window().minimize();
driver.close();
	}

}
