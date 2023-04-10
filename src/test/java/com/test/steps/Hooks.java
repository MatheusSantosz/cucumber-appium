package com.test.steps;

import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.AfterClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {
    public static String platform = "";
    private static AppiumDriver<?> driver;

    public static AppiumDriver<?> validateDriver()throws MalformedURLException{

        platform = System.getProperty("platform");
        System.out.println("Plataforma " + platform);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app","C:\\Users\\Windows\\IdeaProjects\\cucumberAppium\\apps\\app-debug.apk");
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platFormName","Android");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        return driver;
    }

    public static  AppiumDriver<?> getDriver(){
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
        }
    }
    @Before
    public static void startProject() throws MalformedURLException{
        if (getDriver()!= null){
            getDriver().launchApp();
        }else {
            validateDriver();
        }
    }
}
