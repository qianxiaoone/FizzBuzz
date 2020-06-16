package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {
    @Test
    public void should_return_01N_when_input_00N_M() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 1, "N");
        //when
        String location = marsRover.execute(0, 0, "N", "M");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00W_when_input_00N_L() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        //when
        String location = marsRover.execute(0, 0, "N", "L");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);

    }

    @Test
    public void should_return_00E_when_input_00N_R() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");
        //when
        String location = marsRover.execute(0, 0, "N", "R");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_0n1S_when_input_00S_M() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, -1, "S");
        //when
        String location = marsRover.execute(0, 0, "S", "M");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00E_when_input_00S_L() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "E");
        //when
        String location = marsRover.execute(0, 0, "S", "L");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00W_when_input_00S_R() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "W");
        //when
        String location = marsRover.execute(0, 0, "S", "R");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_10E_when_input_00E_M() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(1, 0, "E");
        //when
        String location = marsRover.execute(0, 0, "E", "M");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00N_when_input_00E_L() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        //when
        String location = marsRover.execute(0, 0, "E", "L");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00S_when_input_00E_R() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");
        //when
        String location = marsRover.execute(0, 0, "E", "R");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_n10W_when_input_00W_M() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(-1, 0, "W");
        //when
        String location = marsRover.execute(0, 0, "W", "M");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00S_when_input_00W_L() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "S");
        //when
        String location = marsRover.execute(0, 0, "W", "L");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_00N_when_input_00W_R() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(0, 0, "N");
        //when
        String location = marsRover.execute(0, 0, "W", "R");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }

    @Test
    public void should_return_13E_when_input_00N_MMMRM() {
        //given
        MarsRover marsRover = new MarsRover();
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(1, 3, "E");
        //when
        String location = marsRover.execute(0, 0, "N", "MMMRM");
        //then
        Assert.assertEquals(marsRoverPosition.toString(), location);
    }
}
