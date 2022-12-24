import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Locale;
import java.util.Random;

public class BaseTest {
    WebDriver driver;
    String BASE_URL = "https://automationexercise.com/";
    HomePage homePage;
    HomePageLogged homePageLogged;
    LoginPage loginPage;
    SignupPage signupPage;
    AccountCreatedPage accountCreatedPage;
    AccountDeletedPage accountDeletedPage;
    ContactUsPage contactUsPage;

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    String userNameRandom = getSaltString().toLowerCase(Locale.ROOT);
    String passwdRandom = getSaltString();
    String emailRandom = getSaltString() +"@example.com";




    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePageLogged = PageFactory.initElements(driver, HomePageLogged.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        signupPage = PageFactory.initElements(driver, SignupPage.class);
        accountCreatedPage = PageFactory.initElements(driver, AccountCreatedPage.class);
        accountDeletedPage = PageFactory.initElements(driver, AccountDeletedPage.class);
        contactUsPage = PageFactory.initElements(driver, ContactUsPage.class);
        driver.get(BASE_URL);
        driver.manage().window().maximize();
    }


    @AfterClass
    public void tearDown (){

        driver.quit();
    }

}
