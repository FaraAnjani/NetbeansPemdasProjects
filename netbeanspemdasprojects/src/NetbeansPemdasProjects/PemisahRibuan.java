package NetbeansPemdasProjects;

public class PemisahRibuan {
    public static void main(String[] args) {
        String angka = "3456789";
        StringBuilder sb = new StringBuilder(angka);

        // Menyisipkan titik dari belakang setiap 3 digit
        int panjang = sb.length();
        for (int i = panjang - 3; i > 0; i -= 3) {
            sb.insert(i, '.');
        }

        System.out.println("Angka Asli  : " + angka);
        System.out.println("Format Ribuan: " + sb.toString());
    }
}

