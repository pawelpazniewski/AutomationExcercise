package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLogged {
    @FindBy (xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a")
    WebElement loggedAs;

    @FindBy (partialLinkText = "Delete Account")
    public WebElement deleteButton;

    @FindBy (partialLinkText = "Logout")
    WebElement logoutButton;

    public String loggedInUser (){
        String loggedUser = loggedAs.getText();
        return loggedUser;
    }
    public void logout() {
        logoutButton.click();
    }

}
