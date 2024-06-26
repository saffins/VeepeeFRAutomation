
package com.ecommerce.WebApp.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;



/**
 * This BaePage class extends the Page class and implements all the methods present

 *
 */
public class BasePage extends Page {

	public Logger logger=Logger.getLogger( BasePage.class.getName());
	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElement(locator).getText();
	}

	@Override
	public WebElement getElement(By locator)throws NoSuchElementException{
		WebElement element=null;
		try
		{
		return driver.findElement(locator) ;
		}catch (NoSuchElementException e)
		{
			logger.error(locator+"  Element could Not Be found on DOM");
			e.printStackTrace();
			throw e;
		}
	
	}

	@Override
	public void waitForElementToBePresent(By locator)throws TimeoutException {
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}catch (TimeoutException e)
		{
			logger.error(locator+"  Element could Not Be found on DOM Within given wait time");
			e.printStackTrace();
		}
	}

	@Override
	public void waitForPageTitle(String title) {
		wait.until(ExpectedConditions.titleContains(title));
		
	}
	
	@Override
	public void waitForFrame(By locator) {
		try
		{
		 wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		}catch (Exception e)
		{
			logger.error(locator+"  Frame is not available");
			e.printStackTrace();
		}
	}
	
	public void waitForElementToBeClickable(By locator) {
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		}catch (Exception e)
		{
			logger.error(locator+"  Element Is not clickable");
			e.printStackTrace();
		}
	}

	public void hoverOnElement(By locator){
		try{
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(locator)).build().perform();

		}catch (Exception e){

		}
	}
	

}
