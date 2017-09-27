package com.fourstay.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="./src/test/resources/features",glue="com.fourstay.step_definitons",dryRun=false,
tags="@states",plugin= {"html:target/cucumber-reports","json:target/cucumber.json","rerun:target/rerun.txt"})
//rerun the cuccumber
public class CuckeRunner {
	
	//we can have txt.file for failed tests

}
