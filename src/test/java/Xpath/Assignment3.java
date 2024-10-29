package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.prokabaddi.com/standings");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement>Teams=driver.findElements(By.xpath("//div[@class='table-data points']/../..//p[@class='name']"));
        List<WebElement>Points=driver.findElements(By.xpath("//p[@class='name']/../../../../../..//div[@class='table-data points']"));


   for (int i=0;i<Teams.size();i++) {
       System.out.println(Teams.get(i).getText()+"----"+Points.get(i).getText());


           }
    }
}
