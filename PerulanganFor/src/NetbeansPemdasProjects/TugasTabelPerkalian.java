package NetbeansPemdasProjects;
/**
 * Nama: Fara Anjani
 * NIM : 09040626118
 * Modul Tugas Praktikum 3 Tabel Perkalian
 */
import java.util.Scanner;
public class TugasTabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(angka + " x " + i + " = " + (angka * i));
        }
    }
}
