public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    public Robot(int[] hallwayToClean, int startingPosition) {
        isFacingRight = true;
        position = Math.min(Math.max(startingPosition, 0), hallwayToClean.length - 1);
        hallway = hallwayToClean;
        for (int i = 0; i < hallway.length; i++) {
            hallway[i] = Math.max(hallway[i], 0);
        }
    }

    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        return (isFacingRight && position == 3) || (!isFacingRight && position == 0);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        hallway[position] = Math.max(hallway[position] - 1, 0);
        if (hallway[position] > 0) {
            return;
        }
        if (isRobotBlockedByWall()) {
            isFacingRight = !isFacingRight;
            return;
        }
        if (isFacingRight) {
            position++;
        } else {
            position--;
        }
    }

    /**
     * This method displays the current state of the robot and the hallway. It then calls the move()
     * method and counts the number of moves it takes to clear the hallway. The method should
     * display the current state of the robot after each move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        while (!hallIsClear()) {
            count++;
            move();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        for (int i : hallway) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        for (int i : hallway) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < position; i++) {
            System.out.print("  ");
        }
        if (isFacingRight) {
            System.out.print(">");
        } else {
            System.out.print("<");
        }
    }

    public void setHallway(int[] hallway) {
        for (int i = 0; i < hallway.length; i++) {
            this.hallway[i] = Math.max(hallway[i], 0);
        }
    }

    public void setPosition(int position) {
        this.position = Math.min(Math.max(position, 0), hallway.length - 1);
    }

    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }

    public int[] getHallway() {
        return hallway;
    }

    public int getPosition() {
        return position;
    }

    public boolean isFacingRight() {
        return isFacingRight;
    }
}
