package Glava_5.Task_5_1_12;
public class GeNer2 {
    public static void main(String[]args){
    }
    public static class Box1<T>{
        private T object;
        public static <T> Box1 <T> getBox1(){
            return new Box1<>();
        }
    }
}