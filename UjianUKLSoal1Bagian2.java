import java.util.Scanner;

public class UjianUKLSoal1Bagian2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan bilangan : ");
        int bilangan = s.nextInt();
        if ( bilangan % 2 == 0 ){
            System.out.println("Bilangan Genap");
            } else {
                System.out.println("Bilangan Ganjil");
                }
    }
}