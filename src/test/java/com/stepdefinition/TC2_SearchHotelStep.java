package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains search the hotel details
 * 
 */
public class TC2_SearchHotelStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param aduRoom
	 * @param chiRoom
	 * @see User should search the respective hotel details
	 * 
	 */

	@Then("User should search the respective hotel details {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void userShouldSearchTheRespectiveHotelDetailsAnd(String location, String hotels, String roomType, String noOfRooms, String inDate, String outDate, String aduRoom, String chiRoom) {

		pom.getSearchHotelPage().searchHotel(location, hotels, roomType, noOfRooms, inDate, outDate, aduRoom, chiRoom);
	}
	
	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param aduRoom
	 * @see User should enter only the mandatory fields
	 * 
	 */

	@Then("User should enter only the mandatory fields {string},{string},{string},{string} and {string}")
	public void userShouldEnterOnlyTheMandatoryFieldsAnd(String location, String noOfRooms, String inDate, String outDate, String aduRoom) {
		
		pom.getSearchHotelPage().searchHotel(location, noOfRooms, inDate, outDate, aduRoom);
	}
	
	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param aduRoom
	 * @see User should search the respective hotel details
	 * 
	 */
	

	@Then("User should search the respective hotel details {string},{string},{string},{string} and {string}")
	public void userShouldSearchTheRespectiveHotelDetailsAnd(String location, String noOfRooms, String inDate, String outDate, String aduRoom) {

		pom.getSearchHotelPage().searchHotel(location, noOfRooms, inDate, outDate, aduRoom);
	}
	
	/**
	 * 
	 * @param expInDateErrorMsg
	 * @param expOutDateErrorMsg
	 * @see User should verify the invalid date message after search 
	 * 
	 */
	
	@Then("User should verify the invalid date message after search {string},{string}")
	public void userShouldVerifyTheInvalidDateMessageAfterSearch(String expInDateErrorMsg, String expOutDateErrorMsg) {
		
		WebElement inDateErrorMsg = pom.getSearchHotelPage().getInDateErrorMsg();
		String actInDateErrorMsg = getText(inDateErrorMsg);
		
		WebElement outDateErrorMsg = pom.getSearchHotelPage().getOutDateErrorMsg();
		String actOutDateErrorMsg = getText(outDateErrorMsg);
		
		Assert.assertEquals("Verifying the inDate error msg", expInDateErrorMsg,actInDateErrorMsg);
		Assert.assertEquals("verifying the outDate error msg", expOutDateErrorMsg,actOutDateErrorMsg);
		

	}
	
	/**
	 * 
	 *@see User should click the search button without passing any fields
	 *
	 */
	
	@Then("User should click the search button without passing any fields")
	public void userShouldClickTheSearchButtonWithoutPassingAnyFields() {
		
		pom.getSearchHotelPage().clickSerachHotel();

	}
	
	/**
	 * 
	 * @param expLocationErrorMsg
	 * @see User should verify the error message after search
	 * 
	 */
	
	@Then("User should verify the error message after search {string}")
	public void userShouldVerifyTheErrorMessageAfterSearch(String expLocationErrorMsg) {
		
		WebElement selectLocationErrorMsg = pom.getSearchHotelPage().getSelectLocationErrorMsg();
		String actLocationErrorMsg = getText(selectLocationErrorMsg);
		
		Assert.assertEquals("Verifying the select hotel error Message",expLocationErrorMsg,actLocationErrorMsg);
	}
}
