package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]")).click();
		WebElement checkbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));  // Replace with the actual ID

        // Check if the checkbox is selected
        if (checkbox.isSelected()) {
            System.out.println("Checkbox is checked.");
        } else {
            System.out.println("Checkbox is not checked.");
        }

        // Optionally, you can check/uncheck the checkbox based on its current state
        if (!checkbox.isSelected()) {
            checkbox.click();  // This will check the checkbox if it's not already checked
        }
	}

}
