package NetbeansPemdasProjects;
/**
 *
 * @author FARA ANJANI
 */
import java.util.Scanner;
public class Tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jeniskendaraan;
        double jenisparkir;
        double lamaparkir;
        double tarifparkir;
        double tariftambahan;
        double totalbiaya;
        
        
        System.out.print("Jenis kendaraan");
        jeniskendaraan = input.next();
        
        System.out.print("Lama waktu parkir (jam)");
        lamaparkir = input.nextDouble();
        
        if (jeniskendaraan.equals("Motor")){
            tarifparkir=2000;
            tariftambahan=1000;
            totalbiaya=lamaparkir*tarifparkir+tariftambahan;
            System.out.print("Total biaya parkir motor adalah : Rp " + totalbiaya);}
        else{
            tarifparkir=5000;
            tariftambahan=2000;
            totalbiaya=lamaparkir*tariftambahan+tarifparkir;
            System.out.print("Total biaya parkir mobil adalah : Rp " + totalbiaya);}

    }
    
}
