package com.selenium.web.sanity;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.selenium.atnt.common.Common;
import com.selenium.web.base.WebTestCase;
import com.atnt.framework.common.Retry;
import com.atnt.framework.common.Screenshot;
import com.atnt.framework.dto.UserObj;

@Listeners({ Screenshot.class })
public class ATnTHomeTest extends WebTestCase {
    private Common common = new Common(driver);
	private Logger logger = Logger.getLogger(ATnTHomeTest.class.getName()); 

    private WebDriver driver2 = driver;
    private UserObj usr = null;
 
    @BeforeClass
    public void initialize(ITestContext testContext) {
        testContext.setAttribute("driver", driver2);
        usr = (UserObj) getSession().getUsers().get("prod1");

        getDriver().manage().deleteAllCookies();
        common.impicitWait(4);
        getDriver().manage().window().maximize();
        getDriver().get(getSession().getEnv().getUrl());
        getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
       // getPageFactory().getLogin().loginToApp(usr.getUserName(),
       //         usr.getPassword());
    }

    @AfterClass
    public void closeBrowser() {
        // / ds.closeFile();
        // WriteExcel.getInstance().closeFile();
        driver.manage().deleteAllCookies();
        driver.quit();
    }
    @Test(testName = "Clicking_PrimaryNav_AllLinks", description = "testcaseID:101==>Home==>Click around on the Home page and click on all top the links", timeOut = 1190000, retryAnalyzer = Retry.class, enabled = true, groups = {
			"sanity", "101", "home", "regression" })
	public void Clicking_PrimaryNav_AllLinks() {
		try {
			getPageFactory().getATnTHomePage().ClickonPrimaryNav_AllLinks_And_SearchBox();
		} catch (Exception e) {
			getDriver().get(getSession().getEnv().getUrl());
			Assert.assertTrue(false, "test case one failed verifying home page links");
		}
	}
}