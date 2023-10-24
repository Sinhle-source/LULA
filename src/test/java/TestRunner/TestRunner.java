package TestRunner;
import com.cucumber.listener.Reporter;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = "stepDefinitions",
        plugin = {"pretty",
                    "json:target/cucumber-reports/cucumber.json",
                    "html:target/cucumber-reports/cucumber.html",
                    },
        tags = "@sauce",
        monochrome = true
)
public class TestRunner {



}
