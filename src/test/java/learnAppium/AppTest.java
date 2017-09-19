package learnAppium;

import io.appium.java_client.AppiumDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import static java.lang.Thread.sleep;

/**
 * Unit test for simple App.
 */
public class AppTest {
    AppiumDriver driver;
    @Before
    public void prepareDevice() throws MalformedURLException {
       driver =  (new AppiumSetup()).getDriver();
    }

    @Test
    public void go() throws InterruptedException {
            WebDriverWait wait = (new WebDriverWait(driver, 5));
            WebElement element = driver.findElement(By.id("btn_left"));
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
    }

    @After
    public void CloseDevice() throws InterruptedException {
        sleep(1000);
        driver.quit();
    }
}
