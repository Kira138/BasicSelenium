package Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/"); //1. Open this URL  https://www.amazon.in/
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("(//input[@name='name'])[1]")).sendKeys("Savitha");
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("kiran.jayaprakash6@gmail.com");
		driver.findElement(By.cssSelector("[id='exampleInputPassword1']")).sendKeys("AppleMango@91");
		driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//div[@class='form-group']//select//option[text()='Female']")).click();
		driver.findElement(By.xpath("//label[text()='Employed']")).click();
		driver.findElement(By.cssSelector("[name='bday']")).sendKeys("12-08-1991");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
        // Validate that the name field was auto-populated
		//WebElement name = driver.findElement(By.xpath("(//input[@name='name'])[1]"));
        //WebElement Twoway = driver.findElement(By.xpath("(//input[@name='name'])[2]"));
     // Compare text content
        //String nameText = name.getAttribute("value");
        //String TwowayText = Twoway.getAttribute("value");
     // Using JUnit assertion for validation
       //Assert.assertEquals("Auto-populated name does not match", nameText, TwowayText);
       WebElement success=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		System.out.println(success.getText());

	}

}
