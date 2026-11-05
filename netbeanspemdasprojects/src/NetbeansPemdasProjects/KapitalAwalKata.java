package NetbeansPemdasProjects;

public class KapitalAwalKata {
   
    public static void main(String[] args) {
        String kalimat = "pemrograman berorientasi objek menggunakan java";
        String[] kata = kalimat.split("\\s+");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                // Mengubah huruf pertama menjadi kapital digabung dengan sisa huruf
                String kapital = k.substring(0, 1).toUpperCase() + k.substring(1).toLowerCase();
                hasil.append(kapital).append(" ");
            }
        }

        System.out.println("Kalimat Asli: " + kalimat);
        System.out.println("Hasil Kapital: " + hasil.toString().trim());
    }
}

