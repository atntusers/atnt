package com.atnt.pages;

import org.openqa.selenium.WebDriver;


public class ATnTPageFactory {
	private ATnTHomePage ATnTHomePage;// = new ATnTHomePage();
	
	public ATnTPageFactory(WebDriver driver){
		ATnTHomePage = new ATnTHomePage(driver);
	}


	public ATnTHomePage getATnTHomePage() {
		return ATnTHomePage;
	}
	
	
}