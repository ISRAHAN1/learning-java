package Glava_2.Task_2_1_8;

public class Robot {
    private Direction direction;
    private int x;
    private int y;

    Robot(Direction direction, int x, int y) {
        this.direction = direction;
        this.x = x;
        this.y = y;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case UP:
                direction = Direction.LEFT;

        }
    }

    public void turnRight() {
        switch (direction) {
            case RIGHT:
                direction=Direction.UP;
                break;
            case UP:
                direction=Direction.RIGHT;
                break;
            case LEFT:
                direction=Direction.DOWN;
                break;
            case DOWN:
                direction=Direction.LEFT;

        }
    }

    public void stepForward() {
        switch (direction) {
            case RIGHT:
                x++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case UP:
                y++;
                break;
        }
    }

    public static void moveRobot(Robot robot, int x, int y) {
        if (robot.getX() == x && robot.getY() == y) {
            System.out.println(("Робот уже находится на заданных координатах"));
        } else {
            System.out.println("Робот не находится на заданных координатах");
        }
        if (x < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getX() != x) {
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
        }
        while (robot.getX() != x) {
            robot.stepForward();
        }
        if (robot.getY() < y) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnLeft();
            }
            while (robot.getY()!=y){
                robot.stepForward();
            }
        } else {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
        }
        while (robot.getY() != y) {
            robot.stepForward();
        }
    }
}

