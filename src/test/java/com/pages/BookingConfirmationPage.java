package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains business logics for save the generated order id
 */
public class BookingConfirmationPage extends BaseClass {
	
	

	public  BookingConfirmationPage () {
		
		PageFactory.initElements(driver, this);
	}
	/**
	 * @see Locators for the Booking Confiramtion
	 */

	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	private WebElement bookingConfirmationMsg;
	
	@FindBy(id="first_name_span")
	private WebElement firstNameErrorMsg;
	
	@FindBy(id="last_name_span")
	private WebElement lastNameErrorMsg;
	
	@FindBy(id="address_span")
	private WebElement billingAddressErrorMsg;
	
	@FindBy(id="cc_num_span")
	private WebElement cardNoErrorMsg;
	
	@FindBy(id="cc_type_span")
	private WebElement cardTypeErrorMsg;
	
	@FindBy(id="cc_expiry_span")
	private WebElement expiryErrorMsg;
	
	@FindBy(id="cc_cvv_span")
	private WebElement cvvErrorMsg;

	/**
	 * 
	 * @return firstNameErrorMsg
	 * @see getters for firstNameErrorMsg
	 * 
	 */
	public WebElement getFirstNameErrorMsg() {
		return firstNameErrorMsg;
	}

	/**
	 * 
	 * @return lastNameErrorMsg
	 * @see getters for lastNameErrorMsg
	 * 
	 */

	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}

	/**
	 * 
	 * @return billingAddressErrorMsg
	 * @see getters for billingAddressErrorMsg
	 * 
	 */
	public WebElement getBillingAddressErrorMsg() {
		return billingAddressErrorMsg;
	}

	/**
	 * 
	 * @return cardNoErrorMsg
	 * @see getters for cardNoErrorMsg 
	 * 
	 */

	public WebElement getCardNoErrorMsg() {
		return cardNoErrorMsg;
	}

	/**
	 * 
	 * @return cardTypeErrorMsg
	 * @see geeters for cardTypeErrorMsg
	 * 
	 */
	public WebElement getCardTypeErrorMsg() {
		return cardTypeErrorMsg;
	}
	
	/**
	 * 
	 * @return expiryErrorMsg
	 * @see getters for expiryErrorMsg
	 * 
	 */

	public WebElement getExpiryErrorMsg() {
		return expiryErrorMsg;
	}
	
	/**
	 * 
	 * @return cvvErrorMsg
	 * @see getters for cvvErrorMsg
	 * 
	 */

	public WebElement getCvvErrorMsg() {
		return cvvErrorMsg;
	}
	
	/**
	 * 
	 * @return bookingConfirmationMsg
	 * @see getters for bookingConfirmationMsg
	 * 
	 */

	public WebElement getBookingConfirmationMsg() {
		return bookingConfirmationMsg;
	}
	
	/**
	 * 
	 * @return orderNo
	 * @see getters for orderNo
	 */
	
	public WebElement getOrderNo() {
		return orderNo;
	}
	
	/**
	 * 
	 * @return orderNo
	 * @see Business logics for get the generated order id and return it
	 */

	// Get the generated order id and return it
	public String orderId() {
		
	String attribute = getOrderNo().getAttribute("value");
	System.out.println(attribute);
	
	return attribute;
	
		
	}
	
	
	
	

}
