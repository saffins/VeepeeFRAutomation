package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserDriver {

    public static WebDriver driver;

    static WebDriverWait wait;


    public ChromeOptions options;


    public BrowserDriver(BrowserDriver driver){
        this.driver= BrowserDriver.driver;
        this.driver = new ChromeDriver();
        wait=new WebDriverWait(this.driver, Duration.ofSeconds(20));

    }

    public void close(){
        this.driver.close();
    }
}
