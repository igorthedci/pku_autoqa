// 
// TEST LINK = http://automationpractice.com/index.php
// Create account page
// 
// В проекте создать класс MainPage. 
// С помощью языка Xpath и CSS селекторов описать локаторы для веб элементов
//
public class MainPage {

    String xlocatorReturnToHome = "//i[@class='icon-home']";
    String сlocatorReturnToHome = "#header_logo > a > img";

//  YOUR PERSONAL INFORMATION section

    String xlocatorRadioButtonMr = "//div[@id='uniform-id_gender1']";
    String clocatorRadioButtonMr = "#id_gender1";

    String xlocatorRadioButtonMrs = "//div[@id='uniform-id_gender2']";
    String clocatorRadioButtonMrs = "#id_gender2";

    String xlocatorFirstNameLabel = "//label[@for='customer_firstname']";
    String xlocatorFirstNameInput = "//input[@id='customer_firstname']";
    String clocatorFirstNameLabel = "label[for='customer_firstname']";
    String clocatorFirstNameInput = "#customer_firstname";


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

// BOTTOM BLOCK

    String clocatorNewsletterLabel = "#newsletter_block_left > h4";
    String clocatorNewsletterInput = "#newsletter-input";
    String clocatorButtonSubmit = "button[name='submitNewsletter']";

    String clocatorFollowLabel = "#social_block > h4";
    String clocatorFollowFacebookLogo = "#social_block > ul > li.facebook > a";
    String clocatorFollowFacebookLink = "#social_block > ul > li.facebook > a";

    String clocatorFollowTwitterLogo = "";
    String clocatorFollowTwitterLink = "#social_block > ul > li.twitter > a";

    String clocatorFollowYoutubeLogo = "";
    String clocatorFollowYoutubeLink = "#social_block > ul > li.youtube > a";

    String clocatorFollowGoogleplusLogo = "";
    String clocatorFollowGoogleplusLink = "#social_block > ul > li.google-plus";

    String clocatorCategoriesLabel = "section[class*='categories'] > h4";
    String clocatorCategoryWomenLabel = "section[class*='categories'] a";

    String clocatorInformationLabel = "section[id*='links'] > h4";
//    String clocatorInformationSpecials = "section[id*='links'] a[title='Specials']";
    String clocatorInformationSpecials = "a[title='Specials']";
    String clocatorInformationNewProducts = "a[title='New products']";
    String clocatorInformationBestSellers = "a[title='Best sellers']";
    String clocatorInformationOurStores = "a[title='Our stores']";
    String clocatorInformationContactUs = "a[title='Contact us']";
    String clocatorInformationTerms = "a[title*='Terms']";
    String clocatorInformationAboutUs = "a[title='About us']";
    String clocatorInformationSitemap = "a[title='Sitemap']";

    String clocatorMyAccountLabel = "section h4 a[title*='Manage']";
    //    String clocatorInformationSpecials = "section[id*='links'] a[title='Specials']";
    String clocatorMyAccountMyOrders = "a[href*='history']";
    String clocatorMyAccountMyCreditSlips = "a[href*='order-slip']";
    String clocatorMyAccountMyAddresses = "a[href*='addresses']";
    String clocatorMyAccountMyPersonalInfo = "a[href*='identity']";

    String clocatorStoreInformation = "section[id*='contact_infos'] h4";
    String clocatorMyAccountStoreMap = "section[id*='contact_infos'] i[class*='map']";
    String clocatorMyAccountStorePhone = "section[id*='contact_infos'] i[class*='phone']";
    String clocatorMyAccountStoreEmail = "section[id*='contact_infos'] i[class*='envelope']";

    String clocatorBottomFooter = "section.bottom-footer a";

}
