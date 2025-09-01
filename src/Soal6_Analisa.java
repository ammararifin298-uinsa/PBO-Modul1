public class Soal6_Analisa {
    // Percobaan 2 - void method
    static void cetakPesan() {
        System.out.println("Ini method void, hanya mencetak teks.");
    }

    // Percobaan 3 - return method
    static int tambah(int a, int b) {
        return a + b; // mengembalikan nilai
    }

    public static void main(String[] args) {
        // Percobaan 2
        cetakPesan();

        // Percobaan 3
        int hasil = tambah(5, 7);
        System.out.println("Hasil penjumlahan (return method): " + hasil);
    }
}
