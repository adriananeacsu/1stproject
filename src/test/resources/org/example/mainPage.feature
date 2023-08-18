Feature: Main Page

  Scenario: RO Positive email
    Given I am on the main page
    When the email value of "adriananeacsu56@yahoo.com" is inputted
    And the submit button is clicked
    Then the news letter pop up appears

  Scenario: Negative email field
    Given I am on the main page
    When the email value of "12345678901019282" is inputted
    And the submit button is clicked
    Then the text box should get red.



  Scenario: Learn Button
    Given I am on the main page
    When the what you'll learn button is clicked
    And the what you'll learn button is clicked
    Then the page goes down to learn the fundamentals



  Scenario: Questions Button
    Given I am on the main page
    When the questions button is clicked
    And the questions button is clicked
    Then the page goes down to frequently asked questions

  Scenario: Instructors Button
    Given I am on the main page
    When the instructors button is clicked
    And the instructors button is clicked
    Then the page goes down to our instructors


  Scenario: First Name Field
    Given I am on the register page
    When the first name value "Adriana" is inputed
    And the first name value "Adriana" is inputed

  Scenario: Read More Button from Virtual
    Given I am on the main page
    When the read more virtual button is clicked
    Then the "virtual" page opens



  Scenario: Read More Button from Hybrid
    Given I am on the main page
    When I click Read More from Hybrid
    Then the "Hybrid" page opens



  Scenario: Read More Button from In Person
    Given I am on the main page
    When I click Read More from In Person
    Then the "In Person" page opens




  Scenario: How do I sign up button
    Given I am on the main page
    When I Click the how do I sign up button


  Scenario: positive: input all fields on register page
    Given I am on the register page
    And the first name value "Adriana" is inputed
    And I input value "Manea" of last name field
    And I input value "AdrianaManea" of username field
    And I input value "12345" of password field
    And I input value "12345" of conform password field
    And I click on next button
    Then I should be taken on contact information page

  Scenario: Negative: - input all fields on register page
    Given I am on the register page
    And the first name value "" is inputed
    And I input value "string" of last name field
    And I input value "string" of username field
    And I input value "string" of password field
    And I input value "string" of conform password field
    And I click on next button
    Then I remain on the register page


  Scenario: input email field
    Given I am on the contact information page
    When I input value "string" in email field


  Scenario: input phone field
    Given I am on the contact information page
    When I input value "string" in phone field

  Scenario: input country field
    Given I am on the contact information page
    When I input value "Romania" in country field

  Scenario: input city field
    Given I am on the contact information page
    When I input value "string" in city field

  Scenario: input postal code field
    Given I am on the contact information page
    When I input value "string" in postal code field

  Scenario: input all fields in Contact Information Page
    Given I am on the contact information page
    And I input value "string" in email field
    And I input value "phone" in phone field
    And I input value "string" in country field
    And I input value "city" in city field
    And I input value "string" in postal code field
    And I input all valid data from Contact Information page
    Then I should be taken to course option page



  Scenario: input all fields in Contact Information Page
    Given I am on the contact information page
    And I input value "" in email field
    And I input value "phone" in phone field
    And I input value "string" in country field
    And I input value "city" in city field
    And I input value "string" in postal code field
    And I input all valid data from Contact Information page
    Then I should be taken on contact information page

  Scenario: click read more from learn the fundamentals
    Given I am on the main page
    When I click Read More from learn the fundamentals
    Then the "Fundamentals" page opens

  Scenario: click on software tester certificate
    Given I am on the Course Options Page
    When I click manual tester certificate from course options
    And I click next from course options
    Then I should be taken to payment information

  Scenario: click on next from course options
    Given I am on the Course Options Page
    When I click next from course options
    Then I should be taken to payment information

  Scenario: input card holder name
    Given I am on Payment page
    When I input Card holder name as "Adriana"

  Scenario: input card number
    Given I am on Payment page
    When I fill in with card number as "1234 5678 91011"

  Scenario: input cvc number
    Given I am on Payment page
    When I fill in with CvC number as "123"

  Scenario: succes page
    Given I am on succesPage
    When I click on return to homepage button
    Then I should be taken to homepage



  Scenario: Select expiry month
    Given I am on Payment page
    When I fill in with CvC number as "546"
    When I input Card holder name as "Adriana"
    When I fill in with card number as "1234 5678 91011"
    When I choose one of the months
    When I click on year
    When I choose one of the years
    When I click on next button from payment
    When I select the expiry month
    And I click on next button from payment

