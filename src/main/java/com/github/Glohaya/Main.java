package com.github.Glohaya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); //polymorphism

        driver.get(" https://www.w3schools.com/");
        driver.get(" https://stackoverflow.com/");
        Thread.sleep(300);
        driver.navigate().back();
        Thread.sleep(300);
        driver.navigate().forward();
        Thread.sleep(300);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();


    }
}