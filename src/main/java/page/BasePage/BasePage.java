package page.BasePage;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class BasePage {
    public static WebDriver driver;
    public WebDriverWait wait;
    public Random random;
    public Faker faker;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        faker = new Faker();
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        random = new Random();
    }
}
