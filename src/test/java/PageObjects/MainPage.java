package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement inputEmailField;

    @FindBy (xpath = "/html/body/section[2]/div/div/div/button")
    private WebElement elementSubmittButton;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[1]/a")
    private WebElement whatYoullLEarnButton;

    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[2]/a")
    private WebElement questionsButton;


    @FindBy (xpath = "//*[@id=\"navmenu\"]/ul/li[3]/a")
    private WebElement instructorsButton;

    @FindBy (xpath = "/html/body/section[3]/div/div/div[1]/div/div/h3")
    private WebElement virtualHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[1]/div/div/a")
    private WebElement readMoreVirtual;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement howDoISignUp;

    @FindBy (xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/a")
    private WebElement readMoreFromLearnTheFundamentals;

    @FindBy(xpath = "//*[@id=\"learn-fundamentals\"]/div/div/div[2]/h2")
    private WebElement learnTheFundamentalsText;

    @FindBy(xpath = "//*[@id=\"questions\"]/div/h2")
    private WebElement frequentlyAskedQuestionsText;

    @FindBy(xpath = "//*[@id=\"instructors\"]/div/h2")
    private WebElement ourInstructorsText;

    @FindBy(xpath = "/html/body/section[2]/div/div/div/input")
    private WebElement wrongEmailText;


    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/h3")
    private WebElement hybridHeader;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[2]/div/div/a")
    private WebElement readMorefromHybrid;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/a")
    private WebElement readMoreFromInPerson;

    @FindBy(xpath = "/html/body/section[3]/div/div/div[3]/div/div/h3")
    private WebElement inPersonHeader;

    @FindBy(xpath = "//*[@id=\"questions\"]/div[4]/h3/button")
    private WebElement HowDiISignUpText;

    @FindBy(xpath = "//*[@id=\"learn-selenium\"]/div/div/div[1]/h2")
    private WebElement learnSeleniumText;




    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    public void inputValueInEmailField(String string){
        inputEmailField.sendKeys(string);
    }
    public void clickOnSubmittButton(){
        elementSubmittButton.click();
    }

    public void clickOnWhatYoullLearnButton(){whatYoullLEarnButton.click();}

    public void clickOnQuestionsButton(){questionsButton.click();}


    public void clickOnInstructorsButton(){instructorsButton.click();}

    public WebElement getVirtualHeader(){
        return virtualHeader;
    }

    public void clickReadMoreVirtual(){
        readMoreVirtual.click();
    }

    public  void clickHowDoISignUpButton() {
        howDoISignUp.click();


    }

    public void clickReadMoreFromTheFundamentals(){readMoreFromLearnTheFundamentals.click();}

    public String getLearnTheFundamentalsText(){return learnTheFundamentalsText.getText();
    }

    public WebElement getFrequentlyAskedQuestionsText(){
        return frequentlyAskedQuestionsText;
    }

    public String getOurInstructorsText(){
        return ourInstructorsText.getText();
    }

    public void setInputEmailField(String string){inputEmailField.sendKeys(string);}

    public void clickOnSubmitButton(){elementSubmittButton.click();}

    public void clickReadMoreHybrid(){readMorefromHybrid.click();}


    public WebElement getHybridHeader(){return hybridHeader;}

    public void clickReadMoreFromInPerson(){readMoreFromInPerson.click();}

    public WebElement getInPersonHeader(){return inPersonHeader;}

    public WebElement getLearnSeleniumText(){return learnSeleniumText;}


    public String getLEarnTheFundamentalsText() {return learnTheFundamentalsText.getText();
    }
}

