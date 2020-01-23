package myRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\Eclipse2018-09\\Cricbuzz\\src\\main\\java\\Feature\\cricbuzz.feature"
		,glue={"stepDefinition"},format= {"pretty","html:test-output"}
		)


public class Runner {

}
