package Glava_1.Task_1_25;

public class POl {

    public static void main(String[] args) {
        String text ="A man, a plan, a canal, Panama";
        System.out.println(isPalindrome(text));

    }
    public static boolean isPalindrome(String text){
       StringBuilder stringBuilder = new StringBuilder(text.replaceAll("[^a-zA-Z]", "").toLowerCase());
       return stringBuilder.toString().equalsIgnoreCase(stringBuilder.reverse().toString());
    }
}

