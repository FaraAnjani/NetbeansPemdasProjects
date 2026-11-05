package netbeanspemdasprojects;
public class MethodJumlahDeret {
    // Versi Rekursif
    public static int jumlahDeretRekursif(int n) {
        if (n == 1) {
            return 1;
        }
        return n + jumlahDeretRekursif(n - 1);
    }

    // Versi Perulangan (Iteratif)
    public static int jumlahDeretIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Jumlah deret 1 hingga " + n + " (Rekursif): " + jumlahDeretRekursif(n));
        System.out.println("Jumlah deret 1 hingga " + n + " (Iteratif): " + jumlahDeretIteratif(n));
    }
}