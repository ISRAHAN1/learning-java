package Glava_1.Task_1_11;
import java.math.BigInteger;
public class Recursiaa {
    public static void main(String[] args) {
        int value = 5;
        System.out.println(ResCur(value));
    }
    public static BigInteger ResCur(int value){
        BigInteger result = BigInteger.valueOf(1);
        if(value == 1 || value == 0){
            return result;
        }
        result=BigInteger.valueOf(value).multiply(ResCur(value - 1));
        return result;
    }
}
