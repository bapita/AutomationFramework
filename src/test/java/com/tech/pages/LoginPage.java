package com.tech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.testbase.BaseClass;

public class LoginPage extends BaseClass {
	// this page is responsible to find the elements of the login page

	@FindBy(id = "user-name")
	public WebElement userName;

	@FindBy(id = "password")
	public WebElement password;

	@FindBy(xpath = "//input [@value='LOGIN']")
	public WebElement loginBtn;

	@FindBy(xpath = "//h3 [@data-test='error']")
	public WebElement errorMsg;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
}
