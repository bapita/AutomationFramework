package com.tech.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			// we can specify which feature we want to run, we can also run all features. So, specifically src/test/resources/features/Login.feature
			features = "src/test/resources/features/",
			
			// shows where we can find the implementation regarding the steps in feature files above
			glue = "com.tech.steps",
			
			// if true, it does not really run the steps. it just check if every step in feature files is defined in code
			dryRun = true, // only performs test in the feature file that are not yet implemented if true. False will let the tests get executed
			
			// tags is similar to groups in TestNG
			tags = "@dt",
			
			monochrome = true,
			plugin = { // plugin here is the array of strings
					"pretty", //prints gherkin steps in console to help identifying the scenarios and related files where they are defined
					"html:target/cucumber-default-report", //create a basic html report in target folder
					"json:target/cucumber.json",
					"rerun:target/failed.txt" // to rerun the failed scenarios
			}
		)
public class TestRunner {

}
