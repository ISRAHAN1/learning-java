package Glava_1.Task_1_9;


public class Dvo {
    public static void main(String[] args) {
        boolean value = isPower(0);
        System.out.println(value);
        boolean value2=isPower(1);
        System.out.println(value2);
        boolean value3=isPower(2);
        System.out.println(value3);
        boolean value4=isPower(1020);
        System.out.println(value4);


    }
    public static boolean isPower(int value){
        return (Integer.bitCount(Math.abs(value))) == 1;
    }
}
