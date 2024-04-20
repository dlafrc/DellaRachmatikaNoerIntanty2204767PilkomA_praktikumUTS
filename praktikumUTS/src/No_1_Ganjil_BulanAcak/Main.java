/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_1_Ganjil_BulanAcak;

/**
 *
 * @author DELLA
 */
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        Random random = new Random();

        int nomorBulan = random.nextInt(12) + 1;

        System.out.println("Bulan " + namaBulan[nomorBulan - 1] 
                + " adalah bulan ke-" + nomorBulan);
    }
}
