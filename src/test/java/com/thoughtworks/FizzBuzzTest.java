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
}
