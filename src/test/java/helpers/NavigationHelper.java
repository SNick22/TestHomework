package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.ApplicationManager;

public class NavigationHelper extends HelperBase {

    private final String baseUrl;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a")
    private WebElement goToCartButton;

    public NavigationHelper(ApplicationManager manager, String baseUrl) {
        super(manager);
        this.baseUrl = baseUrl;
    }

    public void openLoginPage() {
        driver.get(baseUrl);
    }

    public void goToCart() {
        goToCartButton.click();
    }
}
