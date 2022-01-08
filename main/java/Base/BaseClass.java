package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;

    public BaseClass() {
        prop = new Properties();
        FileInputStream ip;
        try {
            ip = new FileInputStream(
                    "src//main//java//config//properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void Initialization() {
        String browserName = prop.getProperty("browser");
        if (browserName.equals("Chrome")) {
            WebDriverManager.chromedriver().setup();
        } else if (browserName.equals("FF")) {
            WebDriverManager.firefoxdriver().setup();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        driver.get(prop.getProperty("url"));

    }
}
