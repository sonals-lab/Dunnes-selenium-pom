package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    // Locators
    private By searchInput = By.id("search");
    private By searchButton = By.cssSelector("button[data-testid='header-search-icon']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void enterSearchTerm(String keyword) {
        driver.findElement(searchInput).sendKeys(keyword);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

    public SearchResultsPage searchFor(String keyword) {
        enterSearchTerm(keyword);
        clickSearch();
        return new SearchResultsPage(driver);
    }
}
