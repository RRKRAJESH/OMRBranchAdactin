package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Rajesh kumar
 * @Date 06/12/2022
 * @see Maintain reusable methods
 *
 */

public class BaseClass {
	
	/**
	 * @see Declare the ref. Name for WebDriver 
	 */
public static WebDriver driver;
	
/**
 * 
 * @return b
 * @see Take screenshot and report file
 */
public byte[] screenshot() {
	
TakesScreenshot screenshot =(TakesScreenshot) driver;

byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);

return b;
}

/**
 * 
 * @return path
 * @see get the Current project path
 * 
 */

public static String getProjectPath() {
	
	String path = System.getProperty("user.dir");
	return path;	
}

/**
 * 
 * @param key
 * @return
 * @throws FileNotFoundException
 * @throws IOException
 * @see get the required paths from the Config. files
 * 
 */

public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
	
	Properties properties = new Properties();
	
	properties.load(new FileInputStream (getProjectPath()+"\\Config\\Config.properties"));
	
	Object object = properties.get(key);
	
	String value = (String)object;
	
	return value;	
}

	/**
	 * 
	 * @param browser
	 * @see Get the browsers using switch case
	 * 
	 */
	public static void getDriver1(String browser) {
		
		
	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		break;
	
	case "firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		break;
	
	case "ie":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		
		break;
		
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
		
		
	default:
		break;
	}
		
		
		
		
}
	/**
	 * 
	 * @return driver
	 * @see launch the ChromeDriver
	 */

	public static WebDriver getDriver() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		return driver;
	}
	
	/**
	 * 
	 * @param url
	 * @see Launch the entered URL
	 * 
	 */
	
	public static void getCurrentUrl(String url) {
		driver.get(url);
		
	}
	/**
	 * @see Maximize the window
	 */
	
	public static void maxWindow() { 
		
		driver.manage().window().maximize();
		
	}
	/**
	 * 
	 * @param element
	 * @param data
	 * @see Send the values in a text box
	 * 
	 */
	
	public void sendKeys(WebElement element, String data) {
		
		element.sendKeys(data);
		
	}
	/**
	 * 
	 * @param element
	 * @param data
	 * @see Send the values in text box using JavaScript
	 * 
	 */
	
	public void sendKeysByJs(WebElement element, String data) {
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);

	}
	
	/**
	 * 
	 * @param element
	 * @see Click the WebElement
	 * 
	 */
	
	public void eleClick(WebElement element) {
		
		element.click();
	}
	/**
	 * 
	 * @return title
	 * @see Get the title of the current webpage
	 */
	
	// 7. get title from the web page (input = No ,output = String )
	
	public String getTitle() {
		
		String title = driver.getTitle();
		
		return title;
		
	}
	/**
	 * 
	 * @param data
	 * @return element
	 * @see Find the WebElement by using id
	 *
	 */
	
	public WebElement findElementById(String data) {
		
		WebElement element = driver.findElement(By.id(data));
		
		return element;
	}
	
	/**
	 * 
	 * @param data
	 * @return element
	 * @see Find the webelment by using name
	 * 
	 */
	
	public WebElement findElementByName(String data) {
		
		WebElement element = driver.findElement(By.name(data));
		
		return element;
		
	}
	
	/**
	 * 
	 * @param data
	 * @return element
	 * @see Find the webelement by using Class name
	 * 
	 */
	public WebElement findElementByClassName(String data) {
		
		WebElement element = driver.findElement(By.className(data));
		
		return element;

	}
	/**
	 * 
	 * @param data
	 * @return element
	 * @see Find the webelement by using xpath
	 * 
	 */
	
	public WebElement findElementByXpath(String data) {
			
		WebElement element = driver.findElement(By.xpath(data));
		
		return element;
	}
	/**
	 * 
	 * @return currenturl
	 * @see Get the currenturl of the webpage
	 * 
	 */
	public String getUrl() {
		
		String currenturl = driver.getCurrentUrl();
		
		return currenturl;
		
	}
	/**
	 * 
	 * @param element
	 * @return text
	 * @see Get text from the webelement
	 * 
	 */
	
	public String  getText(WebElement element) {
		
		String text = element.getText();
		
		return text;
	}
	
	/**
	 * @see close the current window
	 */
	
	public void closeWindow() {
		
		driver.close();
		
	}
	/**
	 * @see close all the window
	 */
	
	public static  void closeAllWindow() {
		driver.quit();
		
	}
	/**
	 * 
	 * @param element
	 * @param value
	 * @return attribute
	 * @see Get the attribute value of the webelement
	 * 
	 */
	
	//  99% of chance to get attribute  from the web element(input = [WebElement, String] ,  output = [String]  )
	public static String getAttribute(WebElement element, String value) {
		
		String attribute = element.getAttribute(value);
		
		return attribute;
		
	}
	/**
	 * 
	 * @param element
	 * @return attribute
	 * @see Get attribute value of the webelement
	 * 
	 */
	
	// 1% of chance to get attribute from the web element (input = [WebElement, String] ,  output = [String]  )
	
	public static String getAttribute1(WebElement element) {
		
		String attribute = element.getAttribute("value");
		
		return attribute;
		
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 * @see Select the option by using Visible text
	 * 
	 */
	public void selectOptionByText(WebElement element, String value) {
		
		Select s = new Select(element);
		
		s.selectByVisibleText(value);
		
	}
	
	/**
	 * 
	 * @param element
	 * @param value
	 * @see Select the option by using value
	 * 
	 */
	public void selectOptionByAttribute(WebElement element, String value) {
		
		Select s = new Select(element);
		
		s.selectByValue(value);
		
	}
	/**
	 * 
	 * @param element
	 * @param value
	 * @see Select the option by using Index
	 * 
	 */
	
	public void selectOptionByIndex(WebElement element, int value) {
			
		Select s = new Select(element);
		
		s.selectByIndex(value);
		
	}
	
	/**
	 * @see Switch the driver into alert
	 */
     public void accAlert() {
    	 
    	 Alert a = driver.switchTo().alert();
    	 a.accept();
    	 
	}
     
/**
 *      
 * @param element
 * @param i
 * @return text
 * @see Get all the options from the text
 * 
 */
     public String getOptions(WebElement element, int i) {
    	 
    	 Select s = new Select(element);
    	 
    	 List<WebElement> options = s.getOptions();
    	 
    	 WebElement value = options.get(i);
    	 
    	 String text = value.getText();
    	 
    	 return text;
    	 
	}
     
     /**
      * 
      * @param element
      * @see Perform the Right click
      * 
      */
     public void rightClick(WebElement element) {
    	 
    	 Actions a = new Actions(driver);
    	 
    	 a.contextClick(element).perform();
    	 
	}
     
     /**
      * 
      * @param element
      * @see Perform the double click
      * 
      */
     public void doubleClick(WebElement element) {
    	 
    	 Actions a = new Actions(driver);
    	 
    	 a.doubleClick(element).perform();	 
	}
     
     /**
      * 
      * @throws AWTException
      * @see Press and Release the Enter Key
      * 
      */
     public void keyPressEnter() throws AWTException { 
    	 
    	 Robot r = new Robot();
    	 
    	 r.keyPress(KeyEvent.VK_ENTER);   
    	 r.keyRelease(KeyEvent.VK_ENTER);
	}
     

     /**
      * 
      * @param element
      * @see Press and Release Enter key using action class
      * 
      */
     public void keyPressAction(WebElement element) {
    	 
    	 Actions a = new Actions(driver);
    	 
    	 a.keyDown(element,Keys.ENTER).keyUp(element,Keys.ENTER).build().perform();
     }
     
     // 39. send keys with pressing shift key (input = [WebElement,String] ,  output = [No] )
     
     public void sendDataWithShift(WebElement element, String data) {
    	 
    	Actions a = new Actions(driver);
    	
    	a.keyDown(element,Keys.SHIFT).sendKeys(data).keyUp(element,Keys.SHIFT).perform();
	} 
     
     
     /**
      * 
      * @param element
      * @see Clear the existing data in text box
      * 
      */
     public void clearData(WebElement element) {
    	 
    	 element.clear();
    	 
	}
     
     /**
      *      
      * @param element
      * @return ss
      * @see TakesscreenShot of the web Page and stroed in temp.file
      * 
      */
     public File takeScreenShot(WebElement element) {
    	 
    	 File ss = element.getScreenshotAs(OutputType.FILE);
    	 return ss;
	}
     

     /**
      * 
      * @param sheetName
      * @param rowNum
      * @param cellNum
      * @return
      * @throws IOException
      * @see Read data from the Excel sheet
      * 
      */
     public String readDataFromCell(String sheetName, int rowNum, int cellNum) throws IOException {
    	 
    	 String res = "";
    	 
    	 File file = new File("C:\\Users\\Rajesh kumar\\eclipse-workspace\\FrameWork1\\TestData\\TestData.xlsx");
    	 
    	 FileInputStream stream = new FileInputStream(file);
    	 
    	 Workbook workbook = new XSSFWorkbook(stream);  
    	 
    	 Sheet sheet = workbook.getSheet("Sheet1");
    	 
    	 Row row = sheet.getRow(rowNum);
    	 
    	 Cell cell = row.getCell(cellNum);
    	 
    	 CellType type = cell.getCellType();
    	 
    	 switch(type) {
    	 
    	 case STRING:
    		 
    		 res = cell.getStringCellValue();
    		 break;
    		 
    	 case NUMERIC:
    		 
    		 if (DateUtil.isCellDateFormatted(cell)) {
    			 
    			 Date dateCellValue = cell.getDateCellValue();
    			 
    			 SimpleDateFormat dateFormat = new SimpleDateFormat ("dd/MM/YYYY");
    			 
    			 res = dateFormat.format(dateCellValue);
				
			}else {
				
				double numericCellValue = cell.getNumericCellValue();
				
				long check = Math.round(numericCellValue);
				
				if (check==numericCellValue) {
					
					res = String.valueOf(check);
					
				} else {
					
					res = String.valueOf(numericCellValue);
					
				}
				
			}
				break;
				default:
				break;    	 }
    	 
    	 return res;
    	 
	}
     /**
      * 
      * @param sheetName
      * @param rowNum
      * @param cellNum
      * @param oldData
      * @param newData
      * @throws IOException
      * @see UpDate the Cell Data in the Excel Sheet
      * 
      */
     public void upDateCellData(String sheetName, int rowNum, int cellNum,String oldData,String newData) throws IOException {

    	 File file = new File("C:\\Users\\Rajesh kumar\\eclipse-workspace\\FrameWork1\\TestData\\TestData.xlsx");
    	 
    	 FileInputStream stream = new FileInputStream(file);
    	 
    	 Workbook workbook = new XSSFWorkbook(stream);
    	 
    	 Sheet sheet = workbook.getSheet("Sheet1");
    	 
    	 Row row = sheet.getRow(rowNum);
    	 
    	 Cell cell = row.getCell(cellNum);
    	 
    	 String value = cell.getStringCellValue();
    	 
    	 if (value.equals(oldData)) {
    		 cell.setCellValue(newData);
			
		} 
    	 
    	 FileOutputStream out = new FileOutputStream(file);
    	 
    	 workbook.write(out);
			
			
     }
		
     /**
      * 
      * @param sheetName
      * @param rowNum
      * @param cellNum
      * @param data
      * @throws IOException
      * @see Write the cell values in the Excel Sheet
      * 
      */
    		 
    	 
	public void writeCellData(String sheetName,int rowNum, int cellNum,String data) throws IOException {
		
		 File file = new File("C:\\Users\\Rajesh kumar\\eclipse-workspace\\FrameWork1\\TestData\\TestData.xlsx");
    	 
    	 FileInputStream stream = new FileInputStream(file);
    	 
    	 Workbook workbook = new XSSFWorkbook(stream);
    	 
    	 Sheet sheet = workbook.getSheet(sheetName);
    	 
    	 Row row = sheet.getRow(rowNum);
    	 
    	 Cell cell = row.createCell(cellNum);
    	 
    	 cell.setCellValue(data);
    	 
    	 FileOutputStream out =  new FileOutputStream (file);
    	 
    	 workbook.write(out);
    	 
		
		
		
	}

}
