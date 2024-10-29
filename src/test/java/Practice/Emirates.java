package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Emirates {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.emirates.com/us/english/skywards/registration/?refurl=%2Fus%2Fenglish%2Fbook%2F%3Fgad_source%3D1%26amp%3Bgclid%3DCj0KCQjww5u2BhDeARIsALBuLnN8N_tfMlzEhU9EXPOfkcrrCA3nyf_SpGjGSzxWUiGMu_pJvDadLy8aAmHtEALw_wcB%26amp%3Bgclsrc%3Daw.ds&_gl=1*199n9as*_gcl_aw*R0NMLjE3MjQzNzM1OTEuQ2owS0NRand3NXUyQmhEZUFSSXNBTEJ1TG5OOE5fdGZNbHpFaFU5RVhQT2ZrY3JyQ0EzbnlmX1NwR2pHU3p4V1VpR011X3BKdkRhZEx5OGFBbUh0RUFMd193Y0I.*_gcl_dc*R0NMLjE3MjQzNzM1OTEuQ2owS0NRand3NXUyQmhEZUFSSXNBTEJ1TG5OOE5fdGZNbHpFaFU5RVhQT2ZrY3JyQ0EzbnlmX1NwR2pHU3p4V1VpR011X3BKdkRhZEx5OGFBbUh0RUFMd193Y0I.*_gcl_au*OTA3MzQ4NTE0LjE3MjQzNzM1NjU.*_ga*MzI3MTg1Mjc4LjE3MjQzNzM1NjY.*_ga_N8M46M8KE9*MTcyNDM3MzU2NS4xLjEuMTcyNDM3MzU4OS4zNi4wLjA.");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("//input[@aria-describedby='title_aria-described-by']")).click();
		
	}

}
