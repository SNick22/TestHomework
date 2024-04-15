package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.ApplicationManager;

public class HelperBase {

    protected WebDriver driver;
    protected ApplicationManager manager;

    protected HelperBase(ApplicationManager manager) {
        this.manager = manager;
        this.driver = manager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
