package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import qa.DriverFactory;
import utility.PropReader;

public class ApplicationHooks {
	
	WebDriver driver;
	
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		 String browserName = PropReader.readPropData("browser");
		 
		 String commandPromptBrowserName = System.getProperty("cliBrowser");
		 
		 if(commandPromptBrowserName!=null)
		 {
			 browserName = commandPromptBrowserName;
		 }
		 
		 System.out.println("Received browsername from command prompt is "+commandPromptBrowserName);
		 
		String envValue = System.getProperty("env");
		
		System.out.println("The value of env received from cmd is : "+envValue);
		
		 driver = df.initBrowser(browserName);
		 
		 driver.manage().window().maximize();
	}
	
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
	boolean isScenarioFailed = scenario.isFailed();// to check if the scenario is passed / failed based on true / false
		
	if(isScenarioFailed)
		
	{
		String scenarioName = scenario.getName();
		
		String newScenarioName = scenarioName.replaceAll(" ", "_");// replacing all the spaces from the scenario name 
		
		TakesScreenshot ts = (TakesScreenshot)driver;
					
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);// in cucumber we have to capture the screenshot in terms of byte []
		
		scenario.attach(source, "image/png", newScenarioName);
	}
	}
	
	
	@After(order = 1)
	public void quitBrowser()
	{
		driver.quit();
	}

}
