	package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains the business logics for Cancel booking page
 * 
 */
public class CancelBookingPage extends BaseClass {
	
public  CancelBookingPage () {
		
		PageFactory.initElements(driver, this);
	}
	
/**
 * @see Locators for the cancel booking hotel
 */
	
@FindBy(xpath="//a[text()='Booked Itinerary']")
private WebElement clickBookedItinerary;

@FindBy(id="order_id_text")
private WebElement searchBox;

@FindBy(id="search_hotel_id")
private WebElement clickGo;

@FindBy(xpath="//input[@style ='width:150px;']")
private WebElement cliCancel;

@FindBy(id="search_result_error")
private WebElement cancelMsg;

@FindBy(xpath="//label[@id='search_result_error']")
private WebElement cancelSuccessMsg;

/**
 * 
 * @return cancelSuccessMsg
 * @see getters for cancelSuccessMsg
 * 
 */

public WebElement getCancelSuccessMsg() {
	return cancelSuccessMsg;
}
/**
 * 
 * @return clickBookedItinerary
 * @see getters for clickBookedItinerary
 * 
 */
public WebElement getClickBookedItinerary() {
	return clickBookedItinerary;
}
/**
 * 
 * @return searchBox
 * @see getters for searchBox
 * 
 */

public WebElement getSearchBox() {
	return searchBox;
}

/**
 * 
 * @return clickGo
 * @see getters for clickGo
 * 
 */
public WebElement getClickGo() {
	return clickGo;
}
/**
 * 
 * @return cliCancel
 * @see getters for cliCancel
 */

public WebElement getCliCancel() {
	return cliCancel;
}
/**
 * 
 * @return cancelMsg
 * @see getters for cancelMsg
 */
public WebElement getCancelMsg() {
	return cancelMsg;
}
	/**
	 * @see Business logics for cancel the generated order id
	 */
	public void cancelGeneratedOrderId( ) {
	
		BookingConfirmationPage a = new BookingConfirmationPage();
		String orderId = a.orderId();
		
		eleClick(getClickBookedItinerary());
		sendKeys(getSearchBox(),orderId);
		eleClick(getClickGo());
		eleClick(getCliCancel());
		accAlert();
	}
	
	/**
	 * 
	 * @param orderId
	 * @see Business logics for cancel the existing order id
	 * 
	 */
	public void cancelExistingOrderId(String orderId) {
		
		sendKeys(getSearchBox(),orderId);
		eleClick(getClickGo());
		eleClick(getCliCancel());
		accAlert();
	}



	
	
	

}
