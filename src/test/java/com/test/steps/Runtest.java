package com.test.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/"},
        features = {"src/test/resources/features"},
        tags = {"@test"},
        glue = {"com.test"}
)
public class Runtest {
@AfterClass
    public static void closeApp () {

    Hooks.quitDriver();

    }
}
