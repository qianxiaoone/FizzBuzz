package com.thoughtworks;

public class MarsRoverPosition {
    private int xCoor;
    private int yCoor;
    private String direction;


    public MarsRoverPosition(int xCoor, int yCoor, String direction) {
        this.xCoor = xCoor;
        this.yCoor = yCoor;
        this.direction = direction;
    }

    public int getxCoor() {
        return xCoor;
    }

    public void setxCoor(int xCoor) {
        this.xCoor = xCoor;
    }

    public int getyCoor() {
        return yCoor;
    }

    public void setyCoor(int yCoor) {
        this.yCoor = yCoor;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "MarsRoverPosition{" +
                "xCoor=" + xCoor +
                ", yCoor=" + yCoor +
                ", direction='" + direction + '\'' +
                '}';
    }
}
