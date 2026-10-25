package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Hot Case 2 Sistem Presensi
 */
import java.util.Scanner;
public class SistemPresensi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int totalMhs = input.nextInt();
        int hadir = 0, tidakHadir = 0;
        for (int i = 1; i <= totalMhs; i++) {
            System.out.print("Mahasiswa ke-" + i + " (1 = Hadir, 0 = Tidak Hadir): ");
            int status = input.nextInt();
            if (status == 1) {
                hadir++;
            } else {
                tidakHadir++;
            }
        }
        double persentase = ((double) hadir / totalMhs) * 100;
        System.out.println("--- REKAP PRESENSI ---");
        System.out.println("Jumlah Hadir       : " + hadir);
        System.out.println("Jumlah Tidak Hadir : " + tidakHadir);
        System.out.printf("Persentase Kehadiran: ", persentase);
        if (persentase >= 75.0) {
            System.out.println("Status: Memenuhi syarat");
        } else {
            System.out.println("Status: Tidak memenuhi syarat");
        }
    }
}
