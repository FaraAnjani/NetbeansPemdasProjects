package NetbeansPemdasProjects;

public class DiagonalUtama {
    
    public static void main(String[] args) {
        int[][] matriks = {
            {5, 2, 3},
            {4, 10, 6},
            {7, 8, 15}
        };

        int jumlahDiagonal = 0;

        System.out.println("Matriks Persegi:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
                
                // Diagonal utama terjadi ketika indeks baris sama dengan indeks kolom (i == j)
                if (i == j) {
                    jumlahDiagonal += matriks[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("\nJumlah elemen diagonal utama adalah: " + jumlahDiagonal);
    }
}

