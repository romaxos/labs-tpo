package domaintools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class MainPage {

    @FindBy(xpath = "/html/body/nav[2]/div/div[2]/div/ul[1]/li[1]/a")
    public WebElement useCasesButton;

    public WebDriver webDriver;


    public MainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
        this.webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void clickUseCasesButton() {
        this.useCasesButton.click();
    }
}
