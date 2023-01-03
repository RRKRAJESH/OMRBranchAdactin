package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains the Login function Details
 */
public class TC1_LoginStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see User is on the adactin page
	 * 
	 */
	@Given("User is on the adactin page")
	public void userIsOnTheAdactinPage() {	
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @see User should perform login 
	 * 
	 */
	
	@When("User should perform login {string},{string}")
	public void userShouldPerformLogin(String userName, String password) {
	
		pom.getLoginPage().login(userName,password);

	}	
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws AWTException
	 * @see User should perform login with Enter key
	 * 
	 */

	@When("User should perform login {string},{string} with Enter key")
	public void userShouldPerformLoginWithEnterKey(String userName, String password) throws AWTException {
		
		pom.getLoginPage().loginWithEnterKey(userName, password);

	}
	
	/**
	 * 
	 * @param expErroMsg
	 * @see User should verify after the login with invalid crdential message
	 * 
	 */
	
	@Then("User should verify after the login with invalid crdential message {string}")
	public void userShouldVerifyAfterTheLoginWithInvalidCrdentialMessage(String expErroMsg) {
		
		WebElement invalidErrorMsg = pom.getSearchHotelPage().getInvalidErrorMsg();
		String actErrorMsg = getText(invalidErrorMsg);
		boolean contains = actErrorMsg.contains(expErroMsg);
		Assert.assertTrue("Verifying after login with invalid crdential message", contains);
		
	}









}
