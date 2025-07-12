package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
    public static WebDriver initDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
