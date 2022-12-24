import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


public class RegisterUser extends BaseTest {
    @Test(priority = 1)
    public void HomepageVisible() {
        assert BASE_URL.equals(driver.getCurrentUrl());
        homePage.openLoginPage();

    }

    @Test(priority = 2)
    public void newUserSignupVisible() {
        loginPage.newSignupVisible();
    }


    @Test(priority = 3)
    public void enterAccountInfoVisible() {
        loginPage.enterName(userNameRandom);
        loginPage.enterEmail(emailRandom);
        loginPage.signup();
        signupPage.enterAccountInfoTextVisible();

    }

    @Test(priority = 4)
    public void populateUserData() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");
        signupPage.enterPassword(passwdRandom);
        signupPage.selectDateOfBirth();
        signupPage.selectGenderMale();
        signupPage.newsletterOptIn();
        signupPage.populateAddress();
        signupPage.signup();
    }

    @Test(priority = 5)
    public void verifyIfConfirmationMessageIsDisplayed() throws InterruptedException {
        accountCreatedPage.verifyAccountCreatedIsDisplayed();
        accountCreatedPage.pressContinue();
    }

    @Test(priority = 6)
    public void verifyCorrectUserLoggedIn() {
        String loggedUser = "Logged in as " + userNameRandom;
        assert loggedUser.equals(homePageLogged.loggedInUser());

    }
    @Test (priority = 7)
    public void deleteAccount (){
        homePageLogged.deleteButton.click();
        assert accountDeletedPage.accountDeletedHeader.isDisplayed();

    }


}
