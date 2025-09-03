package tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T06 {
    public static void main(String[] args) throws InterruptedException {




//Task6:
//Go to the Amazon URL: https://www.amazon.com/

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Thread.sleep(500);
//Verify that it writes "Performance Metrics" or " Gateway" from the Source code.


        String pageSource = driver.getPageSource();

        if (pageSource.contains("Performance Metrics") || pageSource.contains("Gateway")) {
            System.out.println("RIGHT");
            Thread.sleep(500);
        } else {
            System.out.println("ROUNG");
        }
        Thread.sleep(500);
        driver.quit();
    }


    }

