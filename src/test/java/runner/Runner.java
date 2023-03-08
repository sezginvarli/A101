package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/html-reports/cucumber.html",
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@a101_alısveris",
        dryRun = false
)
public class Runner {
}
