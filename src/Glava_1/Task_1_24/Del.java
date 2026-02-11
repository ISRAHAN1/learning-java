package Glava_1.Task_1_24;

public class Del {
    public static void main(String[] args) {
        String str="1200";
        Del del= new Del();
        del.parseAndPrintNumber(str);

    }
    public void parseAndPrintNumber(String str){
        int result =Integer.parseInt(str);
        System.out.println(result/2);
    }
}
