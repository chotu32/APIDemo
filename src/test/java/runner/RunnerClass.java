package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "./Features1", 
		tags = {"@tag, @tag1"}, 
		glue={"stepDefinition"}, 
		monochrome=true, 
		plugin = { "pretty","html:target/Cucumber-html-report","usage:target/cucumber-usage.json","junit:target/" + "Testing.xml" }
		)
//@Test
//public class RunnerClass extends AbstractTestNGCucumberTests {
public class RunnerClass {
	
}
