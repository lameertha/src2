package Whct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTesting {
    public static void main(String[] args) {
        String baseUrl="https://www.wcht.org.uk/";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        driver.quit();
        String title=driver.getTitle();
        driver.navigate().to("https://www.wcht.org.uk/");
        System.out.println("Main page"+title);
        driver.quit();

    }

}
