package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDatafromPropertiesFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Normal method
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");*/
		
		//step1:- set the path of the physical file
		FileInputStream fis=new FileInputStream("C:\\Users\\kiran\\Downloads\\Commondata.properties.txt");
		
		//Step2:-load all the keys present in the properties files
		Properties pro = new Properties();
		pro.load(fis);
		
		//step3:-Fetching data from properties_file
		String url=pro.getProperty("url");
		String USERNAME=pro.getProperty("username"); //reading the data (get)
		String PASSWORD=pro.getProperty("password");
		driver.get(url);
		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();
		
	}

}
