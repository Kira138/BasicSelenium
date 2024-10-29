package AdvanceScenarios;
//syntax: //*[@attributename='attributevalue']
//SVG (Scalable Vector Graphics) is a web standard for describing two-dimensional vector graphics using XML. 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_SVGelement { //scalar vector graphics-older version to create images

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='A_8a-icon']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Dismiss']")).click();
	}

}
