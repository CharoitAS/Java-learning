package mari;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class GoTest {

     WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //добавила задержку в 10 сек., чтобы страница успевала обновиться 
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test
    public void goVK()
    {
        driver.navigate().to("https://www.google.ru/");
        driver.findElement(By.id("APjFqb")).sendKeys("Вк");
        driver.findElement(By.className("gNO89b")).click();
        String address = driver.findElement(By.className("VuuXrf")).getText();
        Assertions.assertEquals("vk.com", address);
    }
    
}
