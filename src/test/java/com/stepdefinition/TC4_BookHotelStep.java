package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Rajesh kumar
 * @see Maintain Book a Hotel Details
 */
public class TC4_BookHotelStep {
	
	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param billingAddress
	 * @param dataTable
	 * @throws InterruptedException
	 * @see User should enter the above details
	 * 
	 */
		
	@Then("User should enter the {string},{string} and {string}")
	public void userShouldEnterTheAnd(String firstName, String lastName, String billingAddress, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		pom.getBookHotelPage().bookHotel(firstName, lastName, billingAddress, dataTable);
	}
	
	/**
	 * 
	 * @param expBookingConfirmation
	 * @see User should verify success message after booking and save the generated order id
	 * 
	 */
	
	@Then("User should verify success message after booking {string} and save the generated order id")
	public void userShouldVerifySuccessMessageAfterBookingAndSaveTheGeneratedOrderId(String expBookingConfirmation) {
		
		WebElement bookingConfirmationMsg = pom.getBookingConfirmationPage().getBookingConfirmationMsg();
		String actBookingConfirmationMsg = bookingConfirmationMsg.getText();
		
		Assert.assertEquals("Verify the success message after booking", expBookingConfirmation,actBookingConfirmationMsg);
		
		
	}
	
	/**
	 * 
	 * @see User should click the Book now button
	 * 
	 */

	@Then("User should click the Book now button")	
	public void userShouldClickTheBookNowButton() {
		
		pom.getBookHotelPage().bookHotel();

	}
	
	/**
	 * 
	 * @param expFirstNameErrorMsg
	 * @param expLastNameErrorMsg
	 * @param expBillingAddressErrorMsg
	 * @param expCardNoErrorMsg
	 * @param expCreditCardTyeErrorMsg
	 * @param expCrditCardMonthErrorMsg
	 * @param expCvvErrorMsg
	 * @see User should verify the error message
	 * 
	 */
	
	@Then("User should verify the error message {string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyTheErrorMessageAnd(String expFirstNameErrorMsg, String expLastNameErrorMsg, String expBillingAddressErrorMsg, String expCardNoErrorMsg, String expCreditCardTyeErrorMsg, String expCrditCardMonthErrorMsg, String expCvvErrorMsg) {
		
		WebElement firstNameErrorMsg = pom.getBookingConfirmationPage().getFirstNameErrorMsg();
		String actFirstNameErrorMsg = firstNameErrorMsg.getText();
		Assert.assertEquals("Verify the first name error msg", expFirstNameErrorMsg,actFirstNameErrorMsg);
		
		WebElement lastNameErrorMsg = pom.getBookingConfirmationPage().getLastNameErrorMsg();
		String actLastNamerErrorMsg = lastNameErrorMsg.getText();
		Assert.assertEquals("Verify the last name error msg", expLastNameErrorMsg,actLastNamerErrorMsg);
		
		WebElement billingAddressErrorMsg = pom.getBookingConfirmationPage().getBillingAddressErrorMsg();
		String actBillingAddressErrorMsg = billingAddressErrorMsg.getText();
		Assert.assertEquals("Verify the billing address error msg", expBillingAddressErrorMsg,actBillingAddressErrorMsg);
		
		WebElement cardNoErrorMsg = pom.getBookingConfirmationPage().getCardNoErrorMsg();
		String actCardNoErrorMsg = cardNoErrorMsg.getText();
		Assert.assertEquals("Verify the card number error msg", expCardNoErrorMsg,actCardNoErrorMsg);
		
		WebElement cardTypeErrorMsg = pom.getBookingConfirmationPage().getCardTypeErrorMsg();
		String actCardTypeErrorMsg = cardTypeErrorMsg.getText();
		Assert.assertEquals("Verify the credit card type error msg", expCreditCardTyeErrorMsg,actCardTypeErrorMsg);
		
		WebElement expiryErrorMsg = pom.getBookingConfirmationPage().getExpiryErrorMsg();
		String actExpiryErrorMsg = expiryErrorMsg.getText();		
		Assert.assertEquals("Verify the expiry error msg",expCrditCardMonthErrorMsg,actExpiryErrorMsg);
		
		WebElement cvvErrorMsg = pom.getBookingConfirmationPage().getCvvErrorMsg();
		String actCvvErrorMsg = cvvErrorMsg.getText();
		Assert.assertEquals("Verify the cvv error Msg", expCvvErrorMsg,actCvvErrorMsg);
		
	}
	
}
