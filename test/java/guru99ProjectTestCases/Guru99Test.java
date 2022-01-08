package guru99ProjectTestCases;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.UtilGuru;

public class Guru99Test {

    private WebDriver driver;
    private String baseUrl;

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(UtilGuru.BASE_URL);
        driver.manage().window().maximize();

    }

    @DataProvider(name = "testGuruWithData")
    public Object[][] loginData() throws Exception {
        return UtilGuru.getDataFromExcel(UtilGuru.FILE_PATH, UtilGuru.SHEET_NAME, UtilGuru.TABLE_NAME);
    }

    @Test(dataProvider = "testGuruWithData")
    public void guru99Test() throws FileNotFoundException {

        String username, password, actualTitle, actualBoxMessage;

        driver.findElement(By.name("emailid")).sendKeys(UtilGuru.USER_NAME);
        driver.findElement(By.name("btnLogin")).click();

        try {
            Alert al = driver.switchTo().alert();
            actualBoxMessage = al.getText();
            al.accept();
            assertEquals(actualBoxMessage, UtilGuru.EXPECTED_ERROR);
        } catch (NoAlertPresentException e) {
            actualTitle = driver.getTitle();
            assertEquals(actualTitle, UtilGuru.EXPECTED_TITLE);

        }

        actualTitle = driver.getTitle();

        if (actualTitle.contains(UtilGuru.EXPECTED_TITLE)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
