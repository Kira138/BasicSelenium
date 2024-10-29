package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		/*driver.get("https://www.saucedemo.com/v1/");

		//method1:-sendKeys()
		WebElement UserName = driver.findElement(http://By.name("user-name"));
		UserName.sendKeys("standard_user");

		//method2:-clear()
		Thread.sleep(2000);
		UserName.clear();

		UserName.sendKeys("standard_user");

		driver.findElement(http://By.name("password")).sendKeys("secret_sauce");

		//method3:-click()
		driver.findElement(http://By.id("login-button")).click();*/

	//	driver.get("https://www.amazon.in");

		//method4:-getCssValue()
	/*	WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
	//	System.out.println(ele.getCssValue("color"));

		WebElement eles = driver.findElement(http://By.id("nav-logo-sprites"));
		System.out.println(eles.getCssValue("color"));
		System.out.println(eles.getCssValue("font-size"));*/

		//method5:-getLocation()
	//	WebElement phone = driver.findElement(By.xpath("//a[text()='Mobiles']"));
	//	System.out.println(phone.getLocation().getX());
	//	System.out.println(phone.getLocation().getY());

		//method6:-getSize()
	//	 WebElement search = driver.findElement(http://By.name("field-keywords"));
	//	System.out.println(search.getSize().getHeight());
	//	System.out.println(search.getSize().getWidth());

		//method7:-getRect()
	/*	WebElement phone = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		System.out.println(phone.getRect().getX());
		System.out.println(phone.getRect().getY());
		System.out.println(phone.getRect().getHeight());
		System.out.println(phone.getRect().getWidth());*/

		//method8:-isDisplayed()
	/*	WebElement link = driver.findElement(By.linkText("Amazon miniTV"));

		if(link.isDisplayed())
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not Displayed");
		}*/

		//method9:-isEnabled()
	/*	WebElement search = driver.findElement(http://By.name("field-keywords"));

		if(search.isEnabled())
		{
			search.sendKeys("Nike");
		}
		else
		{
			System.out.println("Element is not Enabled");
		}*/


		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		//method10:-isSelected()
		//Thread.sleep(2000);
		 //WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
		//radio.click();
		//if(radio.isSelected())
		{
			System.out.println("radio button is selected");
		}
		//else
		{
			System.out.println("radio button not selected");
		}


	}
}
