package com.fourstay.step_definitons;

import com.fourstay.pages.HomePage;
import com.fourstay.utilities.BrowserUtility;
import com.fourstay.utilities.ConfigurationReader;
import com.fourstay.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UserStepDefs {
	HomePage homePage = new HomePage();
	@Given("^I am on the fourstay login dialog$")
	public void i_am_on_the_fourstay_login_dialog() throws Throwable {
		Driver.getInstance().get(ConfigurationReader.getProperty("url"));
		HomePage homePage = new HomePage();
		homePage.loginLink.click();
	   
	}

	@Given("^I enter email \"([^\"]*)\"$")
	public void i_enter_email(String email) throws Throwable {
		System.out.println(email);// printed from Cucumber
		BrowserUtility.waitEnterCredentials();
		homePage.email.sendKeys(email);
	 
	}

	@Given("^I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) throws Throwable {
		BrowserUtility.waitEnterCredentials();
		homePage.password.sendKeys(password);
	 
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws Throwable {
		homePage.loginBtn.click();   
	}

	@Then("^the user name should be \"([^\"]*)\"$")
	public void the_user_name_should_be(String name) throws Throwable {
	
		
	   
	}


	

}
