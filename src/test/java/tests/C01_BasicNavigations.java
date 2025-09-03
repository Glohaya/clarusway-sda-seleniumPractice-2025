package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C01_BasicNavigations{

public static void main(String[] args) throws InterruptedException {

    ChromeDriver driver = new ChromeDriver();
    driver.get(" https://www.w3schools.com/");
    Thread.sleep(3000);
    driver.close();

}}

