package Glava_1.Task_1_6_8_;

public class pars {
    public static void main(String[]args){
        pars str=new pars();
        str.parseAndPrintNumber("1200");




    }
    public void parseAndPrintNumber(String str) {
        int result=Integer.parseInt(str);
        System.out.print(result/2);
   }
}
