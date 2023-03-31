package Index_Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/feature_Files"},

			glue = {"steps_definations"},
					publish = true, monochrome = true, dryRun = false, 
			tags = "@vwoapplication"
		
		)



public class IndexRunnner_Login {

	
	
}
