package NetbeansPemdasProjects;

public class HitungKata {
    
    public static void main(String[] args) {
        String kalimat = "Belajar Pemrograman Java itu Menyenangkan";
        
        // Memisahkan string berdasarkan spasi menggunakan regex "\\s+"
        String[] kata = kalimat.trim().split("\\s+");
        int jumlahKata = kata.length;

        System.out.println("Kalimat: \"" + kalimat + "\"");
        System.out.println("Jumlah kata: " + jumlahKata);
    }
}

