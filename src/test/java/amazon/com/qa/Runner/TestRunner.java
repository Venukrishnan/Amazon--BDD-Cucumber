/***************************************************************************

*                                                                          *

*             Page details:  This is the Test Runner class to initiate the *
                             test execution
*             Author:        Venukrishnan VR                               *

*                                                                          *

*                                                                          *

***************************************************************************/

package amazon.com.qa.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true
				 ,features={"src\\test\\resources\\ProductSearch.feature"}
				 ,monochrome=true
				 ,glue={"amazon.com.qa.stepDefinitions"}	
				 ,plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}
				 ,tags={"@Chrome"}
				 ,dryRun=false
		)

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
	//Reporter.loadXMLConfig (new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
	Reporter.setSystemInfo("user", System.getProperty("user.name"));
	Reporter.setSystemInfo("os", "Mac OSX");
	Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}