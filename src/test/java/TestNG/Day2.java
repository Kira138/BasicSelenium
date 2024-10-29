package TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day2 {
	@Parameters({"URL"})
@Test
public void ploan(String urlname)
{
	System.out.println("Good");
	System.out.println(urlname);
}
@AfterSuite
public void afterSuite() {
    System.out.println("AfterSuite: Executing after the entire test suite");
}
}
