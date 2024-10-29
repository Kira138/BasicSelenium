package FrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.LoginPage;
import objectRepo.SWAGLABS;

public class POMADDTOCART {

    public static void main(String[] args) throws IOException {
        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Load properties file
        FileInputStream fis = new FileInputStream("C:\\Users\\kiran\\Downloads\\Commondata.properties.txt");
        Properties pro = new Properties();
        pro.load(fis);

        // Get URL, username, and password from properties file
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        // Navigate to the application
        driver.get(url);

        // Perform login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.getUserTextField().sendKeys(username);
        loginPage.getPasswordTextField().sendKeys(password);
        loginPage.getLoginButton().click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

        // Add products to cart
        SWAGLABS swag = new SWAGLABS(driver);
        swag.getFirstProductAddtoCart().click();
        swag.getSecondProductAddtoCart().click();
        swag.getThirdProductAddtoCart().click();
        swag.getFourthProductAddtoCart().click();

        // Close the driver
        driver.quit();
    }
}
