package co.uk.zoopla.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager
{
    private WebDriver initialiseChrome()
    {
        WebDriverManager.chromedriver().setup();

        return new ChromeDriver();
    }

    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu", "--headless");

        return new ChromeDriver(options);
    }

    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    public void launchBrowser(String browser)
    {
        switch (browser)
        {
            case "Chrome":
                driver = initialiseChrome();
                break;
            case "Firefox":
                driver = initFirefox();
                break;
            case "Headless":
                driver = initHeadlessChrome();
                break;
            default:
                driver = initialiseChrome();
                break;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

}
