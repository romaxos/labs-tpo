package domaintools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {

    private final WebDriver webDriver;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[1]/a")
    private WebElement useCasesButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[2]/a")
    private WebElement productButtonCheck;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[3]/a")
    private WebElement integrationsButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[4]/a")
    private WebElement partnersButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[5]/a")
    private WebElement resourcesButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[6]/a")
    private WebElement companyButton;


    @FindBy(xpath = "/html/body/nav[1]/div/ul/li[2]/a")
    private WebElement researchButton;

    @FindBy(xpath = "/html/body/nav[1]/div/ul/li[3]/a")
    private WebElement supportButton;

    @FindBy(xpath = "/html/body/section/section/section[1]/div/div/div[1]/div/a/span[1]")
    private WebElement demoButton;

    @FindBy(xpath = "/html/body/section/section/section[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/a/span[1]")
    private WebElement discoverDetectButton;

    @FindBy(xpath = "/html/body/section/section/section[3]/div[2]/div/div[1]/div/span[1]")
    private WebElement irisDetectButton;

    @FindBy(xpath = "/html/body/section/section/section[5]/div[2]/div/div[1]/div/div[1]/div/a/div")
    private WebElement intelligenceButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[2]/a")
    private WebElement productButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[2]/div/div/div/div/div[1]/div/div/ul/li[6]/a/div/span[2]")
    private WebElement apisButton;

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[2]/li[2]/a")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/div/div/input")
    private WebElement ipAddressField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[2]/div[2]/form/div[2]/button")
    private WebElement goSearchButton;

    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void researchButtonClick() {
        researchButton.click();
    }

    public void supportButtonClick() {
        supportButton.click();
    }

    public void demoButtonClick() {
        demoButton.click();
    }

    public void discoverDetectButtonClick() {
        discoverDetectButton.click();
    }

    public void irisDetectClick() {
        irisDetectButton.click();
    }

    public void intelligenceButtonClick() {
        intelligenceButton.click();
    }

    public void productButtonClick() {
        productButton.click();
    }

    public void apisButtonClick() {
        apisButton.click();
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public void goSearchButtonClick() {
        goSearchButton.click();
    }

    public void inputIpAddress(String ip) {
        ipAddressField.sendKeys(ip);
    }

    public WebElement getUseCasesButton() {
        return useCasesButton;
    }

    public WebElement getProductButtonCheck() {
        return productButtonCheck;
    }

    public WebElement getIntegrationsButton() {
        return integrationsButton;
    }

    public WebElement getPartnersButton() {
        return partnersButton;
    }

    public WebElement getResourcesButton() {
        return resourcesButton;
    }

    public WebElement getCompanyButton() {
        return companyButton;
    }
}
