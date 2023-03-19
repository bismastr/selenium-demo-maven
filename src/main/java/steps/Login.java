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
    Base base;

    public Login(Base base) {
        this.base = base;
        home = new Homepage(base);
    }

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        base.getDriver().get("http://demo.guru99.com/V4/");
    }

    @When("user enter {} and {}")
    public void userEnterAnd(String email, String password) {
        home.setUsername(email);
        home.setPassword(password);
    }

    @And("user click login button")
    public void userClickLoginButton() {
        home.clickBtnLogin();
    }

    @Then("verify user redirected to homepage")
    public void verifyUserRedirectedToHomepage() {
        System.out.println("im in homepage");
    }
}
