package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.manage().window().setSize(new Dimension(1552, 840));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anita");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Rao");
		driver.findElement(By.xpath("//input[@id='sex-1']")).click();
		driver.findElement(By.xpath("//span[@class='ezmob-footer-close']")).click();
		driver.findElement(By.xpath("//div[@class='control-group']/input[@value='4']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("08-08-2024");
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		driver.findElement(By.xpath("//input[@id='tool-2']")).click();
		driver.findElement(By.id("continents")).click();
        WebElement dropdown = driver.findElement(By.id("continents"));
        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();
        WebElement dropdown1 = driver.findElement(By.id("selenium_commands"));
        dropdown.findElement(By.xpath("//option[. = 'WebElement Commands']")).click();
        //scroll vertical
    	JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,675.5555419921875)");
        dropdown.findElement(By.xpath("//option[. = 'WebElement Commands']")).click();
        WebElement fileInput= driver.findElement(By.xpath("//input[@class='input-file']"));
        String filePath = "C:\\Program Files\\Doc";
        fileInput.sendKeys(filePath);
        driver.findElement(By.xpath("//a[text()='Click here to Download File']")).click();








	}

}
