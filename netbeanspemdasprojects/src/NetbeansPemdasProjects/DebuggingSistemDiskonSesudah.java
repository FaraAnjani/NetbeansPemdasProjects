package netbeanspemdasprojects;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DebuggingSistemDiskonSesudah {
    
    // Method 1: Validasi total belanja
    public static boolean validasiBelanja(double total) {
        return total >= 0; // Syntax error diperbaiki (ditambah titik koma)
    }

    // Method 2: Menghitung diskon
    public static double hitungDiskon(double total) {
        double diskon = 0;
        // Logical error diperbaiki: menggunakan operator >= dan persentase yang benar
        if (total >= 100000) {
            diskon = total * 0.15; 
        }
        return diskon;
    }

    // Method 3: Main Program dengan Exception Handling & Validasi Bisnis
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan total belanja: ");
            double totalBelanja = input.nextDouble(); // Menggunakan double untuk fleksibilitas

            if (validasiBelanja(totalBelanja)) {
                double totalDiskon = hitungDiskon(totalBelanja);
                System.out.println("Diskon yang didapat: " + totalDiskon);
                
                // Logical error diperbaiki: total bayar dikurangi diskon
                double totalBayar = totalBelanja - totalDiskon;
                System.out.println("Total yang harus dibayar: " + totalBayar);
            } else {
                System.out.println("Error: Total belanja tidak boleh bernilai negatif.");
            }
            
        } catch (InputMismatchException e) {
            // Exception handling untuk menangani input huruf/simbol
            System.out.println("Error: Input harus berupa angka!");
        } finally {
            input.close();
            System.out.println("Program selesai.");
        }
    }
}