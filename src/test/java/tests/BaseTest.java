package tests;

import helpers.BrowserHelper;
import helpers.Constant;
import org.testng.annotations.*;

public class BaseTest {
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Pre-condition");
        BrowserHelper.startBrowser(BrowserHelper.DriverType.FIREFOX);
        BrowserHelper.navigateToUrl(Constant.RAILWAY_URL);
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Post-condition");
        BrowserHelper.quitBrowser();
    }
}
