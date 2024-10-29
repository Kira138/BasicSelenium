package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		/*WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));//sendKeys=webelement method
        METHOD1: click();
        //driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();//click=webelement method.we cant csll multiple webelement method
		METHOD2: sendKeys();
		//search.sendKeys("puma");
		METHOD3-submit()
		//search.submit();
		METHOD4-clear()
		//search.clear();
		WebElement ele=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		METHOD5-getLocation()
		//System.out.println(ele.getLocation().getX()); 
		//System.out.println(ele.getLocation().getY());
		 *METHOD6 getSize()
		//System.out.println(ele.getSize().getHeight());
		//System.out.println(ele.getSize().getWidth());
		 *METHOD7 getRect()
		System.out.println(ele.getRect().getX());
		System.out.println(ele.getRect().getY());
		System.out.println(ele.getRect().getHeight());
		System.out.println(ele.getRect().getWidth());*/
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		
		METHOD8 isDisplayed()
		if(logo.isDisplayed()) { 
			System.out.println("Facebook name is displayed");
		}
			else
			{
				System.out.println("Facebook name is not displayed");
			}
		WebElement link=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		
		METHOD9 isEnabled()
		if(link.isEnabled()) { 
			link.click();
		}
			else
			{
				System.out.println("Element is not enabled");
			}
		Thread.sleep(2000);
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='1']"));
		radiobutton.click();
		
		METHOD10 isSelected()
		if(radiobutton.isSelected()) { 
			System.out.println("Radiobutton is selected");
			radiobutton.click();
		}
			else
			{
				System.out.println("Radiobutton is not selected");
			}*/
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		/*WebElement search=driver.findElement(By.name("field-keywords"));
		METHOD11 getTagName()
		System.out.println(search.getTagName()); 
		WebElement ele=driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(ele.getTagName());
		METHOD12 getAttribute()
		System.out.println(search.getAttribute("id")); 
		System.out.println(ele.getAttribute("href"));
		METHOD13 getDomAttribute()
		System.out.println(search.getDomAttribute("class")); 
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));//amazon logo
		METHOD14 getDomProperty()
		System.out.println(logo.getDomProperty("namespaceURI")); //check under properties*/
		 //METHOD15 getAriaRole()
		/*WebElement searchbar=driver.findElement(By.name("field-keywords")); //field type
		System.out.println(searchbar.getAriaRole());
		WebElement ele=driver.findElement(By.linkText("Amazon miniTV"));
		System.out.println(ele.getAriaRole());
		System.out.println(searchbar.getAccessibleName());
		WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		 METHOD16 getAccessibleName()
		System.out.println(logo.getAccessibleName());
		WebElement link=driver.findElement(By.cssSelector("[data-csa-c-content-id=/'nav_cs_bestsellers'/]"));
		System.out.println(link.getAccessibleName());*/
		//driver.get("https://demowebshop.tricentis.com/");
		//WebElement color=driver.findElement(By.linkText("Log in")); //checking for login link
		 //METHOD17 getCssValue()
		//System.out.println(color.getCssValue("color")); //https://www.rgbtohex.net/
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("Nike");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		 //METHOD18 getText()
		String name=driver.findElement(By.xpath("//span[text()='Mens Revolution 6 Nn 4e Running Shoes']")).getText(); 
		System.out.println(name);
		//difference between webelement(18) method and webdriver(13) method


		}

	}


