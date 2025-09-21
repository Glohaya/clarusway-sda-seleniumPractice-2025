package tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utillities.TestBase;
import com.aventstack.extentreports.*;
import utillities.TestBaseExtentReport;

public class C44_SwagLab extends TestBaseExtentReport {/*
        1. Navigate to https://www.saucedemo.com/v1/index.html
        2. Log in as the standard user.
        3. Capture screenshots of:
             - The lowest-priced product (including its image, price, and details).
             - The highest-priced product (including its image, price, and details).
        4. Log out of the application.
        5. Assert each step for validation.
        6. Log all steps using Log4j.
        7. Generate an Extent Report containing all steps.
    */


    @Test
    void swagLabTest() {

        Logger logger = LogManager.getLogger(C44_SwagLab.class);
        test =extent.createTest("Positive Login Test","User Logs in the application with correct credentials");
        test.info("Test started");

//        1. Navigate to https://www.saucedemo.com/v1/index.html
        driver.get("https://www.saucedemo.com/v1/index.html");
        Assertions.assertTrue(driver.getTitle().contains("Swag Labs"), "Incorrect page title");
        test.info("Navigated to SauceDemo login page.");

//        2. Log in as the standard user.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce", Keys.ENTER);
        Assertions.assertTrue(driver.getCurrentUrl().contains("inventory"), "Login failed");
        test.info("Logged in as standard_user.");
//        3. Capture screenshots of:
//                - The lowest-priced product (including its image, price, and details).
//                - The highest-priced product (including its image, price, and details).
        WebElement dropDown = driver.findElement(By.tagName("select"));
        new Select(dropDown).selectByVisibleText("Price (low to high)");
        logger.info("✅ Sorted products by price low to high.");
        WebElement lowest = driver.findElements(By.xpath("//div[@class='inventory_item']")).getFirst();
        WebElement highest = driver.findElements(By.xpath("//div[@class='inventory_item']")).getLast();
        takeScreenshot(lowest);
        takeScreenshot(highest);

//        4. Log out of the application.
        driver.findElement(By.xpath("//button[.='Open Menu']")).click();
       WebElement logoutBtn= driver.findElement(By.id("logout_sidebar_link")).click();
        Assertions.assertTrue(logoutBtn.isDisplayed(), "Logout button not visible");
        Assertions.assertTrue(driver.getCurrentUrl().contains("index.html"), "Logout failed");
        logger.info("✅ Logged out successfully.");



//        6. Log all steps using Log4j.


//        7. Generate an Extent Report containing all steps.

        test.pass("Navigated to login page");
        test.pass("Logged in successfully");
        test.pass("Sorted products by price");
        test.pass("Captured screenshots of lowest and highest priced products");
        test.pass("Logged out successfully");

        extent.flush();
}
    }