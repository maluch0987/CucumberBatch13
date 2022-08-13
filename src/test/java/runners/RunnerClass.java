package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //feature we use to provide the paft of all the feature file
        features = "src/test/resources/features/Login.feature",
        //glue is where we find implementation for gherkin steps
        //we provide the path of package where we difined all the steps
        glue = "steps"
)

public class RunnerClass {

}
