package com.tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.testbase.BaseClass;

public class CheckoutStepOne extends BaseClass {
	
	@FindBy(id = "first-name")
	public WebElement fname;
	
	@FindBy(id = "last-name")
	public WebElement lname;
	
	@FindBy(id = "postal-code")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@value='CONTINUE']")
	public WebElement continueBtn;
	
	
	public CheckoutStepOne()
	{
		PageFactory.initElements(driver, this);
	}

}
