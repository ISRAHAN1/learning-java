package Glava_3.Task_3_2_5;

public class Cars {
    public static void main(String[]args){
        try(Car car=new Car()){
            drive();
        }catch (RuntimeException ignore){
        }
    }
    private static void drive(){
        System.out.println("Машина поехала");
    }
    public static class Car implements AutoCloseable{
        public void close(){
            System.out.println("Машина закрывается");
        }
    }
}
