package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import helper.AppiumDriverHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/features/",
		glue = "steps"
		//plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		//monochrome = false,
		//snippets = SnippetType.CAMELCASE,
		//dryRun = false,
		//strict = false
		)

public class RunnerTest {
	@BeforeClass
	public static void tearUp(){
		AppiumDriverHelper.getDriver();
	}

	@AfterClass
	public static void tearDown(){
		AppiumDriverHelper.killDriver();
	}

}
