package bddframe;


import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"Bddframework/Bdd.feature"},
                 glue= {"src/main/java/bddframe/Cucumber.java"},
                 plugin= {"pretty","html:target/htmlreport.html"}
)
public class Testrunfile {


}
