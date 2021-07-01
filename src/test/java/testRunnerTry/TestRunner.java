package testRunnerTry;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestRunner {

    public WebDriver runChrome() {
        WebDriverManager.chromedriver().browserVersion("91.0.4472.77").setup();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("enable-automation");

        return new ChromeDriver(options);
    }
}
