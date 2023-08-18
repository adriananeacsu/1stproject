package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstNameInput;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastNameInput;

    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"cpassword\"]")
    private WebElement confirmPasswordField;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/button")
    private WebElement nextButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[1]/h3")
    private WebElement personalInformation;


    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void completeFirstName(String string) {
        firstNameInput.sendKeys(string);
    }

    public void completeLastName(String string) {
        lastNameInput.sendKeys(string);
    }

    public void completeUserName(String string) {
        userNameInput.sendKeys(string);
    }

    public void completePasswordField(String string) {
        passwordInput.sendKeys(string);
    }

    public void completeConfirmPasswordField(String string) {
        confirmPasswordField.sendKeys(string);
    }

    public void fillInPersonalInformationWithValidData() {
        completeFirstName("Adriana");
        completeLastName("Manea");
        completeUserName("AdrianaManea");
        completePasswordField("123456");
        completeConfirmPasswordField("123456");
    }

    public void clickNextButtonWithAllFieldsInputed() {
        nextButton.click();
    }

    public WebElement getNextButton() {
        return nextButton;
    }

    public String getPersonalInformationText(){
        return personalInformation.getText();
    }
}
