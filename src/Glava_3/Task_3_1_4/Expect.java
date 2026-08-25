package Glava_3.Task_3_1_4;
public class Expect {
    public static void main(String[] args) throws MyNewException {
        testExp();
    }
    public static void testExp() throws MyNewException {
            throw new MyNewException();
        }
    }

class MyNewException extends Exception {
    }






