package tasks;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import static java.lang.Thread.sleep;

public class T408_FreePractice {

@Test
        void freePractice(){
    driver.get("https://demo.guru99.com/test/newtours/register.php");
    //Apply dropdown and form handling techniques
    driver.findElement(By.name("firstName")).sendKeys("ahmed");
    driver.findElement(By.name("lastName")).sendKeys("nor");
    driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("99999");
    driver.findElement(By.id("userName")).sendKeys("ahmed");
    driver.findElement(By.name("address1")).sendKeys("12KSA");
    driver.findElement(By.xpath("//input[@name='city']")).sendKeys("riyadh");
    driver.findElement(By.xpath("//input[@name='state']")).sendKeys("ssa");
    driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("1111");
    Select selectMultiple= new Select(driver.findElement(By.cssSelector("select[name='country']")));
    selectMultiple.selectByValue("ALBANIA");
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gg@hotmail.com");
driver.findElement(By.xpath("//tbody/tr[4]/td[1]/img[1]")).sendKeys("@ahmed");
driver.findElement(By.name("submit")).click();

}

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterEach
    void tearDown() throws InterruptedException {
        sleep(6000);
        driver.quit();
    }
}
