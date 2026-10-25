package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Hots Case 3 Menu Program
 */
import java.util.Scanner;
public class MenuProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap (2-20)");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    for (int i = 1; i <= 10; i++) System.out.print(i + " ");
                    System.out.println();
                    break;
                case 2:
                    for (int i = 2; i <= 20; i += 2) System.out.print(i + " ");
                    System.out.println();
                    break;
                case 3:
                    int jumlah = 0;
                    for (int i = 1; i <= 10; i++) jumlah += i;
                    System.out.println("Jumlah = " + jumlah);
                    break;
                case 4:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= i; j++) System.out.print("*");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
