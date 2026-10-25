package NetbeansPemdasProjects;
/**
 * Nama  : Fara Anjani
 * NIM : 09040626118
 * Modul Tugas Praktikum 1 Bilangan
 */
import java.util.Scanner;
public class TugasBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        int n = input.nextInt();
        System.out.print("Bilangan 1 sampai " + n + " : ");
        for (int i = 1; i <= n; i++) System.out.print(i + " ");
        System.out.print("\nBilangan Genap       : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.print("\nBilangan Ganjil      : ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}
