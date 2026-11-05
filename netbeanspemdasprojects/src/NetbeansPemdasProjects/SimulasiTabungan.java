package NetbeansPemdasProjects;
/**
 * Nama : Fara Anjani
 * NIM : 09040626118
 * Modul Hot Case 1 Simulasi Tabungan
 */
import java.util.Scanner;
public class SimulasiTabungan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();
        int nominalBulan = 100000;
        int totalTabungan = 0;
        int bulanTercapai1Juta = -1;
        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {
            totalTabungan += nominalBulan;
            System.out.println("Bulan " + bulan + " = Rp" + nominalBulan + " (Total: Rp" + totalTabungan + ")");          
            if (totalTabungan >= 1000000 && bulanTercapai1Juta == -1) {
                bulanTercapai1Juta = bulan;
            }
            nominalBulan += 50000;
        }
        System.out.println("\nTotal Tabungan: Rp" + totalTabungan);
        if (bulanTercapai1Juta != -1) {
            System.out.println("Total tabungan mencapai Rp1.000.000 pertama kali pada bulan ke-" + bulanTercapai1Juta);
        } else {
            System.out.println("Total tabungan belum mencapai Rp1.000.000 dalam periode ini.");
        }
    }
}
