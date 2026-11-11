package netbeanspemdasprojects;
import java.util.Scanner;

public class DebuggingSistemDiskonSebelum {
    
    // Method 1: Validasi total belanja
    public static boolean validasiBelanja(double total) {
        // SYNTAX ERROR: Kurang titik koma (;) di akhir baris ini
        boolean status = total >= 0;
        return status;
    }

    // Method 2: Menghitung diskon
    public static double hitungDiskon(double total) {
        double diskon = 0;
        // LOGICAL ERROR: Seharusnya diskon diberikan jika total >= 100000, 
        // tapi menggunakan operator salah (<) sehingga logika terbalik
        if (total < 100000) {
            diskon = total * 0.15; // Diskon 15%
        }
        return diskon;
    }

    // Method 3: Main Program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total belanja: ");
        // RUNTIME ERROR: Menggunakan nextInt() untuk angka yang mungkin berdesimal 
        
        int totalBelanja = input.nextInt(); 

        if (validasiBelanja(totalBelanja)) {
            double totalDiskon = hitungDiskon(totalBelanja);
            System.out.println("Diskon yang didapat: " + totalDiskon);
            
            // LOGICAL ERROR: Rumus total bayar salah (menambahkan diskon alih-alih mengurangkan)
            double totalBayar = totalBelanja + totalDiskon;
            System.out.println("Total yang harus dibayar: " + totalBayar);
        } else {
            System.out.println("Total belanja tidak valid.");
        }
        
        input.close();
    }
}