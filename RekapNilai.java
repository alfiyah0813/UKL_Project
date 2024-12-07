import java.util.Scanner;

public class RekapNilai{
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Masukkan Jumlah Siswa : ");
    int jumlahSiswa = s.nextInt();
    int[] nilai = new int[jumlahSiswa];
    double totalNilai =0;
    for (int i = 1; i <= jumlahSiswa; i++) {
        System.out.println("Masukkan Nilai Siswa ke-" + i + " : ");
        double nilaiSiswa = s.nextDouble();//mengambil input dari pengguna berupa nilai desimal
        nilai[i-1] = (int) nilaiSiswa;//dikonversi ke dlm int
        totalNilai += nilaiSiswa;
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("Rekap Nilai Siswa : ");
        System.out.println("Jumlah Siswa : " +jumlahSiswa);
        System.out.println("Total Nilai : " +totalNilai);
        System.out.println("Rata-Rata Nilai Siswa : " + rataRata);
    }
}

    
