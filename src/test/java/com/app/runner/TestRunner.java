package com.app.runner;

import com.app.utils.GenerateReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@Pf",
        glue = "com/app/stepDefinition",
        dryRun = false,
        monochrome = true,
        plugin = {"json:src/test/resources/reports/TestReport.json"}
)
public class TestRunner {
    @AfterClass
    public static void generateReport(){
        GenerateReport.JVMReport("src/test/resources/reports/TestReport.json");
    }
}
