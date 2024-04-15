package tests;

import helpers.CartHelper;
import helpers.LoginHelper;
import helpers.NavigationHelper;
import helpers.ProductsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class ApplicationManager {

    private final WebDriver driver;
    private final String baseUrl;
    private final LoginHelper loginHelper;
    private final NavigationHelper navigationHelper;
    private final ProductsHelper productsHelper;
    private final CartHelper cartHelper;

    public ApplicationManager() {
        baseUrl = "https://www.saucedemo.com/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
        loginHelper = new LoginHelper(this);
        navigationHelper = new NavigationHelper(this, baseUrl);
        productsHelper = new ProductsHelper(this);
        cartHelper = new CartHelper(this);
    }

    public void stop() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public LoginHelper getLoginHelper() {
        return loginHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ProductsHelper getProductsHelper() {
        return productsHelper;
    }

    public CartHelper getCartHelper() {
        return cartHelper;
    }
}
