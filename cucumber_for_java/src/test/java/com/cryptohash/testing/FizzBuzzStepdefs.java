package com.cryptohash.testing;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FizzBuzzStepdefs {

    FizzBuzz fizzBuzz ;
    String result;

    @Given("^Create a FizzBuzz game$")
    public void createAFizzBuzzGame() throws Throwable {
         fizzBuzz= new FizzBuzz();
//        throw new PendingException();
    }

    @When("^when i play with number (\\d+)$")
    public void whenIPlayWithNumber(int number) throws Throwable {
        result = fizzBuzz.play(number);
//        throw new PendingException();
    }

/*
    @Then("^The result is Fizz$")
    public void theResultIsFizz() throws Throwable {
        Assertions.assertEquals(result,"Fizz");
    }
*/

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String resultString) throws Throwable {
        Assertions.assertEquals(resultString,result);
    }
}
