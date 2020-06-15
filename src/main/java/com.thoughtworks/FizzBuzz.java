package com.thoughtworks;

public class FizzBuzz {
   public String say(int num){
        if(num%3 == 0){
            return "Fizz";
        }
        return String.valueOf(num);
    }
}
