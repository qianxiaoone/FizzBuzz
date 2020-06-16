package com.thoughtworks;

public class MarsRover {
    public String execute(String initCoor, String moveCommand) {
        int xCoor = Integer.parseInt(initCoor.substring(0, 1));
        int yCoor = Integer.parseInt(initCoor.substring(1, 2));
        String direc = initCoor.substring(2, 3);
        for (int i = 0; i < moveCommand.length(); i++) {
            String command = String.valueOf(moveCommand.charAt(i));
            if (isDirCommand(command)) {
                direc = turnDirec(direc, command);
            }
            if ("N".equals(direc)) {
                if ("M".equals(command)) {
                    yCoor += 1;
                }
            }
            if ("S".equals(direc)) {
                if ("M".equals(command)) {
                    yCoor -= 1;
                }
            }
            if ("W".equals(direc)) {
                if ("M".equals(command)) {
                    xCoor -= 1;
                }
            }
            if ("E".equals(direc)) {
                if ("M".equals(command)) {
                    xCoor += 1;
                }
            }
        }
        return String.valueOf(xCoor) + String.valueOf(yCoor) + direc;
    }

    private boolean isDirCommand(String command) {
        if ("RL".contains(command)) {
            return true;
        }
        return false;
    }

    public String turnDirec(String initDir, String turnAction) {
        if (initDir.equals("N")) {
            if ("R".equals(turnAction)) {
                return "E";
            }
            if ("L".equals(turnAction)) {
                return "W";
            }
        }
        if (initDir.equals("S")) {
            if ("R".equals(turnAction)) {
                return "W";
            }
            if ("L".equals(turnAction)) {
                return "E";
            }
        }
        if (initDir.equals("W")) {
            if ("R".equals(turnAction)) {
                return "N";
            }
            if ("L".equals(turnAction)) {
                return "S";
            }
        }
        if (initDir.equals("E")) {
            if ("R".equals(turnAction)) {
                return "S";
            }
            if ("L".equals(turnAction)) {
                return "N";
            }
        }
        return null;
    }
}
