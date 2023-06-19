package mari;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

class AppTest {

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
    public void HelloVasya()
    {
        driver.navigate().to("адрес сайта"); // открыть страницу
        driver.findElement(By.name("name")).sendKeys("Вася"); //ищем элемент у которого name = "name" и вбиваем туда "Вася"
        driver.findElement(By.className("button")).click(); // ищем кнопку и кликаем по ней
        String text = driver.findElement(By.className("start-screen__res")).getText();
        Assertions.assertEquals("Привет, Вася!", text);
    }
    

}