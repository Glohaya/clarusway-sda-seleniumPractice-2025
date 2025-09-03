package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T01_C01_BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //Task1:
        WebDriver driver = new ChromeDriver();
        driver.get("https://clarusway.com/");
        Thread.sleep(3000);
        driver.get("http://amazon.com/");
        //Come back to the Clarusway using the back command.
        driver.navigate().back();

        //Again go back to the amazon website using forward command
        Thread.sleep(3000);

        driver.navigate().forward();
        //Refresh the Browser using refresh command.
        Thread.sleep(3000);

        driver.navigate().refresh();
        //
        // Close the Browser.
        Thread.sleep(3000);

        driver.close();
    }
}