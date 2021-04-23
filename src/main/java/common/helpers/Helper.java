package common.helpers;

import common.Constant;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Helper {
    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    public static void scrollToView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Constant.WEBDRIVER;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
