package tests;

import model.LoginData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        LoginData data = new LoginData("standard_user", "secret_sauce");
        manager.getNavigationHelper().openLoginPage();
        manager.getLoginHelper().login(data);
        String expectedUrl = manager.getBaseUrl() + "inventory.html";
        String actualUrl = manager.getDriver().getCurrentUrl();
        assertEquals(expectedUrl, actualUrl);
    }
}
