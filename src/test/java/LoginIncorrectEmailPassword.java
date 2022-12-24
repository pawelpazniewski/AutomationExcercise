import org.testng.annotations.Test;

     /*
     Description:
     Purpose of this test case is to verify if correct error message is thrown whenever user is trying to log in using
     non-existing credentials.
     */

public class LoginIncorrectEmailPassword extends BaseTest {


    @Test(priority = 1)
    public void HomepageVisible() {
        //Step 1. Open URL and verify that correct landing page is loaded
        assert BASE_URL.equals(driver.getCurrentUrl());
        //Step 2. Navigate to Log in / Signup Page
        homePage.openLoginPage();

    }


    @Test(priority = 2)
    public void failedLoginWithIncorrectCredentials() {
        //Step 3. Enter random user credentials and press Login button
        loginPage.enterLoginCredentials(emailRandom, passwdRandom);
        //Step 4. Verify that correct error message is displayed
        loginPage.verifyLoginErrorMessage();
    }

}
