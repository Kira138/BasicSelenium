package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingscrollbarusingjsexecutor {
//JS is interface
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html ");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<2;i++)
		{
			js.executeScript("window.scrollBy(0,500)");//(x-axis,y-axis)--for scroll down
			Thread.sleep(2000);
		}
		for(int i=0;i<2;i++)
		{
			js.executeScript("window.scrollBy(0,-500)");//(x-axis,y-axis)--for scroll up
			Thread.sleep(2000);
		}
		

	}

}
