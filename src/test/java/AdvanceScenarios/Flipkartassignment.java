package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartassignment {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement dropdownSymbol = driver.findElement(By.xpath("//a[@data-nav-ref='nav_ya_signin']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdownSymbol).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]")).click();
		Thread.sleep(2000);
		WebElement Email=driver.findElement(By.xpath("// input[@class='a-input-text a-span12 auth-autofocus auth-required-field auth-require-claim-validation']"));
		Email.sendKeys("kiran.jayaprakash6@gmail.com",Keys.TAB);
		WebElement message=driver.findElement(By.xpath("( //span[@class='a-list-item'])[1]"));
		System.out.print(message.getText());
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.cssSelector("input#ap_customer_name")).sendKeys("Kiran Jay");
		driver.findElement(By.xpath("//Span[@class='a-button a-button-dropdown']")).click();
		driver.findElement(By.cssSelector("a#auth-country-picker_216")).click();
		driver.findElement(By.cssSelector("input#ap_phone_number")).sendKeys("206-476-4258");
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("MangoApple@24");
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative auth-continue-create-account-action']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#auth-pv-enter-code")).sendKeys("522639");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-button a-spacing-medium a-button-span12 a-button-primary auth-disable-button-on-submit']")).click();
		
		
		
		
		
	}

}
