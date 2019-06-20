package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features= "C:\\Workspace\\SimpleBDDFramework\\src\\main\\java\\Features\\LoginwithMaps.feature"
			,glue = {"stepDefinations"},
			format= {"pretty","html:test-output", "json:json_output/cucumber.json"},// we can define in multiple format like html, json
			monochrome= true,// generate o\p in readable format
			strict=true,
			dryRun =false
		        
		
		)

public class TestRunner {

}
