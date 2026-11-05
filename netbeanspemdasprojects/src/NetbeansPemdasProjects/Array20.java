package NetbeansPemdasProjects;

/**
 * NIM : 09040626118
 * Nama : FARA ANJANI
 */
public class Array20 {
    public static void main(String[] args) {
        double[] harga = {15000, 25000, 12000, 30000, 45000};

        double total = 0;
        double tertinggi = harga[0];
        double terendah = harga[0];

        System.out.println("=== DAFTAR HARGA AWAL DAN SETELAH DISKON ===");
        for (int i = 0; i < harga.length; i++) {
            double hargaAwal = harga[i];
            double diskon = 0;

            if (hargaAwal >= 30000) {
                diskon = 0.10 * hargaAwal; // Diskon 10%
            }

            double hargaAkhir = hargaAwal - diskon;
            total += hargaAwal;

            if (hargaAwal > tertinggi) {
                tertinggi = hargaAwal;
            }

            if (hargaAwal < terendah) {
                terendah = hargaAwal;
            }

            System.out.printf("Produk %d: Rp %.0f | Diskon: Rp %.0f | Harga Akhir: Rp %.0f\n", 
                              (i + 1), hargaAwal, diskon, hargaAkhir);
        }

        double rataRata = total / harga.length;

        System.out.println("\n=== RINGKASAN DATA HARGA ===");
        System.out.printf("Total Harga Awal : Rp %.0f\n", total);
        System.out.printf("Rata-rata Harga  : Rp %.2f\n", rataRata);
        System.out.printf("Harga Tertinggi  : Rp %.0f\n", tertinggi);
        System.out.printf("Harga Terendah   : Rp %.0f\n", terendah);
    }
}