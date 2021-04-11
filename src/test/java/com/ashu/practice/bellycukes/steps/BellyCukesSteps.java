package com.ashu.practice.bellycukes.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.ashu.practice.bellycukes.Belly;

import static org.junit.Assert.assertEquals;

public class BellyCukesSteps {
    private Belly belly;
    private int waitingTime;

    @Given("^I have (\\d+) (?:cuke|cukes) in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        belly = new Belly();
        belly.eatCukes(cukes);
    }

    
    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	waitingTime=arg1;
    }
    
    @Then("^My belly should (?:be )?\"([^\"]*)\"$")
    public void my_belly_should(String expectedSound) throws Throwable {
        String actualSound = belly.getSound(waitingTime);
        assertEquals(actualSound, expectedSound);
    }
}
