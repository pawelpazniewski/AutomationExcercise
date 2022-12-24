import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

/*
Description: Purpose of this test case is to verify if user can successfully populate and send contact form
 */
public class ContactForm extends BaseTest {
    @Test(priority = 1)
    public void HomepageVisible() {
        assert BASE_URL.equals(driver.getCurrentUrl());
        homePage.openContactPage();

    }

    @Test(priority = 2)
    public void populateForm() {
        contactUsPage.populateFormData();

    }

    @Test(priority = 3)
    public void uploadFile() {
        contactUsPage.uploadFile();

    }

    @Test (priority = 4)
    public void sendForm (){
        contactUsPage.submitButtonClick();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test (priority = 5)
    public void verifyConfirmation () {
        contactUsPage.verifyConfirmationText();
    }


}
