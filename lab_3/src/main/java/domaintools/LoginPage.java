package domaintools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private final WebDriver webDriver;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[2]/div/input")
    private WebElement emailField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[3]/button/span/span")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[3]/div/input")
    private WebElement passwordField;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[5]/button/span/span")
    private WebElement signButton;

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/div[2]/form/div[5]/div[2]/div")
    private WebElement errorLoginMessage;

    public LoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebElement getErrorLoginMessage() {
        return errorLoginMessage;
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void nextButtonClick() {
        nextButton.click();
    }

    public void signButtonClick() {
        signButton.click();
    }
}
