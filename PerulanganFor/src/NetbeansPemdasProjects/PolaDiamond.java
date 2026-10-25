package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Studi Kasus Hots Diamond
 */
    public class PolaDiamond {
    public static void main(String[] args) {
        int n = 5; // Tinggi bagian atas diamond
        // Bagian Atas (Perulangan Naik)
        for (int i = 1; i <= n; i++) {
            // Mencetak spasi
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bagian Bawah (Perulangan Turun)
        for (int i = n - 1; i >= 1; i--) {
            // Mencetak spasi
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
