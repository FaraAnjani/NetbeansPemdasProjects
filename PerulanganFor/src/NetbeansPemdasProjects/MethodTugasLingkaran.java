package netbeanspemdasprojects;
    public class MethodTugasLingkaran {
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        double r1 = 7.0;
        double r2 = 14.0;
        double r3 = 21.0;

        System.out.println("Luas lingkaran dengan jari-jari " + r1 + " adalah " + luasLingkaran(r1));
        System.out.println("Luas lingkaran dengan jari-jari " + r2 + " adalah " + luasLingkaran(r2));
        System.out.println("Luas lingkaran dengan jari-jari " + r3 + " adalah " + luasLingkaran(r3));
    }
}