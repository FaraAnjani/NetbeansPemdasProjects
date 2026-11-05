package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Tugas Praktikum 2 Faktorial
 */
import java.util.Scanner;
public class TugasFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        long faktorial = 1;
        System.out.print(n + "! = ");
        for (int i = n; i >= 1; i--) {
            faktorial *= i;
            System.out.print(i + (i > 1 ? " x " : ""));
        }
        System.out.println("\n" + n + "! = " + faktorial);
    }
}
