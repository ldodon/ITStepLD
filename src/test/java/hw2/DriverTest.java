package hw2;

import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {

    @Test
    public void test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://moonglow.md/");
        webDriver.findElements(By.cssSelector(".mobileMenu + .wrap")).contains("");
//        MatcherAssert.assertThat();

       webDriver.quit();
    }
}
