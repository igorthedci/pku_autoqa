import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class verifyCreateAccountWithFullForm {

    private static WebDriver driver;
    private String testEmail;


    @BeforeClass
    public static void initClass() {
    }

    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", "E:\\!Setup\\Inet\\Chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }

    @After
    public void stop() {
        driver.close();
    }

    public void openCreateAccountPage() {

        testEmail = "qq";
        Random rnd = new Random();
        for (int i = 0; i < 6; i++) {
            testEmail += String.valueOf(rnd.nextInt(10));
        }
        testEmail += "@qq.qq";
        pressSigninButton();
        typeEmailAccount(testEmail);
        pressCreateAccountButton();

        WebElement divCreateAccount = submitSearch(driver, By.xpath("//h3[text()='Create an account']"));
        Assert.assertTrue(divCreateAccount.isDisplayed());
    }

    @Test
    public void fillAllFields() {

        openCreateAccountPage();

        // YPI === your personal information
        // YA === your address
        selectSexTitle("Mrs.");
        typeFirstNameYPI("First");
        typeLastNameYPI("Second");
        typeCompanyYPI("Company");
        typeEmailYPI(testEmail);
        typePasswordYPI("pa$$w0rd");
        selectDateOfBirth("11", "11", "1999");
        selectSignupNewsletter();
        selectReceiveOffers();

        typeFirstNameYA("First");
        typeLastNameYA("Second");
        typeAddressYA("Address1 Address2");
        typeAddressLine2YA("Address4 Address5");
        typeCityYA("City");
        selectStateYA("Iowa");
        typePostalCodeYA("09876");
        selectCountryYA("United States");
        typeHomePhoneYA("9876543210");
        typeMobilePhoneYA("0987654321");
        typeAliasAddressYA("Address3");

        pressRegisterButton();

        WebElement checkTitle = submitSearch(driver, By.xpath("//span[text()='My account']"));
        Assert.assertNotNull(checkTitle);
    }

    private WebElement submitSearch(WebDriver driver, By submit_search) {
        return driver.findElement(submit_search);
    }
    private void pressSigninButton() {
        WebElement buttonSignin = submitSearch(driver, By.xpath("//a[contains(text(),'Sign in')]"));
        buttonSignin.click();
    }
    private void pressRegisterButton() {
        WebElement buttonRegister = submitSearch(driver, By.id("submitAccount"));
        buttonRegister.click();
    }
    private void typeEmailAccount(String emailAccount) {
        WebElement inputCreateEmail = submitSearch(driver, By.id("email_create"));
        inputCreateEmail.clear();
        inputCreateEmail.sendKeys(emailAccount);
    }
    private void pressCreateAccountButton() {
        WebElement buttonCreateAccount = submitSearch(driver, By.id("SubmitCreate"));
        buttonCreateAccount.click();
    }
//
//------------------------------------------------------------- YOUR PERSONAL INFORMATION section
//
    private void selectSexTitle(String strTitle) {
        String idTitle = "id_gender1";;
        if (strTitle == "Mrs.") {
            idTitle = "id_gender2";
        }
        WebElement inputTitle = submitSearch(driver, By.id(idTitle));
        inputTitle.click();
    }
    private void typeFirstNameYPI(String strFirstName) {
        WebElement inputFirstName = submitSearch(driver, By.id("customer_firstname"));
        inputFirstName.clear();
        inputFirstName.sendKeys(strFirstName);
    }
    private void typeLastNameYPI(String strLastName) {
        WebElement inputLastName = submitSearch(driver, By.id("customer_lastname"));
        inputLastName.clear();
        inputLastName.sendKeys(strLastName);
    }
    private void typeCompanyYPI(String strCompany) {
        WebElement inputCompany = submitSearch(driver, By.id("company"));
        inputCompany.clear();
        inputCompany.sendKeys(strCompany);
    }
    private void typeEmailYPI(String strEmail) {
        WebElement inputEmail = submitSearch(driver, By.id("email"));
        inputEmail.clear();
        inputEmail.sendKeys(strEmail);
    }
    private void typePasswordYPI(String strPassword) {
        WebElement inputPassword = submitSearch(driver, By.id("passwd"));
        inputPassword.clear();
        inputPassword.sendKeys(strPassword);
    }
    private void selectDateOfBirth(String strDay, String strMonth, String strYear) {
        WebElement dropList;
        Select value;

        dropList = submitSearch(driver, By.id("days"));
        value = new Select(dropList);
        value.selectByValue(strDay);

        dropList = submitSearch(driver, By.id("months"));
        value = new Select(dropList);
        value.selectByValue(strMonth);

        dropList = submitSearch(driver, By.id("years"));
        value = new Select(dropList);
        value.selectByValue(strYear);
    }
    private void selectSignupNewsletter() {
        WebElement selectBox = submitSearch(driver, By.id("newsletter"));
        selectBox.click();
    }
    private void selectReceiveOffers() {
        WebElement selectBox = submitSearch(driver, By.id("optin"));
        selectBox.click();
    }
//
//--------------------------------------------------------------------------- YOUR ADDRESS
//
    private void typeFirstNameYA(String strName) {
        WebElement inputName = submitSearch(driver, By.id("firstname"));
        inputName.clear();
        inputName.sendKeys(strName);
    }
    private void typeLastNameYA(String strName) {
        WebElement inputName = submitSearch(driver, By.id("lastname"));
        inputName.clear();
        inputName.sendKeys(strName);
    }
    private void typeAddressYA(String strAddress) {
        WebElement inputAddress = submitSearch(driver, By.id("address1"));
        inputAddress.clear();
        inputAddress.sendKeys(strAddress);
    }
    private void typeAddressLine2YA(String strAddress) {
        WebElement inputAddress = submitSearch(driver, By.id("address2"));
        inputAddress.clear();
        inputAddress.sendKeys(strAddress);
    }
    private void typeCityYA(String strCity) {
        WebElement inputCity = submitSearch(driver, By.id("city"));
        inputCity.clear();
        inputCity.sendKeys(strCity);
    }
    private void selectStateYA(String strState) {
        WebElement dropState = submitSearch(driver, By.id("id_state"));
        Select value = new Select(dropState);
        value.selectByVisibleText(strState);
    }
    private void typePostalCodeYA(String strPostalCode) {
        WebElement inputPostalCode = submitSearch(driver, By.id("postcode"));
        inputPostalCode.clear();
        inputPostalCode.sendKeys(strPostalCode);
    }
    private void selectCountryYA(String strCountry) {
        WebElement dropCountry = submitSearch(driver, By.id("id_country"));
        Select value = new Select(dropCountry);
        value.selectByVisibleText(strCountry);
    }
    private void typeHomePhoneYA(String strPhone) {
        WebElement inputPhone = submitSearch(driver, By.id("phone"));
        inputPhone.clear();
        inputPhone.sendKeys(strPhone);
    }
    private void typeMobilePhoneYA(String strPhone) {
        WebElement inputPhone = submitSearch(driver, By.id("phone_mobile"));
        inputPhone.clear();
        inputPhone.sendKeys(strPhone);
    }
    private void typeAliasAddressYA(String strAddress) {
        WebElement inputAddress = submitSearch(driver, By.id("alias"));
        inputAddress.clear();
        inputAddress.sendKeys(strAddress);
    }

} // class verifyCreateAccountWithFullForm
