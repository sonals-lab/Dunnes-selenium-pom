package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchResultsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By resultHeader = By.cssSelector("h1");

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getSearchHeader() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultHeader));
        return driver.findElement(resultHeader).getText();

    }
}

