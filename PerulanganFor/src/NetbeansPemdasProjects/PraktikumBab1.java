// IDENTITAS DIRI
// Nama : Fara Anjani
// NIM : 09040626118
// Modul Praktikum Bab 1
package NetbeansPemdasProjects;
import java.util.Scanner;
/**
 *
 * @author FARA ANJANI
 */
public class PraktikumBab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();
        System.out.print("Frekuensi wudhu : ");
        int frekuensiWudhu = input.nextInt();
        System.out.print("Air per wudhu (liter) : ");
        double airPerWudhu = input.nextDouble();
        double totalAir = 
        jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        System.out.println("=== HASIL ===");
        
        System.out.println("Total kebutuhan air = " + totalAir + " liter");
        input.close();
    }
}