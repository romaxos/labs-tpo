import domaintools.LoginPage;
import domaintools.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {
    static BrowserDrivers browserDrivers;
    static HashMap<String, LoginPage> loginPageMap;

    @BeforeEach
    public void setUp() throws IOException {
        browserDrivers = new BrowserDrivers();
        loginPageMap = new HashMap<>();
        browserDrivers.drivers.forEach((key, driver) -> driver.get("https://account.domaintools.com/log-in/?r=http%3A/whois.domaintools.com"));
        browserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        browserDrivers.drivers.forEach((key, driver) -> loginPageMap.put(key, new LoginPage(driver)));
        browserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
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

    @Test
    @DisplayName("Login process test")
    public void loginProcessTest() {
        loginPageMap.forEach((key, loginPage) -> {
            try {
                TimeUnit.SECONDS.sleep(20);
                loginPage.inputEmail("ares@god.com");
                TimeUnit.SECONDS.sleep(1);
                loginPage.nextButtonClick();
                TimeUnit.SECONDS.sleep(2);
                loginPage.inputPassword("greece");
                TimeUnit.SECONDS.sleep(1);
                loginPage.signButtonClick();
                TimeUnit.SECONDS.sleep(2);
                assertTrue(loginPage.getErrorLoginMessage().isDisplayed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }


}
