package com.tech.steps;

import org.junit.Assert;

import com.tech.utils.CommonMethods;
import com.tech.utils.ConfisReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods { // multilevel inheritance

	// the following methods have been copied from jUnit console when TestRunner.java was run with cucumber
	@When("user enters valid username")
	public void user_enters_valid_username() {
		sendText(loginPage.userName, ConfisReader.getProperty("username"));
	}

	@When("user enters valid password")
	public void user_enters_valid_password() {
		sendText(loginPage.password, ConfisReader.getProperty("password"));
	}

	@When("click on login button")
	public void click_on_login_button() {
		click(loginPage.loginBtn);
		wait(2);
	}

	@Then("I validate that user is logged in")
	public void i_validate_that_user_is_logged_in() {
		Assert.assertTrue(mainPage.appLogo.isDisplayed());
	}

	@When("user leaves password empty")
	public void user_leaves_password_empty() {
		sendText(loginPage.password, "");
	}

	@Then("I validate that {string} message is displayed")
	public void i_validate_that_message_is_displayed(String expectedMsg) {
		String actualMsg = loginPage.errorMsg.getText();
		Assert.assertEquals("The welcome message is different!!!", expectedMsg, actualMsg);
	}

	@When("user enters invalid username as {string}")
	public void user_enters_invalid_username_as(String username) {
		sendText(loginPage.userName, username);
	}

	@When("user enters invalid password as {string}")
	public void user_enters_invalid_password_as(String password) {
		sendText(loginPage.password, password);
	}

}
