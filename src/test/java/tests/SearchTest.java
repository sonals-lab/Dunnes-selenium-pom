package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

public class SearchTest extends BaseTest {

    @Test
    public void verifyProductSearch() {
        HomePage homePage = new HomePage(driver);
        SearchResultsPage resultsPage = homePage.searchFor("jacket");

        String header = resultsPage.getSearchHeader();
        System.out.println("Search Result Header: " + header);
        Assert.assertTrue(header.toLowerCase().contains("jacket"), "Search result header does not contain keyword");
    }
}

