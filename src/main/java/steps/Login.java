package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.home.Homepage;

import static steps.General.driver;

public class Login {


    Homepage home;





    @Given("user is on login page")
    public void userIsOnLoginPage() {
        driver.get("http://demo.guru99.com/V4/");
    }

    @When("user enter {} and {}")
    public void userEnterAnd(String email, String password) {
        home = new Homepage(driver);

        home.setUsername(email);
        home.setPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        home = new Homepage(driver);

        home.clickBtnLogin();
    }

    @Then("verify user redirected to homepage")
    public void verifyUserRedirectedToHomepage() {
        System.out.println("im in homepage");
    }
}
