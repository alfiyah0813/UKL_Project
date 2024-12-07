import java.util.Scanner; 

public class UjianUKLSoal2Bagian1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //untuk membuuat objek & membaca inputan dari pengguna
        int angka, faktorial;  //angka untuk memasukkan bilangan, faktorial untuk menyimpan hasil perhitungan faktorial
        System.out.println("Hitunglah Faktorial berikut!!");
        System.out.println("Masukkan Bilangan anda : ");
        angka = s.nextInt(); //program akan menunggu inputan dari pengguna, dan menyimpan dlm variabel angka
        if (angka < 0){
            System.out.println("Maaf, Bilangan tidak boleh negatif!!");//pemeriksaan program
            } else {
                faktorial = 1;
                for (int i = 1; i <= angka; i++) { //loop akan berjalan dari angka 1 sampai angka yang dimasukkan pengguna
                    faktorial = faktorial * i;  
                    }
                    System.out.println(" Hasil Faktorial dari " + angka + " adalah " + faktorial);
                }
    }
}