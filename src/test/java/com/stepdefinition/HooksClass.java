package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
/**
 * 
 * @author Rajesh kumar
 * @see Maintains launch and close the browser
 */

public class HooksClass extends BaseClass {
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see it will execute before each scenario
	 * 
	 */
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		

		getDriver1(getPropertyFileValue("browser"));
		getCurrentUrl(getPropertyFileValue("Url"));
		maxWindow();
	}
	
	/**
	 * 
	 * @param scenario
	 * @see it wil execute after each scenario
	 * @see it take screen shot of scenario which get failed
	 * 
	 */
	
	@After
	public void afterScenario(Scenario scenario) {	
		
		scenario.attach(screenshot(), "images/png", "EveryScenario");
		
		closeAllWindow();

	}
	

}
