package Runner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    plugin = {"html:target/cucumber-reports/cucumber-reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
	    features = "./src/test/resources/features",
	    glue = {"Steps"}
	)
public class RunCuke extends AbstractTestNGCucumberTests{

}