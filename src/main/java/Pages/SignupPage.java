package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    WebElement enterAccountInfoText;

    @FindBy(id = "id_gender1")
    WebElement mr;

    @FindBy(id = "id_gender2")
    WebElement mrs;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement passwordInput;

    @FindBy(id = "days")
    WebElement dayDrop;

    @FindBy(id = "months")
    WebElement monthDrop;

    @FindBy(id = "years")
    WebElement yearDrop;

    @FindBy (id= "optin")
    WebElement optIn;

    @FindBy (id = "newsletter")
    WebElement newsletter;

    @FindBy (id ="first_name")
    WebElement firstName;

    @FindBy (id ="last_name")
    WebElement lastName;

    @FindBy (id ="address1")
    WebElement address;


    @FindBy (id ="country")
    WebElement country;

    @FindBy (id ="state")
    WebElement state;

    @FindBy (id ="city")
    WebElement city;

    @FindBy (id ="zipcode")
    WebElement zipcode;

    @FindBy (id ="mobile_number")
    WebElement mobileNumber;

    @FindBy (xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    WebElement signupButton;






    public void enterAccountInfoTextVisible() {
        assert enterAccountInfoText.isDisplayed();
    }

    //
    public void enterPassword(String password) {
        passwordInput.sendKeys(password);


    }

    public void selectDateOfBirth() {
        Select dayDropdown = new Select(dayDrop);
        Select monthDropdown = new Select(monthDrop);
        Select yearDropdown = new Select(yearDrop);
        dayDropdown.selectByValue("1");
        monthDropdown.selectByValue("1");
        yearDropdown.selectByValue("1987");
    }

    public void selectGenderMale() {
        mr.click();
    }

    public void newsletterOptIn() {
        newsletter.click();
        optIn.click();
    }

    public void populateAddress(){
        firstName.sendKeys("TestFirstName");
        lastName.sendKeys("TestLastName");
        address.sendKeys("Polna,00-111");
        Select countrySelect = new Select(country);
        countrySelect.selectByValue("India");
        state.sendKeys("Heaven");
        city.sendKeys("Benghazi");
        zipcode.sendKeys("11-111");
        mobileNumber.sendKeys("000-000-000");

    }
    public void signup (){
        signupButton.click();

    }
}
