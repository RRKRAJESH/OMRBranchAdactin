package com.pagemanager;

import com.pages.BookHotelPage;
import com.pages.BookingConfirmationPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
/**
 * 
 * @author Rajesh kumar
 * @see Maintiain POJO class for all End to End Hotel Booking functionalities
 * 
 */
public class PageObjectManager {
	
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookingConfirmationPage bookingConfirmationPage;
	private CancelBookingPage cancelBookingPage;

	/**
	 * 
	 * @return loginPage
	 * @see getters for loginPage and assign the value for loginPage
	 * 
	 */
	
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage = new LoginPage():loginPage;
	}
	
	/**
	 * 
	 * @return searchHotelPage
	 * @see getter for searchHotelPage and assign the value for searchHotelPage
	 * 
	 */
	
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage = new SearchHotelPage():searchHotelPage;
	}
	
	/**
	 * 
	 * @return selectHotelPage
	 * @see getters for selectHotelPage and assign the value for selectHotelPage
	 * 
	 */
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage = new SelectHotelPage():selectHotelPage;
	}
	
	/**
	 * 
	 * @return bookHotelPage
	 * @see getter for bookHotelPage and assign the value for bookHotelPage
	 * 
	 */
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage = new BookHotelPage():bookHotelPage;
	}
	
	/**
	 * 
	 * @return BookingConfirmationPage
	 * @see getter for BookingConfirmationPage and assign the value for BookingConfirmationPage
	 * 
	 */
	public BookingConfirmationPage getBookingConfirmationPage() {
		return (bookingConfirmationPage==null)?bookingConfirmationPage = new BookingConfirmationPage():bookingConfirmationPage;
	}
	
	/**
	 * 
	 * @return cancelBookingPage
	 * @see getter for cancelBookingPage and assign the value for cancelBookingPage
	 * 
	 */
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)?cancelBookingPage = new CancelBookingPage():cancelBookingPage;
	}
	
	
	
	
	

}
