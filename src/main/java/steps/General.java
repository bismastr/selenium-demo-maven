package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class General {



    public static WebDriver driver;

    @Given("open browser")
    public void openBrowser(){
        driver = new FirefoxDriver();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }
}
