package PopUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsernative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeOptions opt=new ChromeOptions();
opt.addArguments("--incognito");
WebDriver driver=new ChromeDriver(opt);
driver.get("https://www.flipkart.com/");
	}

}
