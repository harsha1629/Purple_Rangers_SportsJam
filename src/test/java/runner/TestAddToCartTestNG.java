package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = "json:target/cucumber-report.json",features="C:\\Users\\akumaresan2\\eclipse-workspace\\Purple_Rangers-Pilot_Project\\SportsJam\\src\\test\\resources\\Features",
glue="com.StepDefinition")


public class TestAddToCartTestNG extends AbstractTestNGCucumberTests {

}
