package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
//		features = {"src\\test\\resources\\uiappfeature"},
		
		features = {"@target/failedrun.txt"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html",
					"rerun:target/failedrun.txt"
		
		},
		
		publish = true
		
		
		
		)


public class AmazonFailedTestRunner extends AbstractTestNGCucumberTests{

}
