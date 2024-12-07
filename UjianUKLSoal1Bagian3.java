import java.util.Scanner;

public class UjianUKLSoal1Bagian3{
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) { //cetak angka 50 sampai 1
            System.out.print(i+".");
        if (i%3==0){ //i dibagi 3 = 0 
            System.out.println("saya anak moklet");
        } else if (i%3==1){ //i dibagi 3 = 1
            System.out.println("saya anak wikusama");
            } else {// i dibagi  = 2
                System.out.println("saya angkatan 33");
            }
        }
        System.out.println("1. Saya senang");
    }
}