package com.flipkart.stepdefinition;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.flipkart.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	
	Commonactions c = new Commonactions();
	@Before
	public void beforeScenario() {
		System.out.println("Before every Scenario");
	    c.launch();
		
	}
	@After
	public void afterScenario(Scenario scen) {
		if(scen.isFailed()) {
			final byte[] screenshotAs = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scen.embed(screenshotAs, "image/png");
		}
		System.out.println("after Scenario");
		driver.quit();
		
	}

}
