package com.basil.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java8.En;
import org.junit.Assert;
import org.springframework.http.HttpStatus;

/**
 * Created by beldho on 5/28/2016.
 */
public class CucumberStepDefintions extends SprLoader implements En {

    public CucumberStepDefintions() {
        Given("send the request for (\\w+)", (String request) -> {
            System.out.println("Request send with paramter " + request);
            try {
                executeGet("http://localhost:8080/hello/basil");
            } catch (Exception e) {

            }

        });

        Given("respone should be (\\w+)", (String responseCode) -> {
            try {
                System.out.println(latestResponse.getTheResponse().toString());
                Assert.assertTrue(latestResponse.getTheResponse().getStatusCode().equals(HttpStatus.OK));
            } catch (Exception e) {
                Assert.fail();
            }
            System.out.println("respone should be " + responseCode);
        });

        Given("respone contain (\\w+)", (String responseTest) -> {
            try {
                assert latestResponse.getBody().equals("basil");
            } catch (Exception e) {
                Assert.fail();
            }
            System.out.println("respone should be " + responseTest);
        });
    }

   @Given("the host is up")
   public void host_is_up() {
       try {
       } catch (Exception e) {
           System.out.println("Failed the exception");
       }
}
}
