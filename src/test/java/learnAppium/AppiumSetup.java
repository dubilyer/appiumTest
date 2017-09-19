package learnAppium;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public AppiumDriver getDriver() throws MalformedURLException {
        File appDir = new File("/");
        File app = new File(appDir, "gettaxi.apk");
        capabilities.setCapability("deviceName", "Android Tablet");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        AppiumDriver driver = new AndroidDriver(
                new URL("http://10.80.6.93:4723/wd/hub"),
                capabilities);
        return driver;
    }

}
