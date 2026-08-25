package Glava_2.Task_2_5_6;

import java.util.Arrays;

public class Alien {
    public static void main(String[] args) {
        AsciiCharSequence result = new AsciiCharSequence(new byte[]{72,69, 76,76,79});
        System.out.println(result.subSequence(0, 5));
        System.out.println(result.length());
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(1));
        System.out.println(result.charAt(2));
        System.out.println(result.charAt(3));
        System.out.println(result.charAt(4));

    }
    public static class AsciiCharSequence implements CharSequence {
        private final byte[] bytes;
        AsciiCharSequence(byte[] bytes) {
            this.bytes = bytes;
        }
        @Override
        public int length() {
            return bytes.length;
        }
        @Override
        public char charAt(int a) {
            return (char) bytes[a];
        }
        @Override
        public AsciiCharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(bytes, start, end));
        }
        @Override
        public String toString() {
            return new String(bytes);
        }
    }
}
