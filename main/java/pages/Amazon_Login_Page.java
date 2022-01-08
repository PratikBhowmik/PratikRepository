package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class Amazon_Login_Page extends BaseClass {
    @FindBy(id = "nav-link-accountList-nav-line-1")
    WebElement signinbutton;

    @FindBy(name = "email")
    WebElement emailfield;

    @FindBy(className = "a-button a-button-span12 a-button-primary")
    WebElement emailcontinuebutton;

    @FindBy(name = "password")
    WebElement passwordfield;

    @FindBy(id = "signInSubmit")
    WebElement passwordcontinuebutton;

    public Amazon_Login_Page() {
        PageFactory.initElements(driver, this);
    }

    public boolean validateLoginPageTitle() {
        return signinbutton.isDisplayed();
    }

    public Amazon_Home_Page login(String un , String pwd){
        emailfield.sendKeys("username");
        emailcontinuebutton.click();
        passwordfield.sendKeys("password");
        passwordcontinuebutton.click();
        return new Amazon_Home_Page();
    }
}
