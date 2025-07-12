package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LandingPage {
    private WebDriver driver;
    private WebDriverWait wait;

    // Locator for the 'Accept All Cookies' button — adjust based on your site
    private By acceptCookiesBtn = By.xpath("//button[text()='Accept All Cookies']");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        // 10 seconds explicit wait
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Accept cookies if the banner appears.
     * If banner not found, this method just silently continues.
     */
    public void acceptCookiesIfPresent() {
        try {
            WebElement acceptBtn = wait.until(ExpectedConditions.elementToBeClickable(acceptCookiesBtn));
            acceptBtn.click();
            System.out.println("Accepted cookies.");
        } catch (TimeoutException e) {
            // Cookie banner not present, no action needed
            System.out.println("Cookie banner not found, continuing.");
        }
    }
}
