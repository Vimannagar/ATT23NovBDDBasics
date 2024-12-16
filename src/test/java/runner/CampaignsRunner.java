package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Campaign.feature"},
		
		glue = {"steps", "hooks"},
		
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		
		tags = "@regression"	
		
		
		
		
		)




public class CampaignsRunner extends AbstractTestNGCucumberTests {

}
