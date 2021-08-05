package TestRunners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//6F83-VUTKR//IdeaProjects//BDDJava//Features//youtube.feature",
        glue ="stepdefinitions",
        monochrome=true,
        dryRun=false,
        plugin= {"pretty"}
)
public class TestRunner {





}
