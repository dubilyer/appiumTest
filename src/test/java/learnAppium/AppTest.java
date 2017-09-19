package learnAppium;

import io.appium.java_client.AppiumDriver;
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
    static AppiumDriver[] drivers = new AppiumDriver[2];

    @Before
    public void prepareDevice() throws MalformedURLException {
        drivers[0] = (new AppiumSetup()).getDriver("4724");
        drivers[1] = (new AppiumSetup()).getDriver("4723");
    }

    @Test
    public void go() throws InterruptedException {
        for (int i = 0; i < drivers.length; i++) {
            final int finalI = i;
            new Thread(()-> {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                WebDriverWait wait = (new WebDriverWait(drivers[finalI], 5));
                WebElement element = wait.until(ExpectedConditions.visibilityOf(drivers[finalI].findElement(By.id("btn_left"))));
                element.click();
            });
        }
    }

    @AfterClass
    public static void CloseDevice() throws InterruptedException {
        sleep(1000);
        for (int i = 0; i < drivers.length; i++) {
            drivers[0].quit();
        }

    }
}
