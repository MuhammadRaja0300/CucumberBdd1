package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= "src/test/java/Features/login.feature",
    glue={"StepDefinitions"},
    //tags= "@regression" ,
    plugin = {"pretty" , "html:target/cucumber-reports/report.html" , "json:target/cucumber.json" , "json:target/report.json"}
    
    
)
public class TestRunner {
}

