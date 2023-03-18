package pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    WebDriver driver;

    @FindBy(xpath = "//input[contains(@name, 'uid')]")
    WebElement inptUserID;

    @FindBy(xpath = "//input[contains(@name, 'password')]")
    WebElement inptPassword;

    @FindBy(xpath = "//input[contains(@name, 'btnLogin')]")
    WebElement btnLogin;

    public Homepage(WebDriver driver){
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

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
