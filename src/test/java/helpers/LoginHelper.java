package helpers;

import model.LoginData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.ApplicationManager;

public class LoginHelper extends HelperBase {

    public LoginHelper(ApplicationManager manager) {
        super(manager);
    }

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement usernameField;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement loginButton;

    private void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    private void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void login(LoginData data) {
        enterUsername(data.username());
        enterPassword(data.password());
        loginButton.click();
    }
}
