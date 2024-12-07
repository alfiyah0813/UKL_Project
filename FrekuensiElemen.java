import java.util.Scanner;

public class FrekuensiElemen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = {1, 2, 2, 3, 3, 3, 4,};
        boolean [] sudahDihitung = new boolean[array.length];//tanda sudah dihitung atau belum
        System.out.println(" Frekuensi setiap elemen dalam Array : ");

        for (int i = 0; i < array.length; i++) {
            if (!sudahDihitung[i]) { //cek apakah sudah dihitung atau belum
                int frekuensi = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) { //memiliki nilai yang sama
                        frekuensi++; //Menambah 1 pada frekuensi jika array[i] == array[j]
                        if (i != j) {//perhitungan sekali untuk setiap elemen yg sama
                            sudahDihitung[j] = true;
                            }
                        }
                    }
                    System.out.println("Elemen " + array[i] + " muncul sebanyak " +frekuensi);
                }
            }
    }
    }