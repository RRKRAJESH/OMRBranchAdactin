package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains Business logics for Book a Hotel Page
 * 
 */
public class BookHotelPage extends BaseClass{
	
	public BookHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @see Locators for Book a Hotel Details
	 */

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookHotelMsg;

	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNo;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	/**
	 * 
	 * @return bookHotelMsg
	 * @see getters for book Hotel message
	 * 
	 */
	
	public WebElement getBookHotelMsg() {
		return bookHotelMsg;
	}
	
	/**
	 * 
	 * @return firstName
	 * @see getters for firstName
	 * 
	 */

	public WebElement getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @return
	 * @see getters for lastnName
	 * 
	 */

	public WebElement getLastName() {
		return lastName;
	}
	
	/**
	 * 
	 * @return
	 * @see getters for Address
	 * 
	 */

	public WebElement getAddress() {
		return address;
	}
	
	/**
	 * 
	 * @return cardNo
	 * @see getters for cardNo
	 * 
	 */

	public WebElement getCardNo() {
		return cardNo;
	}
	
	/**
	 * 
	 * @return cardType
	 * @see getters for cardType
	 * 
	 */

	public WebElement getCardType() {
		return cardType;
	}
	/**
	 * 
	 * @return expMonth
	 * @see getters for expMonth
	 */

	public WebElement getExpMonth() {
		return expMonth;
	}

	/**
	 * 
	 * @return expYear
	 * @see getters for ExpYear
	 * 
	 */
	public WebElement getExpYear() {
		return expYear;
	}

	/**
	 * 
	 * @return cvv
	 * @see getters for cvv
	 */
	public WebElement getCvv() {
		return cvv;
	}
	
	/**
	 * 
	 * @return bookNow
	 * @see getters for bookNow
	 * 
	 */

	public WebElement getBookNow() {
		return bookNow;
	}
	
	/**
	 * 
	 * @param firName
	 * @param lasName
	 * @param address
	 * @param dataTable
	 * @throws InterruptedException
	 * @see Business logics for Book a Hotel by passing all fields
	 * 
	 */

	// 1. By select all fields
	public void bookHotel(String firName,String lasName,String address,io.cucumber.datatable.DataTable dataTable ) throws InterruptedException  {
		
		sendKeys(getFirstName(), firName);
		sendKeys(getLastName(), lasName);
		sendKeys(getAddress(), address);
		
		List<Map<String, String>> asMaps = dataTable.asMaps();

		Map<String, String> map = asMaps.get(1);
			
		String creditCardNo = map.get("Creditcard No");
		clearData(getCardNo());
		sendKeys(getCardNo(), creditCardNo);
		
		String cardType = map.get("Card type");
		sendKeys(getCardType(), cardType);
		
		String expMonth = map.get("Exp Month");
		sendKeys(getExpMonth(), expMonth);
		
		String expYear = map.get("Exp Year");
		sendKeys(getExpYear(), expYear);
		
		String cvv = map.get("cvv");
		sendKeys(getCvv(), cvv);
		
		eleClick(getBookNow());	
		
		Thread.sleep(10000);
	
		
	
	}
	
	/**
	 * @see Business logics for click the book now without passing any fields
	 */
	
	// 2. Without enter any fields
	public void bookHotel() {
		
		eleClick(getBookNow());	
			
	}
	
	
	
	
	

}



