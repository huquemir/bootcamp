package orange.ny.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		
		//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		//format ="",		
		features = {".//Fetatures/"}, 
        glue = {"com.stepdefinations","com.hooks"}, 	
		dryRun = false, 
		monochrome = true, 
		strict = false,
		tags = {"@Sanity"})
public class MyRunner {

}
