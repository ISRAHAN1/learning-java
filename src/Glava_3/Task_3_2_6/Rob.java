package Glava_3.Task_3_2_6;

public class Rob {
    public static void main(String[] args) throws RobotConnectionException {
    }
}
class Robot implements RobotConnectionManager, RobotConnection {
    int x;
    int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) throws RobotConnectionException {
        int count = 0;
        boolean isRun = false;
        while ((count < 3)) {
            try (RobotConnection con = robotConnectionManager.getConnection()) {
                con.moveRobotTo(toX, toY);
                isRun = true;
                count = 3;
            } catch (RobotConnectionException e) {
                if (isRun) {
                    count = 3;
                } else {
                    count++;
                    if (count == 3) {
                        throw new RobotConnectionException("3", e);
                    }
                }
            } catch (Throwable e) {
                throw e;

            }


        }

    }

    @Override
    public void moveRobotTo(int x, int y) throws RobotConnectionException {
        System.out.println("Начальное положение x: " + this.getX() + "  y :" + this.getY());
        this.x = x;
        this.y = y;
        System.out.println("Контроль местонахождения y: " + this.getX() + "  y :" + this.getY());
    }

    @Override
    public void close() {
    }

    @Override
    public RobotConnection getConnection() {
        return null;
    }
}

