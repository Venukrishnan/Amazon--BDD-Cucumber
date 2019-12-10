import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"D:/workspace1213/workspace1213/Amazon_Bdd/src/test/resources/login.feature:13"},
        plugin = {"json:D:/workspace1213/workspace1213/Amazon_Bdd/target/cucumber-parallel/json/3.json"},
        monochrome = true,
        glue = {"stepDefinitions"})
public class Parallel03IT {
}
