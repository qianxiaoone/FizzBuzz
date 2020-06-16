package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_01N_when_input_00N_M(){
        //given
        MarsRover marsRover = new MarsRover();
        //when
        String location = marsRover.execute("00N", "M");
        //then
        Assert.assertEquals("01N",location);
    }
    @Test
    public void should_return_00W_when_input_00N_L(){
        //given
        MarsRover marsRover = new MarsRover();
        //when
        String location = marsRover.execute("00N", "L");
        //then
        Assert.assertEquals("00W",location);

    }
    @Test
    public void should_return_00E_when_input_00N_R(){}
    @Test
    public void should_return_0n1S_when_input_00S_M(){}
    @Test
    public void should_return_00E_when_input_00S_L(){}
    @Test
    public void should_return_00S_when_input_00S_R(){}
    @Test
    public void should_return_10E_when_input_00E_M(){}
    @Test
    public void should_return_00N_when_input_00E_N(){}
    @Test
    public void should_return_00S_when_input_00E_R(){}
    @Test
    public void should_return_n10W_when_input_00W_M(){}
    @Test
    public void should_return_00S_when_input_00W_L(){}
    @Test
    public void should_return_00N_when_input_00W_R(){}
    @Test
    public void should_return_13E_when_input_00N_MMMRM(){}
}
