package netbeanspemdasprojects;
public class MethodPangkatRekursif {
    public static int pangkat(int basis, int eksponen) {
        // Base case: jika eksponen 0, hasilnya 1
        if (eksponen == 0) {
            return 1;
        }
        // Rekurens: basis * pangkat(basis, eksponen - 1)
        return basis * pangkat(basis, eksponen - 1);
    }

    public static void main(String[] args) {
        int basis = 4;
        int eksponen = 4;
        System.out.println(basis + " pangkat " + eksponen + " = " + pangkat(basis, eksponen));
    }
}