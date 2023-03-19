package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.Base;

public class Homepage {

    public Homepage(Base base){
        PageFactory.initElements(base.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@name, 'uid')]")
    WebElement inptUserID;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    WebElement inptPassword;

    @FindBy(xpath = "//input[contains(@name, 'btnLogin')]")
    WebElement btnLogin;

    public void setUsername(String username){
        inptUserID.sendKeys(username);
    }

    public void setPassword(String password){
        inptPassword.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }






}
