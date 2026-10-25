package NetbeansPemdasProjects;
/**
 * FARA ANJANI
*/
import java.util.Scanner;
public class TugasKelasPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Masukkan angkamu = ");
        int angka = scanner.nextInt();

        System.out.println("Berikut hasil perkalian angkamu : ");

        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }

        scanner.close();
    }
}