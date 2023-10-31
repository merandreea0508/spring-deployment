package com.example.springdeployment.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/example/springdeployment/resources", tags = "",
        glue = "com.example.springdeployment.definitions", publish = true)

public class SpringRunnerTest {

}