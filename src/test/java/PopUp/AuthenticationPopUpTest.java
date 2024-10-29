package PopUp;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class AuthenticationPopUpTest {

	
	@Test
	public void authenticationPopUpTest() throws InterruptedException {

         WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://the-internet.herokuapp.com/basic_auth");

		     //      https://username:password@url   (merge url+username&password)
	Thread.sleep(5000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//Syntax Breakdown:
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
			//admin:admin is the username and password, respectively.
			//@ separates the credentials from the URL.
			//https://the-internet.herokuapp.com/basic_auth is the actual URL of the page.
	}

}
