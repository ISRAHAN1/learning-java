package Glava_1.Task_1_3_3;
import java.lang.Math;
public class Age {
    public static void main(String[]args){
        byte age1=18;
        byte age2=6;
        System.out.println(getAgeDiff(age1,age2));
    }
    public static byte getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs((age2)-(age1));
    }
}
