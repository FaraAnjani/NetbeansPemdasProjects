package NetbeansPemdasProjects;

public class TransposeMatriks {
    
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks Asli (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nHasil Transpose Matriks:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Menukar posisi indeks baris dan kolom [j][i]
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}

