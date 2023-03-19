package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Base {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver() {
        driver = new FirefoxDriver();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
}
