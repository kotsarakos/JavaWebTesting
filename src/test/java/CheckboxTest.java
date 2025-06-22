import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckboxTest {

    @Test
    void testCheckboxes() throws InterruptedException{
        // path chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver-win64\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();  // open chrome
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        // spot the checkboxes
        WebElement checkbox1 = driver.findElements(By.cssSelector("input[type='checkbox']")).get(0);
        WebElement checkbox2 = driver.findElements(By.cssSelector("input[type='checkbox']")).get(1);

        
        if (!checkbox1.isSelected()) checkbox1.click();
        if (!checkbox2.isSelected()) checkbox2.click();

        
        assertTrue(checkbox1.isSelected(), "Checkbox 1 is not checked");
        assertTrue(checkbox2.isSelected(), "Checkbox 2 is not checked");


        
        Thread.sleep(15000);

        driver.quit();  
    }
}
