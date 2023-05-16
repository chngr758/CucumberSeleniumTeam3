package stepdefinitions;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class crossBrowserStepDefinition {




    @Given("kullanıcı chrome browserı acar")
    public void kullanıcıChromeBrowserıAcar() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

    }

    @Given("kullanıcı firefox browserı acar")
    public void kullanıcıFirefoxBrowserıAcar() {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");

    }

}
