package com.cryptohash.testing;

public class FizzBuzz {

    public String play(int number){
        if(number==0) throw new IllegalArgumentException("number must be greater than 0");
        if(number%5==0  && number%3==0) return "FizzBuzz";
        else if(number % 5 ==0) return  "Fizz";
        else if(number%3==0)return "Buzz";
        return String.valueOf(number);

    }
}
