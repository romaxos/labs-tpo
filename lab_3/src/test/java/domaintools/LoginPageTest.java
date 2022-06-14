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

public class LoginPageTest {
    static BrowserDrivers browserDrivers;
    static HashMap<String, LoginPage> loginPageMap;

    @BeforeEach
    public void setUp() throws IOException {
        browserDrivers = new BrowserDrivers();
        loginPageMap = new HashMap<>();
        browserDrivers.getDrivers().forEach((key, driver) -> driver.get("https://account.domaintools.com/log-in/?r=http%3A/whois.domaintools.com"));
        browserDrivers.getDrivers().forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        browserDrivers.getDrivers().forEach((key, driver) -> loginPageMap.put(key, new LoginPage(driver)));
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

    @Test
    @DisplayName("Registration button click test")
    public void registrationButtonClickTest() {
        loginPageMap.forEach((key, loadPage) -> {
            try {
                TimeUnit.SECONDS.sleep(20);
                loadPage.registrationButtonClick();
                assertEquals(loadPage.getWebDriver().getCurrentUrl(), "https://secure.domaintools.com/join/");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
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

    @Test
    @DisplayName("Forgot password process test")
    public void forgotPasswordProcessTest() {
        loginPageMap.forEach((key, loginPage) -> {
            try {
                TimeUnit.SECONDS.sleep(20);
                loginPage.inputEmail("ares@god.com");
                TimeUnit.SECONDS.sleep(1);
                loginPage.nextButtonClick();
                TimeUnit.SECONDS.sleep(2);
                loginPage.forgotPasswordButtonClick();
                TimeUnit.SECONDS.sleep(2);
                assertEquals(loginPage.getWebDriver().getCurrentUrl(), "https://account.domaintools.com/log-in/?forgot-password");
                loginPage.inputEmailWhenForgotPassword("kaif@kaif.kaif");
                TimeUnit.SECONDS.sleep(2);
                loginPage.nexButtonRecoveryPasswordButtonClick();
                TimeUnit.SECONDS.sleep(2);
                assertTrue(loginPage.getInfoRecoveryPassword().isDisplayed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }




}
