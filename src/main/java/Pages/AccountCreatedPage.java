package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage {

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement accCreated;

    @FindBy (linkText = "Continue")
    WebElement continueButton;

    public void verifyAccountCreatedIsDisplayed(){
        assert accCreated.isDisplayed();
    }

    public void pressContinue(){
        continueButton.click();
    }
}
