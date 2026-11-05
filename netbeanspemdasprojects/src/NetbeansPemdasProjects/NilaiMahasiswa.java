package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Praktikum 6
 */
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lulus = 0, tidakLulus = 0;
        double totalNilai = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            totalNilai += nilai;
            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                lulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                tidakLulus++;
            }
        }
        double rataRata = totalNilai / 5;
        System.out.println("\n--- REKAPITULASI ---");
        System.out.println("Jumlah Mahasiswa Lulus    : " + lulus);
        System.out.println("Jumlah Mahasiswa Tdk Lulus: " + tidakLulus);
        System.out.println("Rata-rata Nilai           : " + rataRata);
    }
}