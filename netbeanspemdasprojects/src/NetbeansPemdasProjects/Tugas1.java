/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NetbeansPemdasProjects;

/**
 *
 * @author FARA ANJANI
 */
import java.util.Scanner;
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double harta;
        double nisab;
        double zakat;
        
        System.out.print("Masukkan total harta");
        harta = input.nextDouble();
            
        System.out.print("Masukkan nilai nisab");
        nisab = input.nextDouble();
        
        if (harta>=nisab){
            zakat = harta * 0.025;
            System.out.print("Total zakat yang harus dibayarkan adalah : Rp" + zakat);}
        else {
            System.out.print("Harta belum mencapai nisab dan tidak diwajibkan berzakat");}

    }
    
}
