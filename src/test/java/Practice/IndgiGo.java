package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndgiGo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 WebElement radioButton = driver.findElement(By.xpath("//div[text()='one way']"));
	        radioButton.click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")).click();
	        driver.findElement(By.xpath("//div[text()='International']")).click();
	        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div[9]")).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']/div[9]")).click();
	        driver.findElement(By.xpath("//div[@data-testid='undefined-month-August-2024']/div[3]/div[3]/div[4]")).click();
	        driver.findElement(By.xpath("//div[text()='Passengers']")).click();
	        driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']/div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1x0uki6']/div[@class='css-1dbjc4n r-1awozwy r-18u37iz']/div[@data-testid='Adult-testID-plus-one-cta']")).click();
	        //WebElement dropdown = driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]"));
	        //Actions actions = new Actions(driver);
	        //actions.moveToElement(dropdown).click().sendKeys(Keys.DOWN).perform();
	        //driver.findElement(By.xpath("//div[text()='Done']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[text()='Currency']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[text()='INR']")).click();
	        //Thread.sleep(3000);
	        //driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();
	        Thread.sleep(8000);
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	        WebElement searchFlightButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-testid='home-page-flight-cta']")));
	        searchFlightButton.click();
	        Thread.sleep(9000);
	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(80));
	        WebElement result = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-testid='spicemax-flight-select-radio-button-2'])[1]")));
	        result.click();
	        Thread.sleep(9000);
	        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(80));
	        WebElement continuebutton = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@data-testid='continue-search-page-cta'])[1]")));
	        continuebutton.click();
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(80));
	        WebElement name = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-testid='first-inputbox-contact-details']")));
	        name.sendKeys("Rama");
	        driver.findElement(By.xpath("//input[@data-testid='last-inputbox-contact-details']")).sendKeys("rao");
	        driver.findElement(By.xpath("//input[@data-testid='contact-number-input-box']")).sendKeys("8904093548");
	        driver.findElement(By.xpath("//input[@data-testid='emailAddress-inputbox-contact-details']")).sendKeys("ramarao@gmail.com");
	        driver.findElement(By.xpath("//input[@data-testid='city-inputbox-contact-details']")).sendKeys("Kochi");
	        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-zso239'])[2]")).click();
	        driver.findElement(By.xpath("//input[@data-testid='traveller-0-first-traveller-info-input-box']")).sendKeys("Raj");
	        driver.findElement(By.xpath("//input[@data-testid='traveller-0-last-traveller-info-input-box']")).sendKeys("RR");
	        driver.findElement(By.xpath("//input[@data-testid='sc-member-mobile-number-input-box']")).sendKeys("8904093548");
	        driver.findElement(By.xpath("//input[@data-testid='traveller-0-date-of-birth-field']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//div[text()='1995']")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div[@class='css-1dbjc4n r-1loqt21 r-12zupyf r-1otgn73'])[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1w6e6rj r-qylwcf']/div[@class='css-1dbjc4n r-1loqt21 r-1otgn73'])[1]")).click();





	        //driver.quit();

	}

}
