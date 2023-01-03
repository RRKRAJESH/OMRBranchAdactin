package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains the Business logics for the search hotel Details
 * 
 */
public class SearchHotelPage extends BaseClass{
	
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @see Locators for the Search Hotel Details 
	 * 
	 */
	
	@FindBy(id="username_show")
	private WebElement welcomeMsg;
	
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invalidErrorMsg;
	
	@FindBy(id="location")
	private WebElement selLoc;
	
	@FindBy(id="hotels")
	private WebElement selHot;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement inDate;
	
	@FindBy(id="datepick_out")
	private WebElement outDate;
	
	@FindBy(id="adult_room")
	private WebElement aduRoom;
	
	@FindBy(id="child_room")
	private WebElement chiRoom;
	
	@FindBy(id="Submit")
	private WebElement search;
	
	@FindBy(id="checkin_span")
	private WebElement inDateErrorMsg;
	
	@FindBy(id="checkout_span")
	private WebElement outDateErrorMsg;
	
	@FindBy(id="location_span")
	private WebElement selectLocationErrorMsg;
	
	/**
	 * 
	 * @return selectLocationErrorMsg
	 * @see getters for selectLocationErrorMsg
	 * 
	 */
	
	public WebElement getSelectLocationErrorMsg() {
		return selectLocationErrorMsg;
	}
	/**
	 * 
	 * @return inDateErrorMsg
	 * @see getters for inDateErrorMsg
	 * 
	 */
	
	public WebElement getInDateErrorMsg() {
		return inDateErrorMsg;
	}
	
	/**
	 * 
	 * @return outDateErrorMsg
	 * @see getters for outDateErrorMsg
	 * 
	 */
	

	public WebElement getOutDateErrorMsg() {
		return outDateErrorMsg;
	}
	/**
	 * 
	 * @return welcomeMsg
	 * @see getters for welcomeMsg
	 * 
	 */
	
	public WebElement getWelcomeMsg() {
		return welcomeMsg;
	}
	/**
	 * 
	 * @return invalidErrorMsg
	 * @see getters for invalidErrorMsg
	 * 
	 */
	
	
	public WebElement getInvalidErrorMsg() {
		return invalidErrorMsg;
	}
	
	/**
	 * 
	 * @return selLoc
	 * @see getters for selLoc
	 * 
	 */
	

	public WebElement getSelLoc() {
		return selLoc;
	}

	/**
	 * 
	 * @return selHot
	 * @see getters for selHot
	 * 
	 */
	
	public WebElement getSelHot() {
		return selHot;
	}
	
	/**
	 * 
	 * @return roomType
	 * @see getters for roomType
	 * 
	 */
	

	public WebElement getRoomType() {
		return roomType;
	}

	/**
	 * 
	 * @return noOfRooms
	 * @see getters for noOfRooms
	 * 
	 */
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	/**
	 * 
	 * @return inDate
	 * @see getters for inDate
	 * 
	 */
	
	public WebElement getInDate() {
		return inDate;
	}

	/**
	 * 
	 * @return outDate
	 * @see getters for outDate
	 * 
	 */
	
	public WebElement getOutDate() {
		return outDate;
	}

	/**
	 * 
	 * @return aduRoom
	 * @see getters for aduRoom
	 * 
	 */
	
	public WebElement getAduRoom() {
		return aduRoom;
	}

	/**
	 * 
	 * @return chiRoom
	 * @see getters for chiRoom
	 * 
	 */
	
	public WebElement getChiRoom() {
		return chiRoom;
	}

	/**
	 * 
	 * @return search
	 * @see getters for search
	 * 
	 */
	
	public WebElement getSearch() {
		return search;
	}

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
	 * @see Maintain the Business logics for the Search Hotel By passing all fields
	 * 
	 */
	// 1. By selecting all fields
	// 3. Date checking (check in date and check out date)
	public  void searchHotel(String location,String hotels, String roomType, String noOfRooms,String inDate,String outDate, String aduRoom,String chiRoom ) {
		
		selectOptionByText(getSelLoc(), location);
		selectOptionByText(getSelHot(), hotels);
		selectOptionByText(getRoomType(), roomType);
		selectOptionByText(getNoOfRooms(), noOfRooms);
		
		clearData(getInDate());
		sendKeys(getInDate(),inDate);
		
		clearData(getOutDate());
		sendKeys(getOutDate(), outDate);
		
		selectOptionByText(getAduRoom(), aduRoom);
		selectOptionByText(getChiRoom(), chiRoom);
		eleClick(getSearch());
		
	}
	
	/**
	 * 
	 * @param location
	 * @param noOfRooms
	 * @param inDate
	 * @param outDate
	 * @param aduRoom
	 * @see Maintains the Business logics for the Search Hotel by passing the mandatory fields
	 * 
	 */
	// 2. Verify mandatory fields
	public void searchHotel(String location,String noOfRooms,String inDate,String outDate, String aduRoom) {
		
		selectOptionByText(getSelLoc(), location);
		selectOptionByText(getNoOfRooms(), noOfRooms);
		clearData(getInDate());
		sendKeys(getInDate(),inDate);
		clearData(getOutDate());
		sendKeys(getOutDate(), outDate);
		selectOptionByText(getAduRoom(), aduRoom);
		eleClick(getSearch());
		
	}
	/**
	 * 
	 * @see Maintains the Business logics for the click search hotel button without passing any fields
	 * 
	 */
	
	// 4. Without enter any fields 
	public void clickSerachHotel() {
		
		eleClick(getSearch());
		
	}

	
	
	
	
	
	
}
