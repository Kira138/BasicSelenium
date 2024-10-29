package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipleframepopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		 //Approach 1-----------Switching frames using index------>Index value starts from 0
	driver.get("https://demo.automationtesting.in/Frames.html");
	//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
	//Approach 2-------------Switching frames using id or name attribute
	//driver.switchTo().frame("singleframe"); //using id
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
	    //driver.switchTo().frame("SingleFrame"); //using name
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
		//Approach 3-----------Switching frames using WebElement
		
		WebElement frame = driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");
	}

}
