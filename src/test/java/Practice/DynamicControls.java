package Practice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        // Click the checkbox and remove it
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']")).click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        
        // Wait for the 'Add' button to be clickable and click it
        WebElement add = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='swapCheckbox()']")));
        add.click();
        
        // Wait for the checkbox to reappear and click it
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
        checkbox.click();
        
        // Wait for the 'Remove' button to be clickable and click it
        WebElement remove = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='swapCheckbox()']")));
        remove.click();
        
        // Wait for the 'Enable' button to be clickable and click it
        WebElement enable = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='swapInput()']")));
        enable.click();
        
        // Wait for the text input to be enabled and interactable, then send keys
        WebElement text = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
        text.sendKeys("Test");
        
        // Disable the input field again
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click();

        // Close the driver
        //driver.quit();
    }
}
