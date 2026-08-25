package Glava_4.Task_4_2_5;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
public class Sum {
    public static void main(String[]args) throws IOException {
        byte[] array1 = new byte[]{5, 3, 5, 5,};
        InputStream inputStream = new ByteArrayInputStream(array1);
        System.out.println(sumOfStream(inputStream));
    }
   public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum=0;
        int result;
        while((result=inputStream.read())!=-1){
            sum=sum+result;
        }
        return sum;
   }
}
