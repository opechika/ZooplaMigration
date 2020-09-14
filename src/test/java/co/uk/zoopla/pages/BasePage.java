package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends DriverManager
{
    public String BASE_URL = "https://www.zoopla.co.uk/";
    public Select select;
    public Actions actions;

    public void launchUrl()
    {
      driver.navigate().to(BASE_URL);
    }

    public void selectElementByText(WebElement element, String text)
    {
        select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectElementByValue(WebElement element, String value)
    {
        select = new Select(element);
        select.selectByValue(value);
    }

    public void selectElementByIndex(WebElement element, int index)
    {
        select = new Select(element);
        select.selectByIndex(index);
    }

    public void moveToElement(WebElement element)
    {
        actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
    }
}
