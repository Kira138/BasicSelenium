package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SWAGLABS {

	//initialization
			public SWAGLABS(WebDriver driver) //constructors are must to create object for the class
			{
				PageFactory.initElements(driver, this);
			}
			
		//Declaration
			@FindBy(xpath = "add-to-cart-sauce-labs-backpack")
			private WebElement FirstProductAddtoCart;
			
			@FindBy(xpath = "add-to-cart-sauce-labs-bike-light")
			private WebElement SecondProductAddtoCart;
			
			@FindBy(xpath = "add-to-cart-sauce-labs-bolt-t-shirt")
			private WebElement ThirdProductAddtoCart;
			
			@FindBy(xpath = "add-to-cart-sauce-labs-fleece-jacket")
			private WebElement FourthProductAddtoCart;
			
			
			//getter methods
			

			public WebElement getFirstProductAddtoCart() {
				return FirstProductAddtoCart;
			}


			public WebElement getSecondProductAddtoCart() {
				return SecondProductAddtoCart;
			}


			public WebElement getThirdProductAddtoCart() {
				return ThirdProductAddtoCart;
			}


			public WebElement getFourthProductAddtoCart() {
				return FourthProductAddtoCart;
			}
			
			//Business Logics'
			public void Addtocart()
			{
				FirstProductAddtoCart.click();
				SecondProductAddtoCart.click();
				ThirdProductAddtoCart.click();
				FourthProductAddtoCart.click();
				
			}


			
		



	}


