Feature: FizzBuzz Game Play

  Scenario: Play FizzBuzz Game to get Fizz
    Given Create a FizzBuzz game
    When when i play with number 5
    Then The result is "Fizz"

  Scenario: Play FizzBuzz Game to get Buzz
    Given Create a FizzBuzz game
    When when i play with number 3
    Then The result is "Buzz"

  Scenario: Play FizzBuzz Game to get FizzBuzz
    Given Create a FizzBuzz game
    When when i play with number 15
    Then The result is "FizzBuzz"