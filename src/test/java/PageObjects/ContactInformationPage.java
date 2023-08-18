package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
    public ContactInformationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "//*[@id=\"email\"]")
    private WebElement emailButton;

    @FindBy (xpath = "//*[@id=\"phone\"]")
    private WebElement phoneButton;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement countryButton;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement cityButton;

    @FindBy(xpath = "//*[@id=\"postCode\"]")
    private WebElement postalCodeButton;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/button[2]")
    private WebElement nextButtonOnContactInformation;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[2]/h3")
    private WebElement contactOnformation;


    public void inputEmailField(String string) {
        emailButton.sendKeys(string);
    }

    public void inputPhoneField(String string){
        phoneButton.sendKeys(string);
    }

    public void inputCountryField(String string){
        countryButton.sendKeys(string);
    }

    public void inputCityField(String string){
        cityButton.sendKeys(string);
    }

    public void inputPostalCodeField(String string){
        postalCodeButton.sendKeys(string);
    }

    public void clickNextButtonOnContactInformation(){
        nextButtonOnContactInformation.click();
    }

    public WebElement getNextButtonOnContactInformation() {
        return nextButtonOnContactInformation;
    }

    public void fillInContactInformationWithValidData(){
        inputEmailField("adriananeacsu56@yahoo.com");
        inputPhoneField("0744562115");
        inputCountryField("Romania");
        inputCityField("Brasov");
        inputPostalCodeField("500276");
    }

    public String getContactInformationText(){
        return contactOnformation.getText();
    }



}



