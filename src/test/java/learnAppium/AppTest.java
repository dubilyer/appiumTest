package learnAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;

import static java.lang.Thread.sleep;

/**
 * Unit test for simple App.
 */
public class AppTest {
    static AppiumDriver driver;

    @Before
    public void prepareDevice() throws MalformedURLException {
        driver = (new AppiumSetup()).getDriver("4723");
    }


    @Test
    public void go() throws InterruptedException {
        sleep (5000);
        WebDriverWait wait = (new WebDriverWait(driver, 5));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("btn_left"))));
        AppiumSetup.getScreenshot((AndroidDriver) driver, "src/test/resources/1.jpg");
        element.click();
        AppiumSetup.getScreenshot((AndroidDriver) driver, "src/test/resources/2.jpg");
    }


    @AfterClass
    public static void CloseDevice() throws InterruptedException {
        sleep(1000);
        driver.quit();
    }
}
