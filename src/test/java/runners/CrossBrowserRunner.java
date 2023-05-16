package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/resources/features/crossBrowser.feature" ,
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@firefox"


)
public class CrossBrowserRunner {
}
