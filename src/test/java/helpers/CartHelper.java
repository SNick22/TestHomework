package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.ApplicationManager;

public class CartHelper extends HelperBase {

    public CartHelper(ApplicationManager manager) {
        super(manager);
    }

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement productTitle;

    @FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    private WebElement removeFromCartButton;

    public String getProductTitle() {
        return productTitle.getText();
    }

    public void remoteProductFromCart() {
        removeFromCartButton.click();
    }
}
