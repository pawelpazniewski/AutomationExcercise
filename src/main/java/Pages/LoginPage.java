package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2")
    WebElement newSignup;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
    WebElement loginEmailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
    WebElement loginPasswordInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement signupNameInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement signupEmailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement signupButton;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
    WebElement loginButton;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/p")
    WebElement incorrectLoginErrorMessage;


    public void newSignupVisible() {
        assert newSignup.isDisplayed();

    }


    public void signup() {
        signupButton.click();
    }

    public void enterName(String name) {
        signupNameInput.sendKeys(name);

    }

    public void enterEmail(String email) {
        signupEmailInput.sendKeys(email);

    }

    public void enterLoginCredentials(String email, String password){
        loginEmailInput.sendKeys(email);
        loginPasswordInput.sendKeys(password);
        loginButton.click();

    }

    public void verifyLoginErrorMessage(){
        String expectedErrorMessage = "Your email or password is incorrect!";
       String errorMessage = incorrectLoginErrorMessage.getText();
       assert expectedErrorMessage.equals(errorMessage);
    }
}
