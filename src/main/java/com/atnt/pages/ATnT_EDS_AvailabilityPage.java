package com.atnt.pages;

import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.selenium.atnt.common.Common;
import com.atnt.pages.Elements;
import com.atnt.framework.common.TestSession;

/**
 * This class contains total functionality related to At&t home page - www.att.com
 * 
 * @author prashant kumar
 *
 *  
 */
public class ATnT_EDS_AvailabilityPage {

    private WebDriver driver;// = selenium.getDriver();
    private Common common;// = new Common();
	private TestSession session;
	//# private Logger logger = Logger.getLogger(SmokeTest.class.getName());

	@FindBy(xpath = Elements.primaryNavHomeLogoLink)
	private WebElement PrimaryNavHomeLogoLink;
	
	@FindBy(xpath = Elements.primaryNavShopLink)
	private WebElement PrimaryNavShopLink;
	
		@FindBy(xpath = Elements.primaryNavShopWirelessLink)
		private WebElement PrimaryNavShopWirelessLink;
			@FindBy(xpath = Elements.primaryNavShopWirelessSmartPhone)
			private WebElement PrimaryNavShopWirelessSmartPhone;
		
	
	@FindBy(xpath = Elements.primaryNavMyATnTLink)
	private WebElement PrimaryNavMyATnTLink;
	
	@FindBy(xpath = Elements.primaryNavSupportLink)
	private WebElement PrimaryNavSupportLink;
	
	@FindBy(xpath = Elements.primaryNavSearchBox)
	private WebElement PrimaryNavSearchBox;

	public ATnT_EDS_AvailabilityPage(WebDriver driver2) {
	    driver = driver2;
	    common = new Common(driver);
		PageFactory.initElements(driver2, this);
		session = new TestSession();
	}


	/**
	 *   Method to click all Primary Nav Links
	 */
	public void ClickonPrimaryNav_AllLinks_And_SearchBox() {
		common.impicitWait(10);
		//common.explicitWait(By.xpath(Elements.primaryNavHomeLogoLink));
		//PrimaryNavHomeLogoLink.click();
		//common.impicitWait(10);
		//Reporter.log("-clicked on PrimaryNavHomeLogoLink -", true);		
		common.moveto(PrimaryNavShopLink);
		common.explicitWait(By.xpath(Elements.primaryNavShopWirelessLink));
		common.impicitWait(10);
		common.moveto(PrimaryNavShopWirelessLink);
		common.explicitWait(By.xpath(Elements.primaryNavShopWirelessSmartPhone));
		common.impicitWait(10);
		PrimaryNavShopWirelessSmartPhone.click();
		Reporter.log(" - clicked on PrimaryNavShopWirelessSmartPhone -", true);
		common.impicitWait(10);
	}

 }
