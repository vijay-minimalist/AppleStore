package com.app.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUtils {
    public static WebDriver driver;

    public void initializer() {
        System.setProperty("webdriver.chrome.driver","src/test/java/com/app/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

}
