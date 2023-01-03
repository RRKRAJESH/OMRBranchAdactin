package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author Rajesh kumar
 * @see Maintains the business logics for the Login function
 */
public class LoginPage extends BaseClass{
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
		/**
		 * @see Locator for the login function
		 * 
		 */
	}
	@FindBy(id = "username")
	public WebElement txtUserName;

	@FindBy(id = "password")
	public WebElement txtPassword;
	
	@FindBy(id = "login")
	public WebElement btnLogin;
	
	/**
	 * 
	 * @return txtUserName
	 * @see getters for txtUserName
	 * 
	 */

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	/**
	 * 
	 * @return txtPassword
	 * @see getters for txtPassword
	 * 
	 */
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	
	/**
	 * 
	 * @return btnLogin
	 * @see getters for btnLogin
	 * 
	 */

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	/**
	 * 
	 * @param userName
	 * @param password
	 * @see Business logics for the login using click button
	 * 
	 */
	public void login(String userName,String password) {
		
		sendKeys(getTxtUserName(), userName);
		sendKeys(getTxtPassword(), password);
		eleClick(getBtnLogin());
		
	}
	
	/**
	 * 
	 * @param userName
	 * @param password
	 * @throws AWTException
	 * @see Business logics for the login with Enter key
	 *  
	 */
	public void loginWithEnterKey(String userName,String password) throws AWTException {
		
		sendKeys(getTxtUserName(), userName);
		sendKeys(getTxtPassword(), password);
		keyPressEnter();
		
	}
	
	
	
	
	
	
	



}
