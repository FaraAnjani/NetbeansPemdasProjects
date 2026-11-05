package netbeanspemdasprojects;
import java.util.Scanner;

public class RataRataMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] nilai = new double[3][4];
        
   
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai untuk Mahasiswa ke-" + (i + 1) + ":");
            double total = 0;
            for (int j = 0; j < 4; j++) {
                System.out.print("  Mata Kuliah ke-" + (j + 1) + ": ");
                nilai[i][j] = scanner.nextDouble();
                total += nilai[i][j];
            }
            double rataRata = total / 4;
            System.out.println("-> Rata-rata nilai Mahasiswa ke-" + (i + 1) + " adalah: " + rataRata);
            System.out.println("--------------------------------------------------");
        }
        scanner.close();
    }
}