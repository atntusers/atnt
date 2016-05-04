package com.selenium.web.base;

import jxl.write.WritableWorkbook;

import org.apache.commons.lang3.time.StopWatch;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.atnt.framework.common.SeleniumDriverUtil;
import com.atnt.framework.common.TestSession;
import com.atnt.framework.common.WriteExcel;
import com.atnt.pages.ATnTPageFactory;

public class WebTestCase {
	private SeleniumDriverUtil selenium = new SeleniumDriverUtil();
	protected WebDriver driver = selenium.getDriver();
	private WritableWorkbook workbook;
	private TestSession session;
	private ATnTPageFactory pageFactory;
	private StopWatch stopWatch = new StopWatch();

	public WebTestCase() {
	    session = new TestSession();
        setDriver(driver);
        pageFactory = new ATnTPageFactory(driver);
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
	 //   super.setDriver(driver);
		this.driver = driver;
	}
	
	public WritableWorkbook getWorkbook() {
		return workbook;
	}

	public void setWorkbook(WritableWorkbook workbook) {
		this.workbook = workbook;
	}

	public TestSession getSession() {
		return session;
	}

	public void setSession(TestSession session) {
		this.session = session;
	}

	public ATnTPageFactory getPageFactory() {
		return pageFactory;
	}

	public void setPageFactory(ATnTPageFactory pageFactory) {
		this.pageFactory = pageFactory;
	}
	
	
	
	@AfterSuite(alwaysRun=true)
	public void closeBrowser() {
      /// ds.closeFile();
	    WriteExcel.getInstance().closeFile();
	}
	
	@AfterMethod(alwaysRun = true)
	public void closeMenu() {
		// getPageFactory().getHome().closeMenu();
	}

	public StopWatch getStopWatch() {
		return stopWatch;
	}

	public void setStopWatch(StopWatch stopWatch) {
		this.stopWatch = stopWatch;
	}
}