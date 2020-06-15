package com.thoughtworks;

public class FizzBuzz {
   public String say(int num){
       if (num%15 == 0){
           return "FizzBuzz";
        }
        if(num%3 == 0){
            return "Fizz";
        }
        if(num%5 == 0){
            return "Buzz";
        }
        if(num%7 == 0){
            return "Whizz";
        }
        return String.valueOf(num);
    }
}
