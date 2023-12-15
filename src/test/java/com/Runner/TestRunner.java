package com.Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(plugin = "json:target/cucumber-report.json",features="C:\\Pilot project Push\\PurpleRangers_PilotProject\\src\\test\\resources\\Features",
glue="com.StepDefinition")
public class TestRunner extends AbstractTestNGCucumberTests {
	
}