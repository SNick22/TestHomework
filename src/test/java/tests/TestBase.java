package tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class TestBase {

    protected static ApplicationManager manager;

    @BeforeClass
    public static void setup() {
        manager = new ApplicationManager();
    }

    @AfterClass
    public static void stop() {
        manager.stop();
    }
}
