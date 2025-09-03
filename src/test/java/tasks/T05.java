package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T05 {

    public static void main(String[] args) throws InterruptedException {
// task5
        WebDriver driver = new ChromeDriver();
        //Navigate to Facebook homepage URL: https://www.facebook.com/
        driver.get("https://www.facebook.com/");
        Thread.sleep(300);
        //Maximize the window

        //Verify expected equals actual URL.
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.facebook.com/";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("URL is correct");
        } else {
            System.err.println("URL is incorrect");
        }
        //Verify expected contains Facebook Word.

        String title = driver.getTitle();
        System.out.println("Title of the page is: " + title);
        Thread.sleep(300);

        if (title.equals("Contact Facebook")) {
            System.out.println("Title is correct");
        } else {
            System.err.println("Title is incorrect");
        }
        //Close the driver.
        Thread.sleep(3000);
        driver.quit();
    }
}



