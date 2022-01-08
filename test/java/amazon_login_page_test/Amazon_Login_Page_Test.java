package amazon_login_page_test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.Amazon_Login_Page;

public class Amazon_Login_Page_Test extends BaseClass {

    Amazon_Login_Page loginside;

    public Amazon_Login_Page_Test() {
        super();
        loginside = new Amazon_Login_Page();
    }

    @BeforeMethod
    public void setup() {
        Initialization();
    }

    @Test(priority = 1)
    public void loginPageTitleTest() {
        Boolean title = loginside.validateLoginPageTitle();
        Assert.assertEquals(title, " Online Shopping site for India: Shop online for Mobiles,Books,Watches...");

    }

    @Test(priority = 2)
    public void loginTest() {
        loginside.login(prop.getProperty("un"), prop.getProperty("pwd"));

    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
