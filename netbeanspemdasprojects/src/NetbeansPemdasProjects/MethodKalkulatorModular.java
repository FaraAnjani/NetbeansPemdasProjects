package netbeanspemdasprojects;
import java.util.Scanner;

public class MethodKalkulatorModular {

    // ===== MODUL PROSES =====
    static double tambah(double a, double b) { return a + b; }
    static double kurang(double a, double b) { return a - b; }
    static double kali(double a, double b)   { return a * b; }
    
    static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: pembagian dengan nol.");
            return Double.NaN; // NaN = bukan angka
        }
        return a / b;
    }

    // Tugas 1: Method Sisa Bagi (%) dan Pangkat (Math.pow)
    static double sisaBagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: sisa bagi dengan nol.");
            return Double.NaN;
        }
        return a % b;
    }

    static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    static double hitung(int pilihan, double a, double b) {
        switch (pilihan) {
            case 1: return tambah(a, b);
            case 2: return kurang(a, b);
            case 3: return kali(a, b);
            case 4: return bagi(a, b);
            case 5: return sisaBagi(a, b); // Tugas 1
            case 6: return pangkat(a, b);  // Tugas 1
            default: return 0;
        }
    }

    // ===== MODUL INPUT =====
    static int bacaInt(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextInt();
    }

    static double bacaDouble(Scanner input, String pesan) {
        System.out.print(pesan);
        return input.nextDouble();
    }

    // ===== MODUL TAMPILAN =====
    static void tampilkanMenu() {
        System.out.println("=== KALKULATOR MODULAR ===");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Sisa Bagi (%)"); // Tugas 1
        System.out.println("6. Pangkat");       // Tugas 1
        System.out.println("0. Keluar");
    }

    // Tugas 2: Method tampilkanHasil dengan format a [operator] b = hasil
    static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.println("Hasil: " + a + " " + operasi + " " + b + " = " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            pilihan = bacaInt(input, "Pilih menu: ");

            // Tugas 3: Validasi menu di luar 0 sampai 6
            if (pilihan >= 1 && pilihan <= 6) {
                double a = bacaDouble(input, "Angka pertama: ");
                double b = bacaDouble(input, "Angka kedua   : ");
                double hasil = hitung(pilihan, a, b);

                if (!Double.isNaN(hasil)) {
                    String op = "";
                    switch (pilihan) {
                        case 1: op = "+"; break;
                        case 2: op = "-"; break;
                        case 3: op = "*"; break;
                        case 4: op = "/"; break;
                        case 5: op = "%"; break;
                        case 6: op = "^"; break;
                    }
                    // Memanggil method tampilkanHasil (Tugas 2)
                    tampilkanHasil(op, a, b, hasil);
                }
            } else if (pilihan != 0) {
                System.out.println("Menu tidak valid.");
            }
            
            System.out.println();
        } while (pilihan != 0);

        System.out.println("Terima kasih.");
        input.close();
    }
}