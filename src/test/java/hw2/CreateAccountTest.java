package hw2;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CreateAccountTest {

    private Logger logger= LoggerFactory.getLogger(this.getClass());
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Chrome Driver has been started");

    }

    @Test
    @DisplayName("Create new account and login successfully")
    public void createAccountTest() {
        String gender = "Mrs.";

        driver.navigate().to("http://automationpractice.com");
        logger.info("Driver has been navigated to page");
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php"));
        logger.debug("Current Url matched with assertions.Driver is on page");

        driver.findElement(By.cssSelector("a.login")).click();
        logger.info("Driver has found 'Sing in' button");
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php?controller=authentication&back=my-account"));
        logger.debug("Current Url matched with assertions.Driver is on authentication field");

        By loginFormlocator = By.id("login_form");
        By createAccountFormlocator = By.id("create-account_form");

        new WebDriverWait(driver, 10).
                until(ExpectedConditions.textToBe(By.className("page-heading"), "AUTHENTICATION"));


        WebElement loginForm = driver.findElement(loginFormlocator);
        logger.info("Driver has found 'login' field");

        WebElement createAccountForm = driver.findElement(createAccountFormlocator);
        logger.info("Driver has found 'Create account' field");

        Assertions.assertTrue(loginForm.isDisplayed());
        logger.debug("'Login form' field has been displayed");
        Assertions.assertTrue(createAccountForm.isDisplayed());
        logger.debug("'Create account form' field has been displayed");

        WebElement emailInput = createAccountForm.findElement(By.id("email_create"));
        logger.info("Driver has found 'email address' input");

        emailInput.sendKeys("laura.dodon" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) +
                "@getnada.com");
        logger.info("Driver has send keys to 'email address' input");


        createAccountForm.findElement(By.id("SubmitCreate")).click();
        logger.info("Driver has found 'Create an account' button and clicked on it");


        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("#account-creation"));

        Assertions.assertEquals("CREATE AN ACCOUNT", driver.findElement(By.className("page-heading")).getText());
        logger.debug("Current Url matched with assertions.Driver is on create an account field");

        WebElement creationAccountForm = driver.findElement(By.id("account-creation_form"));
        logger.info("Driver has found 'Account creation form' field");

        Assertions.assertTrue(creationAccountForm.isDisplayed());
        logger.debug("'Account creation form' field has been displayed");

        WebElement genderElement = creationAccountForm.findElement(
                By.xpath("//label[contains(@for,'id_gender') and normalize-space()='" + gender + "']//input"));
        genderElement.click();
        logger.info("Driver has found 'Gender Element', choosed one and clicked on it");

        WebElement firstName = creationAccountForm.findElement(By.id("customer_firstname"));
        logger.info("Driver has found 'First name' input");
        firstName.sendKeys("Laura");
        logger.info("Driver has send keys to 'First name' input");

        WebElement lastName = creationAccountForm.findElement(By.id("customer_lastname"));
        logger.info("Driver has found 'Last name' input");
        lastName.sendKeys("Dodon");
        logger.info("Driver has send keys to 'Last name' input");

        WebElement pass = creationAccountForm.findElement(By.id("passwd"));
        logger.info("Driver has found 'Password' input");
        pass.sendKeys("test1111");
        logger.info("Driver has send keys to 'Password' input");

        WebElement date = creationAccountForm.findElement(By.id("days"));
        WebElement month = creationAccountForm.findElement(By.id("months"));
        WebElement year = creationAccountForm.findElement(By.id("years"));
        logger.info("Driver has found 'Date of Birth' dropdown");


        new Select(date).selectByIndex(30);
        logger.info("Driver has choosed 'Day'");
        new Select(month).selectByVisibleText("October ");
        logger.info("Driver has choosed 'Month'");
        new Select(year).selectByValue("1993");
        logger.info("Driver has choosed 'Year'");

        WebElement checker = creationAccountForm.findElement(By.id("uniform-newsletter"));
        checker.click();
        logger.info("Driver has found 'Newsletter form', and clicked on it");

        WebElement address = creationAccountForm.findElement(By.id("address1"));
        logger.info("Driver has found 'Address' input");
        address.sendKeys("Melestiu");
        logger.info("Driver has send keys to 'Address' input");

        WebElement city = creationAccountForm.findElement(By.id("city"));
        logger.info("Driver has found 'City' input");
        city.sendKeys("Chicago");
        logger.info("Driver has send keys to 'City' input");

        WebElement state = creationAccountForm.findElement(By.id("id_state"));
        logger.info("Driver has found 'State ' dropdown");
        new Select(state).selectByVisibleText("Illinois");
        logger.info("Driver has choosed a 'State '");

        WebElement zipCode = creationAccountForm.findElement(By.id("postcode"));
        logger.info("Driver has found 'Zip/Postal Code' input");

        zipCode.sendKeys("60603");
        logger.info("Driver has send keys to 'Zip/Postal Code' input");

        WebElement phoneMobile = creationAccountForm.findElement(By.id("phone_mobile"));
        logger.info("Driver has found 'Mobile phone' input");

        phoneMobile.sendKeys("123456789");
        logger.info("Driver has send keys to 'Mobile phone' input");


        WebElement submit = creationAccountForm.findElement(By.id("submitAccount"));
        submit.click();
        logger.info("Driver has found 'Register' button and clicked on it");

        new WebDriverWait(driver, 10).
                until(ExpectedConditions.textToBe(By.className("page-heading"), "MY ACCOUNT"));

        MatcherAssert.assertThat(driver.getCurrentUrl(), Matchers.endsWith("my-account"));
        logger.debug("Current Url matched with assertions.Driver is on create my account field");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}


