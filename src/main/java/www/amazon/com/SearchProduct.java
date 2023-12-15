package www.amazon.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchProduct{
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtheproduct;
	@FindBy(xpath="//div[text()='iphone']/..//div")private WebElement selectproduct;
	@FindBy(xpath="//div[@class='a-section a-spacing-none']/..//img[1]")private WebElement clickproduct;	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchproduct;
	@FindBy(xpath="//input[@title='Add to Shopping Cart'][1]")private WebElement addtocart;

	public SearchProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchproduct() {
		 searchtheproduct.click();
		 searchtheproduct.sendKeys("iphone");
	}
	public void selectproduct() {
		selectproduct.click();;
	
	}
	
	
	
}