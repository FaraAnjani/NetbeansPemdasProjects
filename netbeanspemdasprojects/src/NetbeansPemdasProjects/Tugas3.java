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
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String word;
        double angkarahasia=48;
        double percobaan=1;
        double tebakan;
        
        System.out.print("Selamat datang di permainan tebak angka, "
                + "saya akan memberi tahu bagaimana cara bermainnya "
                + "Anda mempunyai 7x percobaan, saya memilih angka dan anda "
                + "yang menebak.");
        System.out.print("Silahkan masukkan angka pilihanmu!");
        tebakan = input.nextDouble();
        
        while (percobaan<=6){
            if (tebakan==48){
                System.out.print("Selamat! Tebakan kamu benar.");
                break;
            }else if(tebakan>48){
                System.out.print("Wow angka terlalu besar! Ayo coba lagi");
                tebakan=input.nextDouble();
                percobaan = percobaan+1;
            }else{
                System.out.print("Yah angka terlalu kecil. Silahkan coba lagi!");
                tebakan=input.nextDouble();
                percobaan = percobaan+1;
            }
        }
        if (percobaan > 7 && tebakan !=48){
            System.out.print("Maaf kesempatanmu telah habis:( ");
        }
                
        // TODO code application logic here
    }
  
}

