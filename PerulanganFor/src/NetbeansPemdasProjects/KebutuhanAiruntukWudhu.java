package NetbeansPemdasProjects;

/**
 *
 * Nama : FARA ANJANI
 * Nim : 09040626118
 * Modul Praktikum BAB 1
 */
public class KebutuhanAiruntukWudhu {

    public static void main(String[] args) {
        // Deklarasi variabel berdasarkan studi kasus
        int airPerWudhu = 3;       // Liter per satu kali wudhu
        int jumlahMahasiswa = 150; // Jumlah mahasiswa per hari
        int frekuensiWudhu = 2;    // Jumlah wudhu per mahasiswa dalam sehari

        // Menghitung total kebutuhan air per hari
        int totalAirPerHari = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;

        // Menampilkan output
        System.out.println("=== Perhitungan Kebutuhan Air Wudhu Masjid Kampus ===");
        System.out.println("Penggunaan air per wudhu : " + airPerWudhu + " liter");
        System.out.println("Jumlah mahasiswa         : " + jumlahMahasiswa + " orang");
        System.out.println("Frekuensi wudhu per hari : " + frekuensiWudhu + " kali");
        System.out.println("-----------------------------------------------------");
        System.out.println("Total kebutuhan air/hari : " + totalAirPerHari + " liter");
    }
}
