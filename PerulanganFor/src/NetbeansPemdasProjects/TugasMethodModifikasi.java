package netbeanspemdasprojects;

import java.util.Scanner;

public class TugasMethodModifikasi {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    String[][][] data = inputData(input);
    tampilkanDanOperasiString(data);
    input.close();
}
    
    public static String[][][] inputData(Scanner sc) {
        System.out.print("Jumlah Prodi, Kelas, Mahasiswa (pisahkan dengan spasi): ");
        String[][][] mahasiswa = new String[sc.nextInt()][sc.nextInt()][sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("--- Prodi " + (i+1) + ", Kelas " + (j+1) + " ---");
                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.print("Mahasiswa " + (k+1) + ": ");
                    mahasiswa[i][j][k] = sc.nextLine();
                }
            }
        }
        return mahasiswa;
    }

    // Method untuk menampilkan hasil dan operasi string
    public static void tampilkanDanOperasiString(String[][][] dataMahasiswa) {
        System.out.println("\n--- DAFTAR DATA MAHASISWA & OPERASI STRING ---");
        
        for (int i = 0; i < dataMahasiswa.length; i++) {       
            System.out.println("Prodi " + (i + 1));
            for (int j = 0; j < dataMahasiswa[i].length; j++) {
                System.out.print("  Kelas " + (j + 1) + " : ");
                
                for (int k = 0; k < dataMahasiswa[i][j].length; k++) {
                    String namaAsli = dataMahasiswa[i][j][k];
                    
                    String cetakFormat = namaAsli.toUpperCase() + "(" + namaAsli.length() + " huruf)";
                    
                    System.out.print(cetakFormat + "  ");
                }
                System.out.println(); 
            }
        }
    }
}

