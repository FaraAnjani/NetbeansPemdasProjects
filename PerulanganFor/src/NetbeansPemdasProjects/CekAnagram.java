package NetbeansPemdasProjects;

import java.util.Arrays;

public class CekAnagram {
    public static boolean apakahAnagram(String kata1, String kata2) {
        // Hilangkan spasi dan ubah ke huruf kecil
        char[] arr1 = kata1.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] arr2 = kata2.replaceAll("\\s+", "").toLowerCase().toCharArray();

        // Jika panjangnya berbeda, bukan anagram
        if (arr1.length != arr2.length) {
            return false;
        }

        // Urutkan karakter lalu bandingkan
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String kata1 = "listen";
        String kata2 = "silent";

        boolean hasil = apakahAnagram(kata1, kata2);
        System.out.println("Kata 1: " + kata1);
        System.out.println("Kata 2: " + kata2);
        System.out.println("Apakah anagram? " + (hasil ? "Ya" : "Tidak"));
    }
}

