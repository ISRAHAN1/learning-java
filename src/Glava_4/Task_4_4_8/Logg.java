package Glava_4.Task_4_4_8;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Logg {
    public static final Logger logger=Logger.getLogger("com.java mentor.logging.Test");
    public static void main(String[] args) {
        logger.log(Level.INFO,"Все Хорошо");
        logger.warning("Произошла ошибка");

    }
}
