package Glava_3.Task_3_2_6;

public interface RobotConnection extends AutoCloseable{
        void moveRobotTo(int x, int y);

        @Override
        void close();
    }

