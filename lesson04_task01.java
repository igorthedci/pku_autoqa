// 
// TEST LINK = http://automationpractice.com/index.php
// Create account page
// 
// В проекте создать класс MainPage. 
// С помощью языка Xpath и CSS селекторов описать локаторы для веб элементов
//
public class MainPage {

    String xlocatorReturnToHome = "//i[@class='icon-home']";

//  YOUR PERSONAL INFORMATION section

    String xlocatorRadioButtonMr = "//div[@id='uniform-id_gender1']";

    String xlocatorRadioButtonMrs = "//div[@id='uniform-id_gender2']";

    String xlocatorFirstNameLabel = "//label[@for='customer_firstname']";
    String xlocatorFirstNameInput = "//input[@id='customer_firstname']";

    String xlocatorEmailLabel = "//label[@for='email']";
    String xlocatorEmailInput = "//input[@id='email']";

    String xlocatorPasswordLabel = "//label[@for='passwd']";
    String xlocatorPasswordInput = "//input[@id='passwd']";
    String xlocatorPasswordComment = "//span[contains(text(),'minimum')]";

    String xlocatorDateOfBirthLabel = "//label[contains(text(),'Date of Birth')]";
    String xlocatorDateOfBirthDays = "//select[@id='days']";
    String xlocatorDateOfBirthDays13 = "//select[@id='days']/option[@value='13']";
    String xlocatorDateOfBirthMonth = "//select[@id='months']";
    String xlocatorDateOfBirthDays13 = "//select[@id='months']/option[@value='12']";
    String xlocatorDateOfBirthYear = "//select[@id='years']";
    String xlocatorDateOfBirthYear2018 = "//select[@id='years']/option[@value='2018']";

    String xlocatorNewsletterCheckbox = "//input[@id='newsletter']";
    String xlocatorNewsletterLabel = "//label[@for='newsletter']";

    String xlocatorSpecialOffersCheckbox = "//input[@id='optin']";
    String xlocatorSpecialOffersLabel = "//label[@for='optin']";

//  YOUR ADDRESS section

    String xlocatorYourAddressLabel = "//h3[contains(text(),'address')]";

    String xlocatorYAFirstNameLabel = "//label[@for='firstname']";
    String xlocatorYAFirstNameInput = "//input[@id='firstname']";

    String xlocatorYALastNameLabel = "//label[@for='lastname']";
    String xlocatorYALastNameInput = "//input[@id='lastname']";

    String xlocatorStateLabel = "//label[@for='id_state']";
    String xlocatorStateInput = "//select[@id='id_state']";
    String xlocatorStateInput13 = "//select[@id='id_state']/option[@value='1']";

    String xlocatorPostcodeLabel = "//label[@for='postcode']";
    String xlocatorPostcodeInput = "//select[@id='postcode']";

    String xlocatorCountryLabel = "//label[@for='id_country']";
    String xlocatorCountryInput = "//select[@id='id_country']";
    String xlocatorCountry = "//select[@id='id_country']/option[@value='21']";

    String xlocatorPhneComment = "//p[contains(text(),'one phone number')]";
    String xlocatorPhoneLabel = "//label[@for='phone']";
    String xlocatorPhoneInput = "//input[@id='phone']";

    String xlocatorRegisterButtonLabel = "//button[@id='submitAccount']/span";
    String xlocatorRegisterButtonInput = "//button[@id='submitAccount']";

}
