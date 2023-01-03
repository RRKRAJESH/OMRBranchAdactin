package com.runner;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class A {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("C:\\Users\\Rajesh kumar\\eclipse-workspace\\OMRBranchAdactinAutomation\\Config\\Config.properties");
		
		Properties properties = new Properties();
		
		properties.load(stream);
		
		Object object = properties.get("Url");
		
		String url = (String)object;
		
		System.out.println(url);
		
	//	String property = System.getProperty("user.dir");
	//	System.out.println(property);
	}

}
