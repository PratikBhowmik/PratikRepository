package jobSearchPageAutomation;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkedlnSearchAutomation {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("emailid")).sendKeys("impratikbhowmik@gmail.com");
        driver.findElement(By.name("btnLogin")).click();

    }

}
