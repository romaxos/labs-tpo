package domaintools;

import drivers.BrowserDrivers;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest {

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

    @Test
    @DisplayName("Research button click test")
    public void researchButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            mainPage.researchButtonClick();
            assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://research.domaintools.com/");
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            mainPage.inputIpAddress("main");

        });
    }

    @Test
    @DisplayName("Support button click test")
    public void supportButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            mainPage.supportButtonClick();
            assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://www.domaintools.com/support");
        });
    }

    @Test
    @DisplayName("Demo button click test")
    public void demoButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            mainPage.demoButtonClick();
            assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://www.domaintools.com/demo");
        });
    }

    @Test
    @DisplayName("Login button click test")
    public void loginButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            mainPage.loginButtonClick();
            assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://account.domaintools.com/log-in/?r=http%3A/whois.domaintools.com");
        });
    }

    @Test
    @DisplayName("Iris detect button click test")
    public void irisDetectButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            try {
                JavascriptExecutor jse = (JavascriptExecutor) mainPage.getWebDriver();
                jse.executeScript("window.scrollBy(0,2000)", "");
                mainPage.irisDetectClick();
                TimeUnit.SECONDS.sleep(2);
                mainPage.discoverDetectButtonClick();
                assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://www.domaintools.com/products/iris-detect");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    @DisplayName("Intelligence button click test")
    public void intelligenceButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            try {
                JavascriptExecutor jse = (JavascriptExecutor) mainPage.getWebDriver();
                jse.executeScript("window.scrollBy(0,3400)", "");
                TimeUnit.SECONDS.sleep(2);
                mainPage.intelligenceButtonClick();
                assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://www.domaintools.com/use-cases/threat-intelligence/");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    @DisplayName("APIs button click test")
    public void apisButtonClickTest() {
        mainPageMap.forEach((key, mainPage) -> {
            try {
                mainPage.productButtonClick();
                TimeUnit.SECONDS.sleep(2);
                mainPage.apisButtonClick();
                assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://www.domaintools.com/products/api-integration");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    @DisplayName("Research process test")
    public void researchProcessTest() {
        mainPageMap.forEach((key, mainPage) -> {
            try {
                mainPage.researchButtonClick();
                assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://research.domaintools.com/");
                TimeUnit.SECONDS.sleep(2);
                mainPage.inputIpAddress("hello");
                TimeUnit.SECONDS.sleep(2);
                mainPage.goSearchButtonClick();
                TimeUnit.SECONDS.sleep(20);
                assertEquals(mainPage.getWebDriver().getCurrentUrl(), "https://whois.domaintools.com/hello.com");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
