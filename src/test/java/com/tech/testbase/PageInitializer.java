package com.tech.testbase;

import com.tech.pages.Cart;
import com.tech.pages.CheckoutStepOne;
import com.tech.pages.CheckoutStepTwo;
import com.tech.pages.InventoryItemPage;
import com.tech.pages.LoginPage;
import com.tech.pages.MainPage;

public class PageInitializer extends BaseClass {

	public static LoginPage loginPage;
	public static MainPage mainPage;
	
	public static Cart cart;
	public static InventoryItemPage inventoryItemPage;
	public static CheckoutStepOne checkoutStepOne;
	public static CheckoutStepTwo checkoutStepTwo;
	
	public static void initialize() {
		// initialize all the pages of the application here
		loginPage = new LoginPage();
		mainPage = new MainPage();
		cart = new Cart();
		inventoryItemPage = new InventoryItemPage();
		checkoutStepOne = new CheckoutStepOne();
		checkoutStepTwo = new CheckoutStepTwo();
		
		
		
	}

}
