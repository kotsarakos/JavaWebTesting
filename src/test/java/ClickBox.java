import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickBox {

    @Test
    void testArrowKeysIncreaseValue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/inputs");

        WebElement input = driver.findElement(By.tagName("input"));

        
        input.sendKeys(Keys.ARROW_UP);
        input.sendKeys(Keys.ARROW_UP);

        
        Thread.sleep(3000);

        
        String value = input.getAttribute("value");

        
        assertEquals("2", value);

        driver.quit();
    }
}
