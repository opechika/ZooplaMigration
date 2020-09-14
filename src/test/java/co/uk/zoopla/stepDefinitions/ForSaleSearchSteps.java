package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.CommercialSearchPage;
import co.uk.zoopla.pages.HomePage;
import co.uk.zoopla.pages.SearchResultPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleSearchSteps extends BasePage {

    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    SearchResultPage searchResultPage = PageFactory.initElements(driver, SearchResultPage.class);


    @Given("I navigate to zoopla homepage")
    public void iNavigateToZooplaHomepage() {

        launchUrl();
        homePage.clickOnCookieButton();
    }

    @When("I enter {string} into the search field")
    public void i_enter_into_the_search_field(String location) {

        homePage.enterLocation(location);
    }

    @When("I select {string} from Min price dropdown")
    public void i_select_from_min_price_dropdown(String minPrice) {
        homePage.selectMinPrice(minPrice);
    }

    @When("I select {string} from Max price dropdown")
    public void i_select_from_max_price_dropdown(String maxPrice) {
        homePage.selectMaxPrice(maxPrice);
    }

    @When("I select {string} from Property type dropdown")
    public void i_select_from_property_type_dropdown(String propertyType) {
        homePage.selectPropertyType(propertyType);
    }

    @When("I select {string} from Bedrooms dropdown")
    public void i_select_from_bedrooms_dropdown(String bed) {
        homePage.selectNoOfBeds(bed);
    }

    @When("I click on Search button")
    public void i_click_on_search_button() {
        searchResultPage = homePage.clickOnSearchButton();
    }

    @Then("search result page is displayed with relevant results")
    public void search_result_page_is_displayed_with_relevant_results() {
        searchResultPage.isPageTitleDisplayed();
        searchResultPage.isResultsDisplayed();
    }

    @Then("an error message is displayed on search field")
    public void an_error_message_is_displayed_on_search_field() {

    }

    @Then("an error page is displayed")
    public void an_error_page_is_displayed() {

    }


}
