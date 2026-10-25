package NetbeansPemdasProjects;
import java.util.Scanner;
/**
 *IDENTITAS DIRI
 *FARA ANJANI
 * 09040626118
 * MODULPRAKTIKUMBAB1
 */
public class KebutuhanAirWudhu {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      
      System.out.print("Jumlah mahasiswa : ");
      int jumlahMahasiswa = input.nextInt();
      
      System.out.print("Frekuensi wudhu : ");
      int frekuensiWudhu = input.nextInt();
      
      System.out.print("Air per wudhu (liter) : ");
      double airPerWudhu = input.nextInt();
      
      double totalAir =
              jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
      
      System.out.println("=== HASIL ===");
      
      System.out.println("Total kebutuhan air = " + totalAir + "liter");
      
      input.close();
    }
    
}
