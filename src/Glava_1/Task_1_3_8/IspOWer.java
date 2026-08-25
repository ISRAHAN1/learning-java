package Glava_1.Task_1_3_8;

public class IspOWer {
    public static void main(String[] args) {
        System.out.print("0: ");
        System.out.println(isPowerOfTwo(0));
        System.out.print("1: ");
        System.out.println(isPowerOfTwo(1));
        System.out.print("-2: ");
        System.out.println(isPowerOfTwo(-2));
        System.out.print("3: ");
        System.out.println(isPowerOfTwo(3));
        System.out.print("256: ");
        System.out.println(isPowerOfTwo(256));
        System.out.print("1023: ");
        System.out.println(isPowerOfTwo(1023));
        System.out.print("1024: ");
        System.out.println(isPowerOfTwo(1024));
    }

    public static boolean isPowerOfTwo(int result) {
        return (Integer.bitCount(Math.abs(result))) == 1;

    }
}