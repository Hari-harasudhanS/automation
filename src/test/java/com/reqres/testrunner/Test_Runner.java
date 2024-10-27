package com.reqres.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features ="D:\\Selenium Workspace\\automation\\src\\test\\java\\com\\reqres\\feature\\file.feature",
glue="com.reqres.stepdef",tags = "@Group"
//,dryRun = true
,plugin = {"html:Reports/htmlreport"
		,"pretty"
		,"json:Reports/jsonreport"
        ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"		
})

public class Test_Runner {

}
