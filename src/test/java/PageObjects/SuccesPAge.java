package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccesPAge {

    public SuccesPAge(WebDriver driver) { PageFactory.initElements(driver, this);}

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/a")
    private WebElement returnToHomepage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[5]/h3")
    private WebElement succesPage;

    public void clickReturnToHomepageButton(){returnToHomepage.click();}

    public String succesPage(){
        return succesPage.getText();
    }
}
