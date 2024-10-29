package PracticeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launching empty browser
WebDriver driver=new ChromeDriver();
//launching an application
driver.get("https://www.amazon.in");  //13 methods present in webdriver
String title=driver.getTitle(); //fetching title of the page
System.out.println(title);
String url=driver.getCurrentUrl(); //fetching url of the page
System.out.println(url);
//String pagesource=driver.getPageSource();
//System.out.println(pagesource);  //fetching pagesource
driver.manage().window().maximize(); //method calling another method is called method chaining
driver.manage().window().minimize(); //method 5.manage()



	}

}
