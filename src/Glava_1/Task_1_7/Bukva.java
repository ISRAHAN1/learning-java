package Glava_1.Task_1_7;

public class Bukva {
    public static void main(String[] args) {
        int a=77;
        System.out.println(charExpression(a));

    }
    public static char charExpression(int a){
        return (char) ('\\' +a);
    }
}
