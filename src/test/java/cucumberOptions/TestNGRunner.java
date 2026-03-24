package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/features",
glue = "stepDefinitions",
monochrome = true,
tags="@TestTag",
plugin = {"pretty", "html:target/cucumberReport.html", "json:target/cucumberReport.json"},
dryRun=true
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}