package com.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;
import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

/**
 * 
 * @author Rajesh kumar
 * @see Maitains the  configuration of the JVM report
 *
 */
public class Reporting extends BaseClass {
	

public static  void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {
		
		File file = new File(getProjectPath()+getPropertyFileValue("jvmPath"));
		
		Configuration configuration = new Configuration(file,"Adactin Hotel Automation");
		
		configuration.addClassifications("Browser name ", "Chrome");
		configuration.addClassifications("Browser Version", "107");
		configuration.addClassifications("OS", "Window 8.1");
		configuration.addClassifications("sprint", "34");
		
		
		List<String> jsonFiles = new ArrayList<String>();
		
		jsonFiles.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		
		builder.generateReports();
		
		
	}
	

}
