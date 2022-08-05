package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(
		features="C:\\Users\\hp\\eclipse-workspace\\BDDAutomation\\src\\main\\java\\features\\login.feature"
		,glue= {"stepDefinations"},
		dryRun=false
		
		
		)

public class TestRunner {

}
