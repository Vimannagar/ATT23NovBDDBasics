package uiappfeature;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\uiappfeature\\Search.feature","src\\test\\resources\\uiappfeature\\Homepage.feature"},
		
		glue = {"uiappfeature"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		
		publish = true,
		
		dryRun = false
		
		
		
		)


public class AmazonTestRunner extends AbstractTestNGCucumberTests{

}
