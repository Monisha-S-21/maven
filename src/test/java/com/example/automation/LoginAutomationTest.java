package com.example.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginAutomationTest {
    @Test
    public void testLogin() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        try {
            LoginAutomation automation = new LoginAutomation();
            automation.performLogin(driver, "testUser", "testPassword");

            // Validate login success
            String expectedTitle = "Dashboard";
            String actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle);

        } finally {
            driver.quit();
        }
    }
}
