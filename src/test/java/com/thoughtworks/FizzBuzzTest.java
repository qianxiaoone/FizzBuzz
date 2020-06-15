package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shoud_return_1_when_input_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 1;

        //then
        Assert.assertEquals("1", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_Fizz_when_input_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 3;

        //then
        Assert.assertEquals("Fizz", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_Buzz_when_input_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 5;

        //then
        Assert.assertEquals("Buzz", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_FizzBuzz_when_input_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 15;

        //then
        Assert.assertEquals("FizzBuzz", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_Whizz_when_input_7(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 7;

        //then
        Assert.assertEquals("Whizz", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_BuzzWhizz_when_input_70(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 70;

        //then
        Assert.assertEquals("BuzzWhizz", fizzBuzz.say(num));
    }

    @Test
    public void shoud_return_FizzBuzzWhizz_when_input_105(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 105;

        //then
        Assert.assertEquals("FizzBuzzWhizz", fizzBuzz.say(num));
    }
    @Test
    public void shoud_return_Fizz_when_input_13(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        int num = 13;

        //then
        Assert.assertEquals("Fizz", fizzBuzz.say(num));
    }
}
