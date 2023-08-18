package org.example;

import PageObjects.*;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {

    private WebDriver driver;

    ChromeOptions options = new ChromeOptions();
    MainPage mainPAge;
    RegisterPage registerPage;

    ContactInformationPage contactInformationPage;

    CourseOptionsPage courseOptionsPage;

    PaymentPage paymentPage;

    SuccesPAge succesPAge;


    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        mainPAge = new MainPage(driver);
        registerPage = new RegisterPage(driver);
        contactInformationPage = new ContactInformationPage(driver);
        courseOptionsPage = new CourseOptionsPage(driver);
        paymentPage = new PaymentPage(driver);
        succesPAge = new SuccesPAge(driver);
    }

    @When("the email value of {string} is inputted")
    public void input_email_to_field(String string) {
        mainPAge.inputValueInEmailField(string);
    }

    @When("the submit button is clicked")
    public void click_submit_button() {
        mainPAge.clickOnSubmittButton();
    }

    @When("the what you'll learn button is clicked")
    public void clickOnWhatYoullLearnButton() {
        mainPAge.clickOnWhatYoullLearnButton();

    }

    @When("the questions button is clicked")
    public void clickOnQuestionsButton() {
        mainPAge.clickOnQuestionsButton();
    }

    @When("the instructors button is clicked")
    public void clickOnInstructorsButton() {
        mainPAge.clickOnInstructorsButton();
    }

    @When("the first name value {string} is inputed")
    public void completeFirstName(String string) {
        registerPage.completeFirstName(string);

    }

    @When("the read more virtual button is clicked")
    public void clickOnVirtualButton() {
        Utils.scrollToElement(driver, mainPAge.getVirtualHeader());
        mainPAge.clickReadMoreVirtual();


    }

    @When("read more from virtual is clicked")
    public void click_virtual_read_more() {
        mainPAge.clickReadMoreVirtual();
    }

    @When("I Click the how do I sign up button")
    public void click_howDoISignUp() {
        mainPAge.clickHowDoISignUpButton();
    }

    @When("I input value {string} of last name field")
    public void completeLastName(String string) {
        registerPage.completeLastName(string);
    }

    @When("I input value {string} of username field")
    public void completeUserName(String string) {
        registerPage.completeUserName(string);
    }

    @When("I input value {string} of password field")
    public void completePassword(String string) {
        registerPage.completePasswordField(string);
    }

    @When("I input value {string} of conform password field")
    public void completeConfirmPassword(String string) {
        registerPage.completeConfirmPasswordField(string);
    }

    @When("I click on next button")
    public void click_on_next_button() {
        registerPage.clickNextButtonWithAllFieldsInputed();
    }

    @When("I input value {string} in email field")
    public void inputEmailField(String string) {
        contactInformationPage.inputEmailField(string);
    }

    @When("I input value {string} in phone field")
    public void inputPhoneField(String string){
        contactInformationPage.inputPhoneField(string);
    }

    @When("I input value {string} in country field")
    public void inputCountryField(String string){
        contactInformationPage.inputCountryField(string);
    }

    @When("I input value {string} in city field")
    public void inputCityField(String string){
        contactInformationPage.inputCityField(string);
    }

    @When("I input value {string} in postal code field")
    public void inputPostalCodeField(String string){
        contactInformationPage.inputPostalCodeField(string);
    }

    @When("I input all valid data from Contact Information page")
    public void click_next_from_contact(){
        contactInformationPage.clickNextButtonOnContactInformation();
    }

    @When("I click Read More from learn the fundamentals")
    public void click_readMore_from_read_the_fundamentals(){mainPAge.clickReadMoreFromLearnTheFundamentals();}

    @When("I click manual tester certificate from course options")
    public void click_manual_tester_certificate(){courseOptionsPage.setClickOnManualTesterCertificate();}

    @When("I click next from course options")
    public void iClickNextFromCourseOptions() {courseOptionsPage.clickOnNextFromCourseOptions();
    }

    @When("I input Card holder name as {string}")
    public void input_card_holder_name(String string){paymentPage.fillInNameOfCardholder(string);}

    @When("I fill in with card number as {string}")
    public void input_card_number(String string){paymentPage.fillInCardNumber(string);}

    @When("I fill in with CvC number as {string}")
    public void input_cvc_number(String string){paymentPage.fillInCvcNumber(string);}

    @When("I select the expiry month")
    public void select_expiry_month(){
        Utils.scrollToElement(driver, paymentPage.getNextButtonFromPayment());
        paymentPage.clickSelectExpiryMonth();
    }

    @When("I choose one of the months")
    public void choose_the_month(){
        paymentPage.clickAndChooseTheMonth();
    }

    @When("I click on year")
    public void clickOnYear(){
        paymentPage.clickYear();
    }

    @When("I choose one of the years")
    public void choose_the_year(){
        paymentPage.clickAndChooseTheYear();
    }

    @When("I click on next button from payment")
    public void clickOnNext(){
        paymentPage.clickNextOnPayment();
    }

    @When("I click on return to homepage button")
    public void clickOnReturnToHomepage(){succesPAge.clickReturnToHomepageButton();}

    @When("I click Read More from Hybrid")
    public void clickReadMoreHybrid(){
        Utils.scrollToElement(driver, mainPAge.getHybridHeader());
        mainPAge.clickReadMoreHybrid();
    }

    @When("I click Read More from In Person")
    public void clickReadMoreInPerson(){
        Utils.scrollToElement(driver, mainPAge.getInPersonHeader());
        mainPAge.clickReadMoreFromInPerson();
    }





    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/index.html");
    }

    @Given("I am on the register page")
    public void iAmOnTheRegisterPage() {
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/routes/enrollment.html");
    }

    @Given("I am on the contact information page")
    public void i_am_on_the_contact_information_page() {
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInPersonalInformationWithValidData();
        Utils.scrollToElement(driver, registerPage.getNextButton());
        registerPage.clickNextButtonWithAllFieldsInputed();
    }

    @Given("I am on the Course Options Page")
    public void i_am_on_course_options_page(){
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInPersonalInformationWithValidData();
        Utils.scrollToElement(driver, registerPage.getNextButton());
        registerPage.clickNextButtonWithAllFieldsInputed();

        contactInformationPage.fillInContactInformationWithValidData();
        Utils.scrollToElement(driver, contactInformationPage.getNextButtonOnContactInformation());
        contactInformationPage.clickNextButtonOnContactInformation();
    }

    @Given("I am on Payment page")
    public void i_am_on_payment_page(){
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInPersonalInformationWithValidData();
        Utils.scrollToElement(driver, registerPage.getNextButton());
        registerPage.clickNextButtonWithAllFieldsInputed();

        contactInformationPage.fillInContactInformationWithValidData();
        Utils.scrollToElement(driver, contactInformationPage.getNextButtonOnContactInformation());
        contactInformationPage.clickNextButtonOnContactInformation();

        courseOptionsPage.setClickOnManualTesterCertificate();
        courseOptionsPage.clickOnNextFromCourseOptions();
    }

    @Given("I am on succesPage")
    public void i_am_on_succes_page(){
        driver.get("file:///C:/Users/Adri/Desktop/curs%20IT/Testing-Env-master/routes/enrollment.html");
        registerPage.fillInPersonalInformationWithValidData();
        Utils.scrollToElement(driver, registerPage.getNextButton());
        registerPage.clickNextButtonWithAllFieldsInputed();

        contactInformationPage.fillInContactInformationWithValidData();
        Utils.scrollToElement(driver, contactInformationPage.getNextButtonOnContactInformation());
        contactInformationPage.clickNextButtonOnContactInformation();

        courseOptionsPage.setClickOnManualTesterCertificate();
        courseOptionsPage.clickOnNextFromCourseOptions();

        paymentPage.fillInAllPaymentInformation();

    }


    @Then("the news letter pop up appears")
    public void theNewsLetterPopUpAppears() {
        driver.switchTo().alert().accept();
    }


    @Then("the {string} page opens")
    public void thePageOpens(String string) {
        Assertions.assertEquals(string, driver.getTitle());
    }

    @Then("I should be taken on contact information page")
    public void iShouldBeTakenOnContactInformationPage() {
        Assertions.assertEquals("Contact information", contactInformationPage.getContactInformationText());
    }

    @Then("I should be taken to course option page")
    public void iShouldBeTakenToCourseOptionPage() {
        Assertions.assertEquals("Course option",courseOptionsPage.courseOptions());
    }

    @Then("I should be taken to payment information")
    public void iShouldBeTakenToPaymentInformation() {
        Assertions.assertEquals("Payment information", paymentPage.getPaymentInformationtext());

    }

    @Then("I remain on the register page")
    public void iRemainOnTheRegisterPage() {
        Assertions.assertEquals("Personal information", registerPage.getPersonalInformationText());
    }


    @Then("the page goes down to learn the fundamentals")
    public void thePageGoesDownToLearnTheFundamentals() {
        Assertions.assertEquals("Learn The Fundamentals", mainPAge.getLearnTheFundamentalsText());
    }


    @Then("I should be taken to homepage")
    public void iShouldBeTakenToHomepage() {
        Assertions.assertEquals("Software Testing Course", driver.getTitle());
    }

    @Then("the page goes down to frequently asked questions")
    public void thePageGoesDownToFrequentlyAskedQuestions() {
        Assertions.assertEquals("frequently asked questions", mainPAge.getFrequentlyAskedQuestionsText());
    }

    @Then("the page goes down to our instructors")
    public void thePageGoesDownToOurInstructors() {
        Assertions.assertEquals("our instructors", mainPAge.getOurInstructorsText());
    }

    @Then("the text box should get red.")
    public void theTextBoxShouldGetRed() {driver.getTitle();
    }


}
