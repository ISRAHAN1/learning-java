package Glava_1.Task_1_8;

public class Ages {
    public static void main(String[] args) {
        byte ag1 = 8;
        byte ag2 = 10;
        System.out.println(getAgeDiff(ag1, ag2));
    }
    public static byte  getAgeDiff(byte age1, byte age2) {
        return (byte) Math.abs(age2-age1);
    }
}
