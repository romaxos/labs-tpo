package domaintools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {
    private final WebDriver webDriver;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/div[2]/div[2]/div[3]/div/div[2]/div[2]/input")
    private WebElement typeSubscriptionField;

    @FindBy(xpath = "/html/body/div[2]/div[2]/form/div[5]/div[3]/button")
    private WebElement nextRegistrationButton;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[4]/div[2]/input")
    private WebElement firstNameField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[5]/div[2]/input")
    private WebElement lastNameField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[6]/div[2]/input")
    private WebElement emailAddressField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[7]/div[2]/input")
    private WebElement passwordField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[8]/div[2]/input")
    private WebElement repeatPasswordField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[2]/div[2]/input")
    private WebElement nameOnCardField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[4]/div[2]/input")
    private WebElement billingAddressField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[7]/div[2]/input")
    private WebElement cityField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[8]/div[4]/div[1]/input")
    private WebElement stateField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[8]/div[4]/div[2]/div/input")
    private WebElement postalCodeField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[12]/div[9]/div[2]/input")
    private WebElement phoneNumberField;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[14]/div/div[2]/input")
    private WebElement privatePolicyButton;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[15]/div/button")
    private WebElement goRegistrationButton;

    @FindBy(name = "/html/body/div[2]/div[2]/div[1]/form/div[11]/div/span[2]")
    private WebElement errorRegistration;

    public RegistrationPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public WebElement getErrorRegistration() {
        return errorRegistration;
    }

    public void typeSubscriptionFieldClick() {
        typeSubscriptionField.click();
    }

    public void nextRegistrationButtonClick() {
        nextRegistrationButton.click();
    }

    public void privatePolicyButtonClick() {
        privatePolicyButton.click();
    }

    public void goRegistrationButtonClick() {
        goRegistrationButton.click();
    }

    public void inputFirstName(String name) {
        firstNameField.sendKeys(name);
    }

    public void inputLastName(String name) {
        lastNameField.sendKeys(name);
    }

    public void inputEmailAddress(String email) {
        emailAddressField.sendKeys(email);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void inputRepeatPassword(String password) {
        repeatPasswordField.sendKeys(password);
    }

    public void inputNameOnCard(String name) {
        nameOnCardField.sendKeys(name);
    }

    public void inputBillingAddress(String address) {
        billingAddressField.sendKeys(address);
    }

    public void inputCityField(String name) {
        cityField.sendKeys(name);
    }

    public void inputState(String state) {
        stateField.sendKeys(state);
    }

    public void inputPostalCode(String code) {
        postalCodeField.sendKeys(code);
    }

    public void inputPhoneNumber(String number) {
        phoneNumberField.sendKeys(number);
    }




}
