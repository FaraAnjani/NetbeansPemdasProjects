package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Studi Kasus Piramida Bintang
 */
public class PiramidaBintang {
    public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
            // Spasi
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
