
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.register.FilterList;
import com.register.Utilityclass;

import www.amazon.com.SearchProduct;
import www.amazon.com.SelectAndAddToCartProduct;

public class TestAmazon {

	@BeforeTest
	public void OpenBrowser(WebDriver driver) {
		Utilityclass utility = new Utilityclass();
		utility.initialiseBrowser(driver);

	}

	@BeforeMethod
	public void SearchProduct(WebDriver driver) {

		SearchProduct search = new SearchProduct(driver);
		search.searchproduct();
		search.selectproduct();
	}

	@Test(priority = 3)
	public void AddToCart(WebDriver driver) {

		SelectAndAddToCartProduct select = new SelectAndAddToCartProduct(driver);
		select.clicktheproduct();
		select.addtothecart();
		select.PrintPrizeOfProduct();
	}

	@Test(priority = 4)
	public void FilterList(WebDriver driver) {
		FilterList search = new FilterList(driver);
		search.searchproduct();
		search.selectproduct();
		search.filtervalidate();
	}

}
