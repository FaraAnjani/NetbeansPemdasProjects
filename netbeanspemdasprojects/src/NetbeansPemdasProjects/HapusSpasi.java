package NetbeansPemdasProjects;

public class HapusSpasi {
    
    public static void main(String[] args) {
        String kalimat = "Belajar Java sangat seru";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c != ' ') {
                sb.append(c);
            }
        }

        System.out.println("Kalimat Asli: " + kalimat);
        System.out.println("Tanpa Spasi : " + sb.toString());
    }
}

