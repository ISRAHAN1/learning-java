package Glava_1.Task_1_25;

public class POl {
    public static void main(String[] args) {
        String text ="Was  it  a cat I saw";
        System.out.println(isPalindrome(text));

    }
    public static boolean isPalindrome(String text){
        String cleanedText = text.replaceAll("[^a-zA-z0-9]","".toLowerCase());
        return cleanedText.equalsIgnoreCase(new StringBuilder(cleanedText).reverse().toString());
    }
}
