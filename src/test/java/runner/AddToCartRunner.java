package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\akumaresan2\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Features\\AddToCart.feature",
glue="com.StepDefinition",
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class AddToCartRunner {

}