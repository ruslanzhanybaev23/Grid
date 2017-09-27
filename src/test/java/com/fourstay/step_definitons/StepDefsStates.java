package com.fourstay.step_definitons;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefsStates {
	@Given("^I am on the fourstay homepage$")
	public void i_am_on_the_fourstay_homepage() throws Throwable {

	}

	@Given("^I enter school name \"([^\"]*)\"$")
	public void i_enter_school_name(String schhol) throws Throwable {

	}

	@Given("^I enter dates \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_dates_and(String arg1, String arg2) throws Throwable {

	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {

	}

	@Then("^the results should contain$")
	public void the_results_should_contain(List<String> states) throws Throwable {

		

	}

	@When("^I enter this to the search criteria$")
	public void i_enter_this_to_the_search_criteria(List<String> arg1) throws Throwable {

	}

}
