package netbeanspemdasprojects;
public class MethodRataRataOverload {
    // Overload untuk 2 bilangan double
    public static double rataRata(double a, double b) {
        return (a + b) / 2.0;
    }

    // Overload untuk 3 bilangan double
    public static double rataRata(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        System.out.println("Rata-rata 2 angka (75.5, 85.0): " + rataRata(75.5, 85.0));
        System.out.println("Rata-rata 3 angka (80.0, 90.5, 70.0): " + rataRata(80.0, 90.5, 70.0));
    }
}