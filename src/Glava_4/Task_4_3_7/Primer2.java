package Glava_4.Task_4_3_7;
import java.io.IOException;
import java.util.Scanner;
public class Primer2 {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
       String[] array= scanner.nextLine().split(" ");
       double sum=0;

       for(int i=0; i<array.length; i++){
           double res=0;
           try {
               res=Double.parseDouble(array[i]);
           }catch (ArrayIndexOutOfBoundsException e) {
               System.out.println(e.getMessage());
           }
           if(res!=0)
               sum=sum+res;
       }
       System.out.println("Output sum:" +String.format("%.6f",sum));
    }

}

