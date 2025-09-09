package tasks;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class T304_DynamicListManagement {
    WebDriver driver;


    //    Task 5: Dynamic List Management

    @Test
    void ToDoListTest() {
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
//    Uses Faker to generate 5 random task names
        Faker faker = new Faker();
        String[] tasksToAdd ={
          faker.random().hex(3),
        faker.random().hex(3),
        faker.random().hex(3),
       faker.random().hex(3),
        faker.random().hex(3)};

//    Adds all tasks to the todo list
        // Add all tasks to the to-do list using a for loop
        WebElement inputField = driver.findElement(By.xpath("//input[@placeholder='Add new todo']"));        for (String task : tasksToAdd) {
            inputField.sendKeys(task);
            //inputField.submit();


        }


        // Marks every other task as completed (strikethrough)
        List<WebElement> tasks = driver.findElements(By.xpath("1"));
        for (int i = 0; i < tasks.size(); i += 2) {
            tasks.get(i).click();

        }

//        Deletes all completed tasks

        List<WebElement> deleteButtons = driver.findElements(By.xpath("//ul/li[@class='completed']/span"));
        for (WebElement deleteButton : deleteButtons) {
            deleteButton.click();
        }
//        Verifies only incomplete tasks remain
        List<WebElement> remainingTasks = driver.findElements(By.xpath("//ul/li[not(@class='completed')]"));
        Assertions.assertEquals(2, remainingTasks.size());

    }
    @BeforeEach
    void setUp() {
        //    Question: Go to "http://webdriveruniversity.com/To-Do-List/index.html" and create a test that:

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}