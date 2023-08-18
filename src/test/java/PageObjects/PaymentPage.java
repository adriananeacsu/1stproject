package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

    public PaymentPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy (xpath = "/html/body/div/div/section/div/form/div[4]/div[2]/input")
    private WebElement inputCardHolderName;


    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[1]/input")
    private WebElement inputCardNumber;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[3]/div/div[2]/input")
    private WebElement inputCvc;

    @FindBy(xpath = "//*[@id=\"month\"]")
    private WebElement selectExpiryMonth;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"month\"]/option[5]")
    private WebElement selectWhichMonth;

    @FindBy(xpath = "//*[@id=\"year\"]")
    private WebElement selectYear;


    @FindBy(xpath = "//*[@id=\"year\"]/option[2]")
    private WebElement selectWhichYear;



    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/div[4]/button[2]")
    private WebElement clickFinalNextOnPayment;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[4]/h3")
    private WebElement paymentInformation;

    public void fillInNameOfCardholder(String string){
        inputCardHolderName.sendKeys(string);
    }

    public void fillInCardNumber(String string){
        inputCardNumber.sendKeys(string);
    }

    public void fillInCvcNumber(String string){
        inputCvc.sendKeys(string);
    }

    public void clickSelectExpiryMonth(){
        selectExpiryMonth.click();
    }

    public void clickYear(){
        selectYear.click();
    }

    public WebElement getNextButtonFromPayment(){
        return nextButton;
    }

    public void clickAndChooseTheMonth(){
        selectWhichMonth.click();
    }

    public void clickAndChooseTheYear(){
        selectWhichYear.click();
    }

    public void clickNextOnPayment(){
        clickFinalNextOnPayment.click();
    }

    public String getPaymentInformationtext(){return paymentInformation.getText();}

    public void fillInAllPaymentInformation(){
        fillInNameOfCardholder("Adriana");
        fillInCardNumber("1234 5678 91011");
        fillInCvcNumber("123");
        clickSelectExpiryMonth();
        clickAndChooseTheMonth();
        clickYear();
        clickAndChooseTheYear();
        clickNextOnPayment();
    }
}
