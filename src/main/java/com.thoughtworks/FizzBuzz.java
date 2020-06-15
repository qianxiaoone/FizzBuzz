package com.thoughtworks;

public class FizzBuzz {
    public String say(int num) {
        String result = "";
        if (num % 3 == 0) {
            result += "Fizz";
        }
        if (num % 5 == 0) {
            result += "Buzz";
        }
        if (num % 7 == 0) {
            result += "Whizz";
        }
        if ("".equals(result)) {
            result = String.valueOf(num);
        }
        return result;
    }
}
