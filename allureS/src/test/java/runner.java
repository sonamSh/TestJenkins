import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;
//import org.junit.runner.RunWith;



//for running cucumber project with junit
  /*  @RunWith(Cucumber.class)
    @CucumberOptions(
            format = {
                    "json:target/cucumber/wikipedia.json",
                    "html:target/cucumber/wikipedia.html",
                    "pretty"
            },
            tags = {"@billingScenario"}
    )*/
//for running cucumber project with junit



//for allure use only this cucumberoption format otherwise cucumberRunnerException will be thrown
@CucumberOptions(
        features = { "classpath:billing.feature"}, tags = { "@billingScenario" },
        strict = true,
        plugin = { "pretty", "io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm" } )

//AbstractTestNGCucumberTests github jar available on  ======>compile group: 'io.cucumber', name: 'cucumber-testng', version: '2.4.0'
    public class runner extends ParentRunner{

}
