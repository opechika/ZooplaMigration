package co.uk.zoopla.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultPage extends BasePage
{
    public SearchResultPage(WebDriver driver)
    {
        this.driver  = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(tagName = "h1")
    private WebElement pageTitle;
    @FindBy(css = ".listing-results-price.text-price")
    private List<WebElement> results;

    public void isPageTitleDisplayed()
    {
        Assert.assertTrue(pageTitle.isDisplayed());
    }

    public void isResultsDisplayed()
    {
        Assert.assertTrue(results.size() > 0);
    }
}
