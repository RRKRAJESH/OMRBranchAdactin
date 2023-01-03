
package com.stepdefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains common steps
 * 
 */
public class CommonStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();
	
	/**
	 * 
	 * @param expLoginSuccessMessage
	 * @see User should verify after the login with success message
	 * 
	 */

	@Then("User should verify after the login with success message {string}")
	public void userShouldVerifyAfterTheLoginWithSuccessMessage(String expLoginSuccessMessage) {

		WebElement welcomeMsg = pom.getSearchHotelPage().getWelcomeMsg();
		
		String actLoginMsg = getAttribute1(welcomeMsg);
		
		Assert.assertEquals("Verify after login success messge",expLoginSuccessMessage, actLoginMsg);	
	}
	
	/**
	 * 
	 * @param expSelectHotelMsg
	 * @see User should verify the success message after search
	 * 
	 */

	@Then("User should verify the success message after search {string}")
	public void userShouldVerifyTheSuccessMessageAfterSearch(String expSelectHotelMsg) {
		
		
		WebElement selHotelMsg = pom.getSelectHotelPage().getSelHotelMsg();
		String actSelectHotelMsg = getText(selHotelMsg);
		Assert.assertEquals("The user should verify success message after search",expSelectHotelMsg,actSelectHotelMsg);
	
	}
}
