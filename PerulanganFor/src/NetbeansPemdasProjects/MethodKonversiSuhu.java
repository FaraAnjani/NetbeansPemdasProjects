package netbeanspemdasprojects;
import java.util.Scanner;

public class MethodKonversiSuhu {
    public static double konversiCelsiusKeFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double konversiFahrenheitKeCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih arah konversi:");
        System.out.println("1. Celsius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celsius");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            System.out.print("Masukkan suhu dalam Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Hasil: " + konversiCelsiusKeFahrenheit(c) + " °F");
        } else if (pilihan == 2) {
            System.out.print("Masukkan suhu dalam Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Hasil: " + konversiFahrenheitKeCelsius(f) + " °C");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}