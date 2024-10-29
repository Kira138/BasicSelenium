package CaptchaPractice;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class IRCTCCAPTCHA {

    public static void main(String[] args) throws Throwable {
        // Set up Chrome options to disable notifications
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);

        // Open IRCTC website
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(8000);

        // Click on the LOGIN button
        driver.findElement(By.xpath("//a[text()=' LOGIN ']")).click();
        Thread.sleep(8000);

        // Capture captcha screenshot
        WebElement captcha = driver.findElement(By.xpath("//img[@class='captcha-img']"));
        File src = captcha.getScreenshotAs(OutputType.FILE);
        File dest = new File("./CaptchaScreenShot.png");
        FileUtils.copyFile(src, dest);

        // Set up Tesseract OCR
       Tesseract tss = new Tesseract();
        tss.setDatapath("C:\\Users\\kiran\\Downloads\\Tess4J-3.4.8-src\\Tess4J\\tessdata");  // Ensure this points to the tessdata folder, not a zip file

        // Perform OCR on the screenshot
        String st = tss.doOCR(dest);
        String img = st.replaceAll(" ", "");
        System.out.println("Captcha Text: " + img);

        // Enter the captcha text in the input field
        driver.findElement(By.xpath("//input[@id='captcha']")).sendKeys(img);
    }
}
