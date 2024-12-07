import java.util.Scanner; //inputan pengguna 
import java.util.Random;//untuk mengambil data acak

public class UjianUKLSoal2Bagian3{
    public static void perkalian (int num_1, int num_2) { //dapat dipanggil kapan saja, tanpa objek kelas jg bisa
        Scanner in = new Scanner(System.in);//mengambil inputan pengguna
        int hasil = num_1 * num_2; 
        System.out.println("Berapa hasil perkalian dari " + num_1 + " dan " + num_2 + "?");
        System.out.println("Jawaban Anda: ");
        int jawaban = in.nextInt();//prograam menunggu inputan pengguna
        if (jawaban == hasil) {//perbandingan
            System.out.println("Jawaban Anda benar ^^");
            } else{
                System.out.println(" yah Jawaban Anda salah :( \n Jawaban yang benar adalah = " + hasil);
            }
        }
        public static void pembagian (int num_1, int num_2) {
            Scanner in = new Scanner(System.in);
            int hasil = num_1 / num_2;
            System.out.println("Berapa hasil dari " + num_1 + " dibagi " + num_2 + "?");
            System.out.println("Jawaban Anda: ");
            int jawaban = in.nextInt();
            if (jawaban == hasil) {
                System.out.println("Jawaban Anda benar :9");
                } else {
                    System.out.println("Jawaban Anda salah:( \n Jawaban yang benar adalah = " + hasil);
                }
            }
            public static void modulus (int num_1, int num_2) {
                Scanner in = new Scanner(System.in);
                int hasil = num_1 % num_2;
                System.out.println("Berapa hasil dari " + num_1 + " modulus " + num_2 + "adalah =");
                int jawaban = in.nextInt();
                if (jawaban == hasil) {
                    System.out.println("Jawaban Anda benar ^^");
                    } else{
                        System.out.println("Jawaban Anda salah :( \n Jawaban yang benar adalah = " + hasil);
                    }
                }
            public static String bertanya(){ //bertanya pada user
                Scanner in = new Scanner(System.in);
                System.out.println("Apakah Anda ingin melanjutkan? ");
                return in.nextLine();
            }
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                Random masuk = new Random(); //menghasilkan angka acak
                String lanjut;//menyimpan jawaban dari pengguna

                do{
                    int num_1 = masuk.nextInt(10) +1; //menghasilkan angka acak antara 1-10
                    int num_2 = masuk.nextInt(10) +1;

                    System.out.println("Pilih Operasi \n 1.perkalian \n 2.pembagian \n 3.modulus");
                    int pilihan = in.nextInt();
                    switch (pilihan) {
                        case 1: 
                        perkalian(num_1, num_2);
                        break;

                        case 2:
                        pembagian(num_1, num_2);
                        break;

                        case 3:
                        modulus(num_1, num_2);
                        break;
                    }
                    lanjut = bertanya();
                }while (lanjut.equalsIgnoreCase("ya"));
                System.out.println("Terimakasi sudah bermain dan Sampai Jumpaa lagii yaww ^^");
            }
        }