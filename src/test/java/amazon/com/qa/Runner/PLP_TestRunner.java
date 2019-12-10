package amazon.com.qa.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true
				 ,features={"C:/Users/U28166/workspace1213/Amazon_Bdd/src/test/resources/ProductSearch.feature"}
				 ,monochrome=true
				 ,glue={"amazon.com.qa.stepDefinitions"}	
				 ,format={"json:C:/Users/U28166/workspace1213/Amazon_Bdd/target/cucumber-parallel/json/2.json"}
				 ,tags={"@Chrome"}
				 ,dryRun=false
		)

public class PLP_TestRunner {

}