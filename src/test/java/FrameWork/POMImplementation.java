package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.LoginPage;

public class POMImplementation {
    //*avoid hard coding of Locators/Elements/Objects
	//*create a seperate java class (POM class to store all the WebElements )
	//* driver.findElement method should be avoided in test scripts
	//*POM classes should be create ----> number of pages ==no.of POM classes
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
FileInputStream fis=new FileInputStream("C:\\Users\\kiran\\Downloads\\Commondata.properties.txt");


	// step2:- load all the keys present in properties file
	Properties pro = new Properties();
	pro.load(fis);

	String URL = pro.getProperty("url");
	String USERNAME = pro.getProperty("username");
	String PASSWORD = pro.getProperty("password");

	driver.get(URL);
//	driver.findElement(By.id("user-name")).sendKeys(USERNAME);
//	driver.findElement(By.id("password")).sendKeys(PASSWORD);
//	driver.findElement(By.id("login-button")).click();

	//implementated using Getter method
//	LoginPage login = new LoginPage(driver);
//	login.getUserTextField().sendKeys(USERNAME);
//	login.getPasswordTextField().sendKeys(PASSWORD);
//	login.getLoginButton().click();

	//implementated using Business Logic
	LoginPage login = new LoginPage(driver);
	login.loginToApplication(USERNAME, PASSWORD);
	
}

}