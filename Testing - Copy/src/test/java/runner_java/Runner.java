package runner_java;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/cucumber/resource_feature",
        glue = "StepDef",
        plugin = {"html:target/HTML_report.html"}
//        tags = "@CheckoutItem"

)
public class Runner {
}
