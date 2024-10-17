package resources.features;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= "src/test/java/features/login.feature",
    glue={"stepDefinitions"},
    //tags= "@regression" ,
        plugin = {"pretty", "json:target/report.json", "html:target/CucumberTestReport.html"}
    
    
)
public class TestRunner {
}

