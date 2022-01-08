package guru99SeleniumProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.UtilGuru;

public class Guru99AutomationProject {

    public static void main(String[] args) throws FileNotFoundException {

        String userName, password, actualBoxTitle, actualTitle;

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(UtilGuru.BASE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.name("emailid")).sendKeys(UtilGuru.USER_NAME);
        driver.findElement(By.name("btnLogin")).click();

        actualTitle = driver.getTitle();

        if (actualTitle.contains(UtilGuru.EXPECTED_TITLE)) {
            System.out.println("Test case passed");
        } else {
            System.out.println("Test case failed");
        }

        driver.close();

        // Parameterization of the test script

        File src = new File(UtilGuru.FILE_PATH);
        FileInputStream file = new FileInputStream(src);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet1 = wb.getSheetAt(0);
        String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(data0);

    }

}
