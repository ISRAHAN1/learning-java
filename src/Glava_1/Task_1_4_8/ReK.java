package Glava_1.Task_1_4_8;
import java.math.BigInteger;

public class ReK {
    public static void main(String[] args) {
        int value= 5;
        System.out.println(function(value));
    }
    public static BigInteger function(int value) {
        BigInteger result=BigInteger.valueOf(1);
        if (value==1||value==0){
            return result;
        }
        result=BigInteger.valueOf(value).multiply(function(value-1));
        return result;
    }

}
