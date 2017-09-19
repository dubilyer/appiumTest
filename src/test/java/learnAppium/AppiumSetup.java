package learnAppium;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSetup {
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public AppiumDriver getDriver(String port) throws MalformedURLException {
        File appDir = new File("/");
        File app = new File(appDir, "gettaxi.apk");
        capabilities.setCapability("deviceName", "Android Tablet");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("app", app.getAbsolutePath());

        AppiumDriver driver = new AndroidDriver(
                new URL("http://10.80.6.93:" + port + "/wd/hub"),
                capabilities);
        return driver;
    }

    public static void getScreenshot(AndroidDriver driver, String outputlocation ) {
        System.out.println("Capturing the snapshot of the page ");
        File srcFiler=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(srcFiler, new File(outputlocation));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
