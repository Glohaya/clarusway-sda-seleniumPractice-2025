package tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utillities.TestBase;

public class T603_UserRegistrationandScreenshotCapture extends TestBase {

     /*
//Go to https://claruswaysda.github.io/homepage.html
//Register a user
//Sign in with the registered user
//Take all pages' screenshots
//Take 'Celebrate Login' button's screenshot.
//Capture a screenshot of the page with confetti.
//*/

    @Test
    void UserRegistrationandScreenshotCapture(){

    //Go to https://claruswaysda.github.io/homepage.html
        driver.get("https://claruswaysda.github.io/form.html");

    //Register a user
        driver.findElement(By.id("ssn")).sendKeys("lala");
        driver.findElement(By.id("first-name")).sendKeys("kai");
        driver.findElement(By.id("last-name")).sendKeys("ahmad");
        driver.findElement(By.id("address")).sendKeys("riyadh");
        driver.findElement(By.id("phone")).sendKeys("111119");
        driver.findElement(By.id("username")).sendKeys("kai1s");
        driver.findElement(By.id("email")).sendKeys("kai1s@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("confirm-password")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/button")).click();

    //Sign in with the registered user
        driver.findElement(By.xpath("//*[@id=\"successMessage\"]/button")).click();
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("kai1s");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id=\"loginForm\"]/button")).click();

        //Take all pages' screenshots


   //Take 'Celebrate Login' button's screenshot.
        takeElementsScreenshot(driver.findElement(By.id("clickMeButton")));


   //Capture a screenshot of the page with confetti.
        takeFullPageScreenshot();





    }
}
