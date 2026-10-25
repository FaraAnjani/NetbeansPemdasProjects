package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Studi Kasus Segitiga Kanan
 */
public class SegitigaKanan {
    public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
            // Mencetak spasi
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
