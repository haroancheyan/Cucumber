package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features//MobilePurchase.feature",
                     glue ="com.flipkart.stepdefinition",
                     plugin = "html:target",
                     monochrome = true,
                     dryRun = false
                     )


public class TestRunner {

}
