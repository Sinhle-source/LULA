package Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Bases {

    public static Properties properties;
    public static WebDriver driver = null;

    public Bases() {

        try{
            properties = new Properties();
            FileInputStream files = new FileInputStream("src/test/resources/config.properties");
            properties.load(files);

        }catch (IOException e) {
            e.getMessage();
        }
    }

    public static void driverSetUp(){
        String browserName = properties.getProperty("browser");

        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);
        }

        else if (browserName.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/gecko.exe");
            driver = new FirefoxDriver();
        }
        else {
            System.out.println("Driver not found");
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get(properties.getProperty("url"));
    }

}
