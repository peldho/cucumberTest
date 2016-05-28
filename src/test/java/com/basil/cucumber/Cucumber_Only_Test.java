package com.basil.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by beldho on 5/28/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber",plugin = {"pretty", "html:target/cucumber"})
public class Cucumber_Only_Test {
    @Test
    public void test() {

    }
}
