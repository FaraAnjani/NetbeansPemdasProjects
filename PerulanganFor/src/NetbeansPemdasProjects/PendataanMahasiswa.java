package NetbeansPemdasProjects;
import java.util.Scanner;

public class PendataanMahasiswa {
    
    // Method untuk menginput ukuran array dan data mahasiswa
    public static String[][][] inputData(Scanner sc) {
        System.out.print("Masukkan jumlah Program Studi: ");
        int jmlProdi = sc.nextInt();
        
        System.out.print("Masukkan jumlah Kelas per Program Studi: ");
        int jmlKelas = sc.nextInt();
        
        System.out.print("Masukkan jumlah Mahasiswa per Kelas: ");
        int jmlMhs = sc.nextInt();
        sc.nextLine(); // membersihkan buffer

        String[][][] mhs = new String[jmlProdi][jmlKelas][jmlMhs];

        System.out.println("\n=== INPUT DATA MAHASISWA ===");
        for (int i = 0; i < jmlProdi; i++) {
            for (int j = 0; j < jmlKelas; j++) {
                System.out.println("\n-- Program Studi ke-" + (i + 1) + " | Kelas ke-" + (j + 1) + " --");
                for (int k = 0; k < jmlMhs; k++) {
                    System.out.print("  Masukkan nama mahasiswa ke-" + (k + 1) + ": ");
                    mhs[i][j][k] = sc.nextLine();
                }
            }
        }
        return mhs;
    }

    // Method untuk menampilkan data serta menerapkan operasi string
    public static void tampilkanData(String[][][] mhs) {
        System.out.println("\n==================================================");
        System.out.println("========= DATA MAHASISWA & OPERASI STRING ========");
        System.out.println("==================================================");

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("\n[ Program Studi ke-" + (i + 1) + " ]");
            for (int j = 0; j < mhs[i].length; j++) {
                System.out.println("  > Kelas ke-" + (j + 1) + ":");
                for (int k = 0; k < mhs[i][j].length; k++) {
                    String namaAsli = mhs[i][j][k];
                    
                    // Penerapan Operasi String:
                    // 1. toUpperCase() -> Mengubah nama menjadi huruf kapital
                    // 2. length() -> Menghitung jumlah karakter nama
                    // 3. replace() -> Contoh manipulasi string (mengganti spasi dengan garis bawah)
                    String namaKapital = namaAsli.toUpperCase();
                    int jumlahKarakter = namaAsli.length();
                    String formatUsername = namaAsli.toLowerCase().replace(" ", "_");

                    System.out.println("    - Nama Asli      : " + namaAsli);
                    System.out.println("      (Kapital)      : " + namaKapital);
                    System.out.println("      (Jumlah Karakter) : " + jumlahKarakter + " huruf");
                    System.out.println("      (Format User)  : @" + formatUsername);
                }
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Memanggil method input data
        String[][][] dataMahasiswa = inputData(sc);

        // Memanggil method tampilkan data
        tampilkanData(dataMahasiswa);

        sc.close();
    }
}