package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[text()='click']")).click();
		Set<String> allIds = driver.getWindowHandles();//win1,win2 --one print

		    for (String Id:allIds)
		    {
				driver.switchTo().window(Id);
				String title = driver.getTitle();
				System.out.println(title);
				
				if(title.contains("Selenium"))
				{
					break;
				}
			}
		    driver.findElement(By.linkText("Register now!")).click();
		    Set<String> allIds1 = driver.getWindowHandles(); //second print
		    for (String Id1:allIds1)
		    {
				driver.switchTo().window(Id1);
				String title1 = driver.getTitle();
				System.out.println(title1);
				
				if(title1.contains("\r\n"+ "Appium Conf 2024 - Conference Registration | ConfEngine - Conference Platform\r\n"+ ""))
				{
					break;
				}
			}
		    driver.findElement(By.xpath("//span[text()='Appium Conf 2024 Pass']")).click();
		    driver.close();//close current window where driver is present
		    //driver.quit();//all the tabs including browser window
		    //if i want to close second tab,switch to second tab and close. write code for that.
	}

}