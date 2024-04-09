package com.training.runner;

import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\shiga\\feb2024Workspace\\CucumberBasics\\Features\\LoginTekarch.feature",
glue= {"com.training.steps"},         
plugin= {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"})
public class Runner {//properties you got full path


}