import domaintools.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest {

    static BrowserDrivers BrowserDrivers;
    static HashMap<String, MainPage> MainPageMap;


    @BeforeAll
    public static void loadPage() throws IOException {
        BrowserDrivers = new BrowserDrivers();
        MainPageMap = new HashMap<String, MainPage>();
        BrowserDrivers.drivers.forEach((key, driver) -> driver.get("https://www.domaintools.com/"));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS));
        BrowserDrivers.drivers.forEach((key, driver) -> MainPageMap.put(key, new MainPage(driver)));
        BrowserDrivers.drivers.forEach((key, driver) -> driver.manage().window().setSize(new Dimension(1024, 1024)));
    }

    @BeforeEach
    @AfterEach
    public void timeOut() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
    }

    @Test
    @DisplayName("use cases button test")
    public void useCasesButtonTest() {
        MainPageMap.forEach((key, mainPage) -> assertTrue(mainPage.useCasesButton.isDisplayed()));
    }

    @AfterAll
    public static void closeUp() throws InterruptedException {
        BrowserDrivers.closeBrowser();
    }
}
