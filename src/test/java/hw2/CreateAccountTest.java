package hw2;

import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    @DisplayName("Create new account and login successfully")
    public void createAccountTest() {
        String gender = "Mrs.";

        driver.navigate().to("http://automationpractice.com");
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php"));

        driver.findElement(By.cssSelector("a.login")).click();
        Assertions.assertTrue(driver.getCurrentUrl().endsWith("/index.php?controller=authentication&back=my-account"));

        By loginFormlocator = By.id("login_form");
        By createAccountFormlocator = By.id("create-account_form");

        new WebDriverWait(driver, 10).
                until(ExpectedConditions.textToBe(By.className("page-heading"), "AUTHENTICATION"));


        WebElement loginForm = driver.findElement(loginFormlocator);
        WebElement createAccountForm = driver.findElement(createAccountFormlocator);

        Assertions.assertTrue(loginForm.isDisplayed());
        Assertions.assertTrue(createAccountForm.isDisplayed());

        WebElement emailInput = createAccountForm.findElement(By.id("email_create"));
        emailInput.sendKeys("laura.dodon" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")) +
                "@getnada.com");

        createAccountForm.findElement(By.id("SubmitCreate")).click();


        new WebDriverWait(driver, 5).until(ExpectedConditions.urlContains("#account-creation"));

        Assertions.assertEquals("CREATE AN ACCOUNT", driver.findElement(By.className("page-heading")).getText());

        WebElement creationAccountForm = driver.findElement(By.id("account-creation_form"));
        Assertions.assertTrue(creationAccountForm.isDisplayed());

        WebElement genderElement = creationAccountForm.findElement(
                By.xpath("//label[contains(@for,'id_gender') and normalize-space()='" + gender + "']//input"));
        genderElement.click();

        WebElement firstName = creationAccountForm.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Laura");
        WebElement lastName = creationAccountForm.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Dodon");
        WebElement pass = creationAccountForm.findElement(By.id("passwd"));
        pass.sendKeys("test1111");

        WebElement date = creationAccountForm.findElement(By.id("days"));
        WebElement month = creationAccountForm.findElement(By.id("months"));
        WebElement year = creationAccountForm.findElement(By.id("years"));

        new Select(date).selectByIndex(30);
        new Select(month).selectByVisibleText("October ");
        new Select(year).selectByValue("1993");

        WebElement checker = creationAccountForm.findElement(By.id("uniform-newsletter"));
        checker.click();
        WebElement address = creationAccountForm.findElement(By.id("address1"));
        address.sendKeys("Melestiu");
        WebElement city = creationAccountForm.findElement(By.id("city"));
        city.sendKeys("Chicago");

        WebElement state = creationAccountForm.findElement(By.id("id_state"));
        new Select(state).selectByVisibleText("Illinois");


        WebElement zipCode = creationAccountForm.findElement(By.id("postcode"));
        zipCode.sendKeys("60603");
        WebElement phoneMobile = creationAccountForm.findElement(By.id("phone_mobile"));
        phoneMobile.sendKeys("123456789");

        WebElement submit = creationAccountForm.findElement(By.id("submitAccount"));
        submit.click();

        new WebDriverWait(driver, 10).
                until(ExpectedConditions.textToBe(By.className("page-heading"), "MY ACCOUNT"));

        MatcherAssert.assertThat(driver.getCurrentUrl(), Matchers.endsWith("my-account"));

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}


