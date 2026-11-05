package netbeanspemdasprojects;
import java.util.Scanner;

public class MethodProgramModularMinimal3Method {
    // 1. Method Modul Proses
    public static double hitungLuas(double p, double l) {
        return p * l;
    }

    public static double hitungKeliling(double p, double l) {
        return 2 * (p + l);
    }

    // 2. Method Modul Tampilan / Output
    public static void tampilkanHasil(double luas, double keliling) {
        System.out.println("Luas Persegi Panjang     : " + luas);
        System.out.println("Keliling Persegi Panjang : " + keliling);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Modul Input
        System.out.print("Masukkan panjang: ");
        double p = input.nextDouble();
        System.out.print("Masukkan lebar  : ");
        double l = input.nextDouble();

        // Pemanggilan method proses
        double luas = hitungLuas(p, l);
        double keliling = hitungKeliling(p, l);

        // Pemanggilan method tampilan
        tampilkanHasil(luas, keliling);

        input.close();
    }
}