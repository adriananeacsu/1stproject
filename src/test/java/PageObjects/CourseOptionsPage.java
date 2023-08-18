package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CourseOptionsPage {

    public CourseOptionsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//*[@id=\"flexRadioButton1\"]")
    private WebElement clickOnManualTesterCertificate;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/button[2]")
    private WebElement clickOnNextFromCourseOptionsPage;

    @FindBy(xpath = "/html/body/div/div/section/div/form/div[3]/h3")
    private WebElement courseOptions;



    public void setClickOnManualTesterCertificate(){ clickOnManualTesterCertificate.click();
    }

    public void clickOnNextFromCourseOptions(){clickOnNextFromCourseOptionsPage.click();
    }

    public String courseOptions(){
        return courseOptions.getText();
    }

}
