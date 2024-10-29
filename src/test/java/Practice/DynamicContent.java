package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_content?with_content=static");
        
		// Scenario 1: Verify Content Changes on Page Refresh
        verifyContentChangesOnRefresh(driver);

        // Scenario 2: Verify Static Content with URL Parameter
        verifyStaticContent(driver);

        // Scenario 3: Verify Image Loading
        verifyImageLoading(driver);

        // Scenario 4: Verify Text Content
        verifyTextContent(driver);

        // Scenario 5: Verify Number of Content Blocks
        verifyNumberOfContentBlocks(driver);

        // Scenario 6: Verify Broken Images
        verifyBrokenImages(driver);

        // Scenario 7: Verify Text Formatting
        verifyTextFormatting(driver);

        // Scenario 8: Verify Image and Text Pairing
        verifyImageAndTextPairing(driver);

        // Scenario 9: Verify Page Load Time
        verifyPageLoadTime(driver);

        driver.quit();
    }

    public static void verifyContentChangesOnRefresh(WebDriver driver) {
        String initialContent = driver.findElement(By.cssSelector("#content")).getText();
        driver.navigate().refresh();
        String refreshedContent = driver.findElement(By.cssSelector("#content")).getText();

        if (!initialContent.equals(refreshedContent)) {
            System.out.println("Scenario 1: Content changes on page refresh - Passed");
        } else {
            System.out.println("Scenario 1: Content changes on page refresh - Failed");
        }
    }

    public static void verifyStaticContent(WebDriver driver) {
        String initialContent = driver.findElement(By.cssSelector("#content")).getText();
        driver.navigate().refresh();
        String refreshedContent = driver.findElement(By.cssSelector("#content")).getText();

        if (initialContent.equals(refreshedContent)) {
            System.out.println("Scenario 2: Static content with URL parameter - Passed");
        } else {
            System.out.println("Scenario 2: Static content with URL parameter - Failed");
        }
    }

    public static void verifyImageLoading(WebDriver driver) {
        List<WebElement> images = driver.findElements(By.cssSelector("#content img"));
        boolean allImagesLoaded = true;

        for (WebElement image : images) {
            if (!image.isDisplayed() || image.getAttribute("naturalWidth").equals("0")) {
                allImagesLoaded = false;
                break;
            }
        }

        if (allImagesLoaded) {
            System.out.println("Scenario 3: All images are loading correctly - Passed");
        } else {
            System.out.println("Scenario 3: All images are loading correctly - Failed");
        }
    }

    public static void verifyTextContent(WebDriver driver) {
        List<WebElement> textBlocks = driver.findElements(By.cssSelector("#content .large-10"));
        boolean textPresent = true;

        for (WebElement text : textBlocks) {
            if (text.getText().isEmpty()) {
                textPresent = false;
                break;
            }
        }

        if (textPresent) {
            System.out.println("Scenario 4: Text content is present - Passed");
        } else {
            System.out.println("Scenario 4: Text content is present - Failed");
        }
    }

    public static void verifyNumberOfContentBlocks(WebDriver driver) {
        List<WebElement> contentBlocks = driver.findElements(By.cssSelector("#content .row"));
        int numberOfBlocks = contentBlocks.size();

        if (numberOfBlocks == 3) { // Assuming there are 3 content blocks
            System.out.println("Scenario 5: Number of content blocks is consistent - Passed");
        } else {
            System.out.println("Scenario 5: Number of content blocks is consistent - Failed");
        }
    }

    public static void verifyBrokenImages(WebDriver driver) {
        List<WebElement> images = driver.findElements(By.cssSelector("#content img"));
        boolean noBrokenImages = true;

        for (WebElement image : images) {
            if (!image.isDisplayed() || image.getAttribute("naturalWidth").equals("0")) {
                noBrokenImages = false;
                break;
            }
        }

        if (noBrokenImages) {
            System.out.println("Scenario 6: No broken images found - Passed");
        } else {
            System.out.println("Scenario 6: No broken images found - Failed");
        }
    }

    public static void verifyTextFormatting(WebDriver driver) {
        List<WebElement> textBlocks = driver.findElements(By.cssSelector("#content .large-10"));
        boolean correctFormatting = true;

        for (WebElement text : textBlocks) {
            String fontSize = text.getCssValue("font-size");
            String fontWeight = text.getCssValue("font-weight");
            if (!fontSize.equals("16px") || !fontWeight.equals("400")) { // Example values
                correctFormatting = false;
                break;
            }
        }

        if (correctFormatting) {
            System.out.println("Scenario 7: Text formatting is correct - Passed");
        } else {
            System.out.println("Scenario 7: Text formatting is correct - Failed");
        }
    }

    public static void verifyImageAndTextPairing(WebDriver driver) {
        List<WebElement> contentBlocks = driver.findElements(By.cssSelector("#content .row"));
        boolean correctPairing = true;

        for (WebElement block : contentBlocks) {
            WebElement image = block.findElement(By.tagName("img"));
            WebElement text = block.findElement(By.cssSelector(".large-10"));
            if (!image.isDisplayed() || text.getText().isEmpty()) {
                correctPairing = false;
                break;
            }
        }

        if (correctPairing) {
            System.out.println("Scenario 8: Image and text pairing is correct - Passed");
        } else {
            System.out.println("Scenario 8: Image and text pairing is correct - Failed");
        }
    }

    public static void verifyPageLoadTime(WebDriver driver) {
        long startTime = System.currentTimeMillis();
        driver.navigate().refresh();
        long endTime = System.currentTimeMillis();
        long loadTime = endTime - startTime;

        if (loadTime <= 2000) { // Example threshold of 2 seconds
            System.out.println("Scenario 9: Page load time is within acceptable limits - Passed");
        } else {
            System.out.println("Scenario 9: Page load time is within acceptable limits - Failed");
        }
    }
}
