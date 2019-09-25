package cucumber2.test1.copy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {
				"json:src/test/java/cucumber2/test1/copy/output/cucumber.json"
				})
public class runnerfile {
	

}
