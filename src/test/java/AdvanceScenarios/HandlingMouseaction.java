package AdvanceScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        //driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		//WebElement ele=driver.findElement(By.linkText("Today's Deals"));
		//Actions act=new Actions(driver);
		//act.moveToElement(ele).perform();

		//WebElement link=driver.findElement(By.linkText("Mobiles"));
		//Actions act=new Actions(driver);
		//act.moveToElement(link).perform();

		//driver.get("https://www.saucedemo.com/v1/");
		//WebElement USERNAME=driver.findElement(By.name("user-name"));
		//WebElement PASSWORD=driver.findElement(By.name("password"));
		//WebElement login=driver.findElement(By.className("btn_action"));

		//Actions act=new Actions(driver);
		//act.sendKeys(USERNAME,"standard_user").perform();
		//act.sendKeys(PASSWORD,"secret-sauce").perform();
		//act.click(login).perform();

		//or
		//act.sendKeys(USERNAME,"standard_user").sendKeys(PASSWORD,"secret-sauce").click(login).build().perform();


		//driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		//WebElement drag=driver.findElement(By.id("draggable"));
		//WebElement drop=driver.findElement(By.id("droppable"));
		//Actions act=new Actions(driver);
		//act.clickAndHold(drag).release(drop).perform();
		//or
		//act.dragAndDrop(drag, drop).perform();


		//driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
		//WebElement ele=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		//Actions act=new Actions(driver);
		//act.doubleClick(ele).perform();

		//to close pop up bt not all
		driver.get("https://www.makemytrip.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
	}

}
