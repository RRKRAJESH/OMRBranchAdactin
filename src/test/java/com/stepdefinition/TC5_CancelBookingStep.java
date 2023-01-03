package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains cancel the booking hotel Details
 * 
 */
public class TC5_CancelBookingStep {
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @see User should cancel booking by passing the generated order id
	 * 
	 */
	
	@Then("User should cancel booking by passing the generated order id")
	public void userShouldCancelBookingByPassingTheGeneratedOrderId() {
		
		pom.getCancelBookingPage().cancelGeneratedOrderId();

	}
	
	/**
	 * 
	 * @param expSuccessfulCancelMsg
	 * @see User should verify the cancel success message
	 * 
	 */
	
	@Then("User should verify the cancel success message {string}")
	public void userShouldVerifyTheCancelSuccessMessage(String expSuccessfulCancelMsg) {
		
		WebElement cancelSuccessMsg = pom.getCancelBookingPage().getCancelSuccessMsg();
		String actSuccessfulCancelMsg = cancelSuccessMsg.getText();
		Assert.assertEquals("Verify the cancel success message", expSuccessfulCancelMsg,actSuccessfulCancelMsg);

	}
	
	/**
	 * 
	 * @see User should click the Booked Itinerary
	 * 
	 */

	@Then("User should click the Booked Itinerary")
	public void userShouldClickTheBookedItinerary() {
		
		WebElement clickBookedItinerary = pom.getCancelBookingPage().getClickBookedItinerary();
		clickBookedItinerary.click();

	}
	
	/**
	 * 
	 * @param existingOrderId
	 * @see User should cancel booking by passing the existing order id
	 * 
	 */
	
	@Then("User should cancel booking by passing the existing order id {string}")
	public void userShouldCancelBookingByPassingTheExistingOrderId(String existingOrderId) {
		
		pom.getCancelBookingPage().cancelExistingOrderId(existingOrderId);

	}






	
	
	

}
