package NetbeansPemdasProjects;

public class NilaiTerbesarMatriks {
    
    public static void main(String[] args) {
        int[][] matriks = {
            {12, 45, 23},
            {67, 34, 89},
            {21, 56, 43}
        };

        int maks = matriks[0][0];
        int barisMaks = 0;
        int kolomMaks = 0;

        // Menampilkan matriks terlebih dahulu
        System.out.println("Isi Matriks:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
                
                // Pengecekan nilai terbesar
                if (matriks[i][j] > maks) {
                    maks = matriks[i][j];
                    barisMaks = i;
                    kolomMaks = j;
                }
            }
            System.out.println();
        }

        System.out.println("\nNilai terbesar adalah: " + maks);
        System.out.println("Berada pada Baris ke-" + (barisMaks + 1) + " dan Kolom ke-" + (kolomMaks + 1) + 
                           " (Indeks [" + barisMaks + "][" + kolomMaks + "])");
    }
}
