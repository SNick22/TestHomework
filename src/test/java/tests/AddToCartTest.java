package tests;

import model.LoginData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddToCartTest extends TestBase {

    @Test
    public void addToCartTest() {
        LoginData loginData = new LoginData("standard_user", "secret_sauce");
        manager.getNavigationHelper().openLoginPage();
        manager.getLoginHelper().login(loginData);
        manager.getProductsHelper().addProductToCart();
        String addedProductTitle = manager.getProductsHelper().getProductTitle();
        manager.getNavigationHelper().goToCart();
        String inCartProductTitle = manager.getCartHelper().getProductTitle();
        manager.getCartHelper().remoteProductFromCart();
        assertEquals(addedProductTitle, inCartProductTitle);
    }
}
