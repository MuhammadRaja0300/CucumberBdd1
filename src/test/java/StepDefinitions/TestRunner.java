package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= "src/test/java/Features/login.feature",
    glue={"StepDefinitions"},
    //tags= "@regression" ,
        plugin = {"pretty", "json:target/CucumberTestReport.json", "html:target/CucumberTestReport.html"}
    
    
)
public class TestRunner {
}

