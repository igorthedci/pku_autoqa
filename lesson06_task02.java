import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class verifyAddBlouseAndClearCart {

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

    @Test
    public void verifyAddBlouseToCart() {

        // preconditions
        searchProductByName("Blouse");
        switchToListView();

        // steps
        pressAddCartButton();
        pressProceedToCheckoutButton();

        // asserts
        String actualPrice = "";
        String expectedPrice = "";
        WebElement checkDivPrice = null;

        checkDivPrice = submitSearch(driver, By.xpath("//span[contains(@id,'product_price_')]/span"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$27.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//span[contains(@id,'total_product_price_')]"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$27.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//td[@id='total_product']"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$27.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//td[@id='total_shipping']"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$2.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//td[@id='total_price_without_tax']"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$29.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//td[@id='total_tax']"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$0.00";
        Assert.assertEquals(expectedPrice, actualPrice);

        checkDivPrice = submitSearch(driver, By.xpath("//span[@id='total_price']"));
        actualPrice = checkDivPrice.getText();
        expectedPrice = "$29.00";
        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void verifyClearCart() {

        // preconditions
        verifyAddBlouseToCart();

        // steps
        pressTrashButton();

        // asserts
        WebElement actualDiv = submitSearchExplicit(driver, By.xpath("//div[@id='center_column']/p"));
        String actualText = actualDiv.getText();
        String expectedText = "Your shopping cart is empty.";
        Assert.assertEquals(expectedText, actualText);
    }

    private WebElement submitSearchExplicit(WebDriver driver, By submit_search) {
        WebDriverWait waitDelay = new WebDriverWait(driver, 10);
        return waitDelay.until(ExpectedConditions.visibilityOfElementLocated(submit_search));
    }
    private WebElement submitSearch(WebDriver driver, By submit_search) {
        return driver.findElement(submit_search);
    }
    private void searchProductByName(String strSearch) {
        WebElement inputSearchField = submitSearch(driver, By.id("search_query_top"));
        inputSearchField.clear();
        inputSearchField.sendKeys(strSearch);
        inputSearchField.submit();
    }
    private void switchToListView() {
        WebElement buttonListView = submitSearch(driver, By.xpath("//a[@title='List']"));
        buttonListView.click();
    }
    private void pressAddCartButton() {
        WebElement buttonAdd = submitSearch(driver, By.xpath("//a[@title='Add to cart']"));
        buttonAdd.click();
    }
    private void pressProceedToCheckoutButton() {
        WebElement button = submitSearchExplicit(driver, By.xpath("//a[@title='Proceed to checkout']"));
//        WebDriverWait waitDelay = new WebDriverWait(driver, 10);
//        WebElement button = waitDelay.until(ExpectedConditions.visibilityOfElementLocated
//                (By.xpath("//a[@title='Proceed to checkout']")));
        button.click();
    }
    private void pressTrashButton() {
        WebElement button = submitSearch(driver, By.xpath("//i[@class='icon-trash']"));
        button.click();
    }

} // class verifyAddBlouseAndClearCart
