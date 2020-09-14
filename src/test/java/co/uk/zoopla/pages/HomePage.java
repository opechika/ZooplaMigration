package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "search-input-location")
    private WebElement locationField;
    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement cookieButton;
    @FindBy(name = "price_min")
    private WebElement minPrice;
    @FindBy(name = "price_max")
    private WebElement maxPrice;
    @FindBy(name = "property_type")
    private WebElement property;
    @FindBy(name = "beds_min")
    private WebElement noOfBeds;
    @FindBy(css = ".button.button--primary")
    private WebElement searchButton;
    @FindBy(css = "[href='/for-sale/']")
    private WebElement forSaleTab;
    @FindBy(css = "[href='/for-sale/commercial/']")
    private WebElement commercialLink;



    public void enterLocation(String location)
    {
        locationField.sendKeys(location);
        locationField.click();

    }

    public void clickOnCookieButton()
    {
        cookieButton.click();
    }

    public void selectMinPrice(String miniPrice)
    {
        selectElementByText(minPrice, miniPrice);
    }

    public void selectMaxPrice(String maxiPrice)
    {
        selectElementByText(maxPrice, maxiPrice);
    }

    public void selectPropertyType(String prop)
    {
        selectElementByText(property, prop);
    }

    public void selectNoOfBeds(String beds)
    {
        selectElementByText(noOfBeds, beds);
    }

    public SearchResultPage clickOnSearchButton()
    {
        searchButton.click();
        return new SearchResultPage(driver);
    }

    public void hoverOverForSaleTab()
    {
        moveToElement(forSaleTab);
    }

    public CommercialSearchPage clickOnCommercialLink()
    {
        commercialLink.click();
        return new CommercialSearchPage(driver);
    }
}
