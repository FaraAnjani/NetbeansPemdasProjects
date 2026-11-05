package NetbeansPemdasProjects;

/**
 * NIM : 09040626118
 * Nama : FARA ANJANI
 */
public class KehadiranMahasiswa {
    public static void main(String[] args) {
        int[] hadir = {14, 13, 16, 12, 15, 10, 16, 14};
        int totalPertemuan = 16;

        System.out.println("=== ANALISIS KEHADIRAN MAHASISWA ===");
        for (int i = 0; i < hadir.length; i++) {
            double persentase = ((double) hadir[i] / totalPertemuan) * 100;
            boolean mencapaiMinimal = persentase >= 75;

            String status = mencapaiMinimal ? "Memenuhi (>= 75%)" : "Tidak Memenuhi (< 75%)";

            System.out.printf("Mahasiswa %d: Kehadiran %d/%d (%.2f%%) -> %s\n", 
                              (i + 1), hadir[i], totalPertemuan, persentase, status);
        }
    }
}
