package com.tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.testbase.BaseClass;

public class CheckoutStepTwo extends BaseClass {
	@FindBy(xpath="//div[@class = 'inventory_item_name']")
	public WebElement itemName;
	
	
	public CheckoutStepTwo()
	{
		PageFactory.initElements(driver, this);
	}
}
