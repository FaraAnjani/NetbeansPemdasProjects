package netbeanspemdasprojects;

public class MethodNilaiMisteri {
static int misteri(int n) {
    if (n == 0) {
        return 0;
    }
    return n + misteri(n - 1);
}


// Tambahkan method main di sini
    public static void main(String[] args) {
        int hasil = misteri(4);
        System.out.println("Hasil dari misteri(4) adalah: " + hasil);
   }
}