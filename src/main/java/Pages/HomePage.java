package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(partialLinkText = "Signup / Login")
    WebElement signupLink;

    @FindBy(partialLinkText = "Contact us")
    WebElement contactUslink;


    public void openLoginPage() {

        signupLink.click();
    }

    public void openContactPage() {
        contactUslink.click();
    }
}
