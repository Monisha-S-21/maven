package com.example.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginAutomationTest {
    @Test
    public void testLogin() {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "https://storage.googleapis.com/chrome-for-testing-public/131.0.6778.204/win64/chromedriver-win64.zip");
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
