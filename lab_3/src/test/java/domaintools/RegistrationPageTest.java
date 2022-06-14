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
    static HashMap<String, RegistrationPage> registrationPageMap;

    @BeforeEach
    public void setUp() throws IOException {
        browserDrivers = new BrowserDrivers();
        registrationPageMap = new HashMap<>();
        browserDrivers.getDrivers().forEach((key, driver) -> driver.get("https://secure.domaintools.com/join/"));
        browserDrivers.getDrivers().forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        browserDrivers.getDrivers().forEach((key, driver) -> registrationPageMap.put(key, new RegistrationPage(driver)));
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
    @DisplayName("Registration process test")
    public void registrationProcessTest() {
        registrationPageMap.forEach((key, loadPage) -> {
            try {
                loadPage.typeSubscriptionFieldClick();
                TimeUnit.SECONDS.sleep(2);
                loadPage.nextRegistrationButtonClick();
                TimeUnit.SECONDS.sleep(2);
                assertEquals(loadPage.getWebDriver().getCurrentUrl(), "https://secure.domaintools.com/join/checkout/");
                loadPage.inputFirstName("air");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputLastName("jordan");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputEmailAddress("nike@force.adidas");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputPassword("LolKekFall228");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputRepeatPassword("LolKekFall228");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputNameOnCard("Air Plane");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputBillingAddress("I don't know");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputCityField("Kasablanca");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputState("virginia");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputPostalCode("12345");
                TimeUnit.SECONDS.sleep(1);
                loadPage.inputPhoneNumber("69696969");
                TimeUnit.SECONDS.sleep(1);
                loadPage.privatePolicyButtonClick();
                TimeUnit.SECONDS.sleep(1);
                loadPage.goRegistrationButtonClick();
                TimeUnit.SECONDS.sleep(1);
                assertTrue(loadPage.getErrorRegistration().isDisplayed());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
