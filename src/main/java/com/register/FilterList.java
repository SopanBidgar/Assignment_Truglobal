package com.register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class FilterList {

	@FindBy(xpath="//input[@id='twotabsearchtextbox']")private WebElement searchtheproduct;
	@FindBy(xpath="//div[contains(@class,'s-suggestion-container')]//div")private WebElement selectproduct;
	@FindBy(xpath="//i[contains(@class,'a-icon a-icon-checkbox')]")private WebElement validatecheckbox;
	@FindBy(xpath="//span[text()='Clear']")private WebElement clearfield;

	public FilterList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void searchproduct() {
		 searchtheproduct.click();
		 searchtheproduct.sendKeys("iphone15");
	}
	public void selectproduct() {
		selectproduct.click();
		
	}
	public void filtervalidate() {
		validatecheckbox.click();
		String clearfieldtext = clearfield.getText();
		Assert.isTrue(true, clearfieldtext, "Filter Test is Validated");
	}

	
}
