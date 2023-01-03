package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains select the hotel Details
 *
 */
public class TC3_SelectHotelStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see User should select the Hotel name
	 */
	@Then("User should select the Hotel name")
	public void userShouldSelectTheHotelName() {
		
		pom.getSelectHotelPage().selectHotel();
	}
	
	/**
	 * 
	 * @param expBookHotelMsg
	 * @see User should select the Hotel name
	 * 
	 */
	
	@Then("User should verify the success message after click the continue {string}")
	public void userShouldVerifyTheSuccessMessageAfterClickTheContinue(String expBookHotelMsg) {
		
		WebElement bookHotelMsg = pom.getBookHotelPage().getBookHotelMsg();
		String actBookHotelMsg = bookHotelMsg.getText();
		Assert.assertEquals("Verify the success message after the click the continue",expBookHotelMsg,actBookHotelMsg);

	}
	
	/**
	 * 
	 * @see User should click the continue button
	 * 
	 */
	
	@Then("User should click the continue button")
	public void userShouldClickTheContinueButton() {
		
		pom.getSelectHotelPage().clickContinue();

	}
	
	/**
	 * 
	 * @param expSelectHotelMsg
	 * @see User should verify the error message after click the continue
	 * 
	 */
	
	@Then("User should verify the error message after click the continue {string}")
	public void userShouldVerifyTheErrorMessageAfterClickTheContinue(String expSelectHotelMsg) {
		
		WebElement selectHotelErrorMsg = pom.getSelectHotelPage().getSelectHotelErrorMsg();
		String actSelectHotelErrorMsg = selectHotelErrorMsg.getText();
		
		Assert.assertEquals("Verify the error message after click the continue", expSelectHotelMsg,actSelectHotelErrorMsg);
	}






	


	

}
