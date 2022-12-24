package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[1]/input")
    WebElement formNameInput;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[2]/input")
    WebElement formEmailInput;
    @FindBy(xpath = "//*[@id=\"contact-us-form\"]/div[3]/input")
    WebElement formSubjectInput;
    @FindBy(id = "message")
    WebElement formTextArea;
    @FindBy (name = "upload_file")
    WebElement uploadButton;
    @FindBy (name = "submit")
    WebElement submitButton;
    @FindBy (xpath ="//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]")
    WebElement confirmationText;



    public void populateFormData() {
        formNameInput.sendKeys("Test Name");
        formEmailInput.sendKeys("test@example.com");
        formSubjectInput.sendKeys("Test Subject");
        formTextArea.sendKeys("Form text area random text");
    }

    public void uploadFile(){
        uploadButton.sendKeys("C:\\Users\\Pawel\\IdeaProjects\\AutomationExcercise\\pom.xml");

    }

    public void submitButtonClick(){
       submitButton.click();
    }

   public void verifyConfirmationText(){
        String actualText = confirmationText.getText();
        String expectedText = "Success! Your details have been submitted successfully.";
        assert actualText.equals(expectedText);
   }
}
