import java.util.Scanner;

public class UjianUKLSoal1Bagian1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        double panjang, lebar, tinggi, berat, jarak, volume, total;//mendeklarasikan variabel yg di perlukan
        System.out.println("Masukkan panjang paket (cm) : ");
        panjang = a.nextDouble();//inputan Scanner
        System.out.println("Masukkan lebar paket (cm) : ");
        lebar = a.nextDouble();
        System.out.println("Masukkan tinggi paket (cm) : ");
        tinggi = a.nextDouble();
        System.out.println("Masukkan berat paket (kg) : ");
        berat = a.nextDouble();
        System.out.println("Masukkan jarak tempuh pengiriman (km) : ");
        jarak = a.nextDouble();
        volume = panjang * lebar * tinggi;
        double biayaperKG;
        if (jarak <=10){
            biayaperKG = 4250;
        } else {
            biayaperKG = 6000;
            }
            double biayaVolume;
            if (volume > 100){
                biayaVolume = 50000;
                } else {
                    biayaVolume = 0;
                }
                total = biayaperKG * berat + biayaVolume;
                System.out.println("Detail Biaya Pengiriman paket : ");
                System.out.println("Biaya pengiriman paket Anda adalah Rp. " + total);
                System.out.println("Berat Paket : " + berat + " kg");
                System.out.println("Volume Paket : " + volume + " cm3");
                System.out.println("Biaya Volume Tambahan : RP.  " +biayaVolume);
                System.out.println("Biaya Berdasarkan Berat : Rp. " + biayaperKG );
                System.out.println("Total Biaya Pengiriman : Rp. " + total);
    }
}