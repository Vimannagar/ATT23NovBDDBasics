package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src//test//resources//uiappfeature"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html",
				"json:target/cucumber-report.json"},
		
		publish = true,
		
		dryRun = false
		
		
		
		)


public class AmazonTestRunner extends AbstractTestNGCucumberTests{

}
