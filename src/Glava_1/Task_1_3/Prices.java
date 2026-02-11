package Glava_1.Task_1_3;

public class Prices {
    public static void main(String[] args) {
        double price = 8.5;
        int count = 2;
        System.out.println(priceCalculation(price, count));

    }

    public static double priceCalculation(double price, int count) {
        return price * count;
    }
}
