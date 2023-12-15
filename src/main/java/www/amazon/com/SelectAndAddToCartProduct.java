package www.amazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAndAddToCartProduct {
	
	@FindBy(xpath = "//span[contains(text(),'SUPCASE UBMag XT for iPhone 15 Pro Max Case 6.7\" wi')]")
	private WebElement clickproduct;
	@FindBy(xpath = "//span[text()=' Add to Cart ']")
	private WebElement addcart;
	@FindBy(xpath = "//span[text()='Total price:']/following-sibling::span")
	private WebElement PrintPrize;
	
	public SelectAndAddToCartProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clicktheproduct() {
		clickproduct.click();;
	
	}
	public void addtothecart() {
		addcart.click();;
	
	}
	public void PrintPrizeOfProduct() {
		String price = PrintPrize.getText();
	    System.out.println(price);
	}
	
}
