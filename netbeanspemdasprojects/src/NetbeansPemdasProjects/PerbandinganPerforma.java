package NetbeansPemdasProjects;

public class PerbandinganPerforma {
    
    public static void main(String[] args) {
        int jumlahIterasi = 100000;

        // 1. Menggunakan String +=
        long mulaiString = System.nanoTime();
        String str = "";
        for (int i = 0; i < jumlahIterasi; i++) {
            str += i;
        }
        long selesaiString = System.nanoTime();
        long waktuString = selesaiString - mulaiString;

        // 2. Menggunakan StringBuilder.append()
        long mulaiSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < jumlahIterasi; i++) {
            sb.append(i);
        }
        long selesaiSB = System.nanoTime();
        long waktuSB = selesaiSB - mulaiSB;

        // Menampilkan Hasil
        System.out.println("Jumlah Iterasi: " + jumlahIterasi + " angka");
        System.out.println("Waktu String (+=)          : " + waktuString + " nanodetik (" + (waktuString / 1_000_000.0) + " ms)");
        System.out.println("Waktu StringBuilder.append(): " + waktuSB + " nanodetik (" + (waktuSB / 1_000_000.0) + " ms)");
    }
}
