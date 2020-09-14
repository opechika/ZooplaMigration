package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.CommercialSearchPage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class ForSaleTabSteps extends BasePage
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    CommercialSearchPage commercialSearchPage = PageFactory.initElements(driver, CommercialSearchPage.class);


    @When("I hover over the For Sale link")
    public void i_hover_over_the_for_sale_link() {
        homePage.hoverOverForSaleTab();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @When("I click on UK commercial properties for sale")
    public void i_click_on_uk_commercial_properties_for_sale() {
        commercialSearchPage = homePage.clickOnCommercialLink();
    }

    @Then("For Sale page is displayed")
    public void for_sale_page_is_displayed() {

    }

}
