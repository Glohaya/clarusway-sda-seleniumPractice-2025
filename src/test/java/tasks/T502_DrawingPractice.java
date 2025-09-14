package tasks;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utillities.TestBase;

public class T502_DrawingPractice extends TestBase {
    /*
    Go to https://claruswaysda.github.io/Draw.html
    Draw a triangle
            Reset
*/

    @Test
    void DrawingPractice(){

        driver.get("https://claruswaysda.github.io/Draw.html");

        //    Draw a triangle
         WebElement e = driver.findElement(By.id("myCanvas"));
        Actions actions = new Actions(driver);
        actions.moveToElement(e, 50, 50)
                .clickAndHold()
                .moveByOffset(50, 50)
                .moveByOffset(-100, 0)
                .moveByOffset(50, -50)
                .release()
                .perform();

        //Reset

        driver.findElement(By.id("resetButton")).click();




    }
}
