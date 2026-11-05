package netbeanspemdasprojects;
public class MethodKonversiBiner {
    public static void cetakBiner(int n) {
        if (n > 0) {
            cetakBiner(n / 2); // Cetak hasil rekursi untuk n / 2 terlebih dahulu
            System.out.print(n % 2); // Cetak sisa bagi (n % 2)
        }
    }

    public static void main(String[] args) {
        int angka = 10;
        System.out.print("Representasi biner dari " + angka + " adalah: ");
        cetakBiner(angka);
        System.out.println();
    }
}