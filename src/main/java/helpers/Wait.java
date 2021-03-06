package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    public static void untilElementExist(By locator, int seconds) {
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static boolean forTitle(String title, int seconds) {
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getDriver(), seconds);
        return wait.until(ExpectedConditions.titleIs(title));
    }

    public static void untilVisibilityOfNestedElements(By locator, By child, int seconds) {
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getDriver(), seconds);
        wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(locator, child));
    }

    public static void notStalenessOf(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getDriver(), seconds);
        wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(element)));
    }

    public static void untilAlertPopupExist(int seconds) {
        WebDriverWait wait = new WebDriverWait(BrowserHelper.getDriver(), seconds);
        wait.until(ExpectedConditions.alertIsPresent());
    }
}
