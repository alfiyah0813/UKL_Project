import java.util.HashSet; //memeriksa duplikat

public class CekDuplikat {
    public static void main(String[] args) { //memanggil methode
        int[] array = {1, 2, 3, 4, 2, 5};
        boolean duplikat = cekDuplikat(array);

        if (duplikat) {
            System.out.println("Array memiliki elemen duplikat");
        } else {
            System.out.println("Array tidak memiliki elemen duplikat");
        }
    }

    // Fungsi untuk mengecek duplikat
    public static boolean cekDuplikat(int[] array) {
        for (int i = 0; i < array.length; i++) { //memeriksa setiap elemen dalam array.
            for (int j = i + 1; j < array.length; j++) {// untuk membandingkan elemen yang pertama dengan semua elemen setelahnya.
                if (array[i] == array[j]) {
                    return true; 
                }
            }
        }
        return false;
    }
}