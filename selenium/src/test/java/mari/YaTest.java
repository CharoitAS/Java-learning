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

public class YaTest {

    WebDriver driver;

    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }
    
    @Test
    public void findVK()
    {
        driver.navigate().to("https://ya.ru/");
        driver.findElement(By.id("text")).sendKeys("Вк");
        driver.findElement(By.className("search3__button")).click();
        String title = driver.getTitle();
        Assertions.assertTrue(title.startsWith("Вк — Яндекс: ")); //("Вк — Яндекс: нашлось 27 млн результатов", title);
        String text = driver.findElement(By.className("organic__greenurl")).getText();
        Assertions.assertEquals("vk.com", text);
    }
}
