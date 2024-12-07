import java.util.Scanner; //impor Scanner 

public class UjianUKLSoal2Bagian2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double jarijari, Tinggitabung; //untuk menyimpan nilai jari jari dan tinggi tabung

        // Input jari-jari dan tinggi tabung
        System.out.println("Masukkan Jari-jari alas Tabung:");
        jarijari = s.nextDouble();
        System.out.println("Masukkan Tinggi Tabung:");
        Tinggitabung = s.nextDouble();

        // Panggil fungsi untuk menghitung volume tabung
        double VolumeTabung = hitungVolumeTabung(jarijari, Tinggitabung);
        double luasLingkaran = luasLingkaran(jarijari);

        // Output hasil
        System.out.println("Volume dari Tabung adalah: " + VolumeTabung);
        System.out.println("Luas dari lingkaran alas Tabung adalah: " + luasLingkaran);
    }

    // Fungsi untuk menghitung volume tabung
    public static double hitungVolumeTabung(double jarijari, double tinggi) {
        double phi = 3.14;
        return phi * (jarijari * jarijari) * tinggi;
    }

        public static double luasLingkaran(double jarijari) {
            double phi = 3.14;
            return phi *jarijari * jarijari;
        }
    }