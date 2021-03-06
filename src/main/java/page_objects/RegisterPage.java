package page_objects;

import helpers.BrowserHelper;
import helpers.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {
    private final By txtEmail = By.id("email");
    private final By txtPassword = By.id("password");
    private final By txtConfirmPassword = By.id("confirmPassword");
    private final By txtPid = By.id("pid");
    private final By btnRegister = By.cssSelector("input[title='Register']");
    private final By lblErrorMessage = By.cssSelector(".message.error");
    private final By lblConfirmMessage = By.cssSelector("#content p");
    private final By lblPasswordErrorMsg = By.xpath("//label[@for='password' and @class='validation-error']");
    private final By lblPidErrorMsg = By.xpath("//label[@for='pid' and @class='validation-error']");

    private WebElement getTxtEmail() {
        return BrowserHelper.getDriver().findElement(txtEmail);
    }

    private WebElement getTxtPassword() {
        return BrowserHelper.getDriver().findElement(txtPassword);
    }

    private WebElement getTxtConfirmPassword() {
        return BrowserHelper.getDriver().findElement(txtConfirmPassword);
    }

    private WebElement getTxtPid() {
        return BrowserHelper.getDriver().findElement(txtPid);
    }

    private WebElement getBtnRegister() {
        return BrowserHelper.getDriver().findElement(btnRegister);
    }

    private WebElement getLblErrorMessage() {
        return BrowserHelper.getDriver().findElement(lblErrorMessage);
    }

    private WebElement getLblConfirmMessage() {
        return BrowserHelper.getDriver().findElement(lblConfirmMessage);
    }

    private WebElement getLblPasswordErrorMsg() {
        return BrowserHelper.getDriver().findElement(lblPasswordErrorMsg);
    }

    private WebElement getLblPidErrorMsg() {
        return BrowserHelper.getDriver().findElement(lblPidErrorMsg);
    }

    public String getErrorMessage() {
        return this.getLblErrorMessage().getText();
    }

    public String getConfirmMessage() {
        return this.getLblConfirmMessage().getText();
    }

    public String getPasswordErrorMsg() {
        return this.getLblPasswordErrorMsg().getText();
    }

    public String getPidErrorMsg() {
        return this.getLblPidErrorMsg().getText();
    }

    //Methods
    public void register(String email, String password, String confirmPassword, String pid) {
        getTxtEmail().clear();
        this.getTxtEmail().sendKeys(email);

        getTxtPassword().clear();
        this.getTxtPassword().sendKeys(password);

        getTxtConfirmPassword().clear();
        this.getTxtConfirmPassword().sendKeys(confirmPassword);

        getTxtPid().clear();
        this.getTxtPid().sendKeys(pid);

        ElementHelper.scrollToView(getBtnRegister());
        this.getBtnRegister().click();
    }
}
