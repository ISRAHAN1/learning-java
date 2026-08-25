package Glava_1.Task_1_6_9_;

public class PoLinD {
    public static void main(String[]args){
        String text="Was it a cat I saw?";
        System.out.print(isPalindrome(text));
    }
    public static boolean isPalindrome(String text) {
        StringBuilder sb=new StringBuilder((text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase()));
        return  sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }
    }
