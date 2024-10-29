package Practice;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("firstname")).sendKeys("Radha");
		driver.findElement(By.name("lastname")).sendKeys("Rao");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kiran.jayaprakash6@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("MangoApple@24&");
		WebElement daylist =driver.findElement(By.id("day"));
		Select selectday=new Select(daylist);
		selectday.selectByIndex(7);
		WebElement monthlist =driver.findElement(By.id("month"));
		Select selectmonth=new Select(monthlist);
		selectmonth.selectByIndex(11);
		WebElement yearlist =driver.findElement(By.id("year"));
		Select selectyear=new Select(yearlist);
		selectyear.selectByVisibleText("1995");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='Continue']")));
		continueButton.click();
		  
        }
    }
