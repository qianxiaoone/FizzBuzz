package com.thoughtworks;

public class MarsRover implements MarsRoverContants {
    public String execute(int xCoor, int yCoor, String direc, String moveCommand) {
        MarsRoverPosition marsRoverPosition = new MarsRoverPosition(xCoor,yCoor,direc);
        for (int i = 0; i < moveCommand.length(); i++) {
            String command = String.valueOf(moveCommand.charAt(i));
            if (isDirCommand(command)) {
                direc = turnDirec(marsRoverPosition.getDirection(), command);
                marsRoverPosition.setDirection(direc);
            }
            if (NORTH.equals(direc)) {
                if (MOVEACTION.equals(command)) {
                    yCoor += 1;
                    marsRoverPosition.setyCoor(yCoor);
                }
            }
            if (SOUTH.equals(direc)) {
                if (MOVEACTION.equals(command)) {
                    yCoor -= 1;
                    marsRoverPosition.setyCoor(yCoor);
                }
            }
            if (WEST.equals(direc)) {
                if (MOVEACTION.equals(command)) {
                    xCoor -= 1;
                    marsRoverPosition.setxCoor(xCoor);
                }
            }
            if (EAST.equals(direc)) {
                if (MOVEACTION.equals(command)) {
                    xCoor += 1;
                    marsRoverPosition.setxCoor(xCoor);
                }
            }
        }
//        return String.valueOf(xCoor) + String.valueOf(yCoor) + direc;
        return marsRoverPosition.toString();
    }

    private boolean isDirCommand(String command) {
        if (TURNACTION.contains(command)) {
            return true;
        }
        return false;
    }

    public String turnDirec(String initDir, String turnAction) {
        if (initDir.equals(NORTH)) {
            if (RIGHT.equals(turnAction)) {
                return EAST;
            }
            if (LEFT.equals(turnAction)) {
                return WEST;
            }
        }
        if (initDir.equals(SOUTH)) {
            if (RIGHT.equals(turnAction)) {
                return WEST;
            }
            if (LEFT.equals(turnAction)) {
                return EAST;
            }
        }
        if (initDir.equals(WEST)) {
            if (RIGHT.equals(turnAction)) {
                return NORTH;
            }
            if (LEFT.equals(turnAction)) {
                return SOUTH;
            }
        }
        if (initDir.equals(EAST)) {
            if (RIGHT.equals(turnAction)) {
                return SOUTH;
            }
            if (LEFT.equals(turnAction)) {
                return NORTH;
            }
        }
        return null;
    }
}
