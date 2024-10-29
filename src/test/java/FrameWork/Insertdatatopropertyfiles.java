package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insertdatatopropertyfiles {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("C:\\Users\\kiran\\Downloads\\Commondata.properties.txt"); //read mode
		Properties pro = new Properties();
		pro.setProperty("url", "https://www.saucedemo.com/v1/"); //insert data(set)
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\kiran\\Downloads\\Commondata.properties.txt"); //write mode
		pro.store(fos, "CommonData");
		
	}

}
