package Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/kiran/OneDrive/Desktop/Checkbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[position()=2]|(//input[@type='checkbox'])[position()=3]")).click();
		//(//input[@type='checkbox'])[position()mod2=0]--mod=%
		//input[@type='checkbox'])[last()]--last checkbox selected
	}

}
