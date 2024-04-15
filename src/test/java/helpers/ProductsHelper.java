package helpers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.ApplicationManager;

public class ProductsHelper extends HelperBase {

    public ProductsHelper(ApplicationManager manager) {
        super(manager);
    }

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement productTitle;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement addToCartButton;

    public String getProductTitle() {
        return productTitle.getText();
    }

    public void addProductToCart() {
        addToCartButton.click();
    }
}
