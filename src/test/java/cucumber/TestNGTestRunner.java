package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/cucumber", glue="sourishBakshiFrameworkAuto.StepDefinitions", 
monochrome=true, tags="@Regression", plugin= {
        "pretty","json:target/cucumber-report.json" })
public class TestNGTestRunner extends AbstractTestNGCucumberTests{
	
	

}
