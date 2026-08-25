package Glava_2.Task_2_1_8;

import static Glava_2.Task_2_1_8.Robot.moveRobot;

public class Robots {
    public static void main(String[] args) {
        Robot robot = new Robot(Direction.UP, 6, 0);
        moveRobot(robot, 6, 0);
    }
}
