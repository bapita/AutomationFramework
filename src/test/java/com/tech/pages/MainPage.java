package com.tech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.testbase.BaseClass;

public class MainPage {
	// this page is responsible to find the elements of the home page
	
	@FindBy(xpath = "//div[@class='app_logo']")
	public WebElement appLogo;
	
	@FindBy(xpath = "//div[@class = 'inventory_item_name']")
	public List<WebElement> itemList; // storing all the inventory elements in a list instead of storing one by one
	

	public MainPage() {
		PageFactory.initElements(BaseClass.driver, this);
	}


}
