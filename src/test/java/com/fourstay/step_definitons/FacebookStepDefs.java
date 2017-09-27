package com.fourstay.step_definitons;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.fourstay.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FacebookStepDefs {

	@Given("^User at the home page$")
	public void user_at_the_home_page() throws Throwable {
		Driver.getInstance().get("https://www.facebook.com");

	}

	@Then("^User verifyes title$")
	public void user_verifyes_title() throws Throwable {
		Assert.assertEquals("Facebook - Log In or Sign Up", Driver.getInstance().getTitle());

	}

}
