package NetbeansPemdasProjects;
import java.util.Scanner;

public class TUGASMANDIRI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Pertambahan | 2. Pengurangan | 3. Pembagian | Lainnya: Perkalian");
        System.out.print("Pilih menu: ");
        int pilih = input.nextInt();

        System.out.print("Masukkan angka ke-1: ");
        double a = input.nextDouble();
        System.out.print("Masukkan angka ke-2: ");
        double b = input.nextDouble();

        switch (pilih) {
            case 1 -> System.out.println("Hasil Tambah: " + (a + b));
            case 2 -> System.out.println("Hasil Kurang: " + (a - b));
            case 3 -> System.out.println(b != 0 ? "Hasil Bagi: " + (a / b) : "Tidak bisa dibagi 0!");
            default -> System.out.println("Andi belajar perkalian. Hasil Kali: " + (a * b));
        }
    }
}