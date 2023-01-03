
package com.runner;



import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags="",dryRun = false, publish = true, snippets=SnippetType.CAMELCASE, 
stepNotifications = true, monochrome = true, plugin = { "usage","json:target\\Output.json" },  
		features = "src\\test\\resources\\Features", glue = "com.stepdefinition")
/**
 * 
 * @author Rajesh kumar
 * @see Maintains the program running process
 * 
 */

public class TestRunnerClass extends BaseClass {
	
	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @see User should generate the jvm report
	 * 
	 */
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		
		
		Reporting.generateJvmReport(getProjectPath()+ getPropertyFileValue("jsonPath"));
		
		
	}
	
	
}
