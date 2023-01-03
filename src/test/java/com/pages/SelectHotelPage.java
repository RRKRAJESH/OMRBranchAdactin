package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author Rajesh kumar
 * @see Maintains the Business logics for the Select Hotel Details
 */
public class SelectHotelPage extends BaseClass {
	
	
	public SelectHotelPage() {
		
		PageFactory.initElements(driver, this);
			
	}
	
	/**
	 * @see Locators for the Select Hotel Details
	 */
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selHotelMsg;
	
	@FindBy(id="radiobutton_0")
	private WebElement radioClick;
	
	@FindBy(id="continue")
	private WebElement click;
	
	@FindBy(xpath="//label[text()='Please Select a Hotel']")
	private WebElement selectHotelErrorMsg;
	
	/**
	 * 
	 * @return selHotelMsg
	 * @see selHotelMsg
	 * 
	 */
	public WebElement getSelHotelMsg() {
		return selHotelMsg;
	}

	/**
	 * 
	 * @return radioClick
	 * @see radioClick
	 * 
	 */
	public WebElement getRadioClick() {
		return radioClick;
	}

	/**
	 * 
	 * @return click
	 * @see click
	 * 
	 */
	public WebElement getClick() {
		return click;
	}
	
	/**
	 * 
	 * @return selectHotelErrorMsg
	 * @see selectHotelErrorMsg
	 * 
	 */
	public WebElement getSelectHotelErrorMsg() {
		return selectHotelErrorMsg;
	}

	/**
	 * @see Maintains Business logics for the select hotel name
	 */
	
	// 1. By select hotel name
	public void selectHotel() {
		eleClick(getRadioClick());
		eleClick(getClick());
	}
	
	/**
	 * @see Maintains Business logics for the without select hotel name
	 */
	// 2. Without select the hotel name
	
	public void clickContinue() {
		eleClick(getClick());
		
	}
	
	

}
