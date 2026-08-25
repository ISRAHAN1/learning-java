package Glava_4.Task_4_2_6;
import java.io.*;

public class Chet {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[]{3, 10, 3, 4, 7};
       try(InputStream inputStream = new ByteArrayInputStream(bytes);
        OutputStream outputStream = new ByteArrayOutputStream()){
           print(inputStream, outputStream);
       }catch (IOException e){
           System.out.println(e.getMessage());
       }


    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
            int chisLo;
            while ((chisLo = inputStream.read()) != -1) {
                if ((chisLo % 2) == 0) {
                    System.out.println(chisLo);
                    outputStream.write(chisLo);
                    outputStream.flush();
                }
            }
        }
    }

