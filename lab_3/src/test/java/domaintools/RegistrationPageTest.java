package domaintools;

import domaintools.LoginPage;
import domaintools.MainPage;
import drivers.BrowserDrivers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationPageTest {

    static BrowserDrivers browserDrivers;
    static HashMap<String, MainPage> mainPageMap;

    @BeforeEach
    public void setUp() throws IOException {
        browserDrivers = new BrowserDrivers();
        mainPageMap = new HashMap<>();
        browserDrivers.getDrivers().forEach((key, driver) -> driver.get("https://www.domaintools.com/"));
        browserDrivers.getDrivers().forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        browserDrivers.getDrivers().forEach((key, driver) -> mainPageMap.put(key, new MainPage(driver)));
        browserDrivers.getDrivers().forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }


    @AfterEach
    public void closeWindow() {
        browserDrivers.closeBrowser();
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }
}
