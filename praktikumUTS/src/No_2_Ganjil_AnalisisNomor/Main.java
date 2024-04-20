/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_2_Ganjil_AnalisisNomor;

/**
 *
 * @author DELLA
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveCount = 0;
        int negativeCount = 0;
        double total = 0.0;
        int count = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");
        
        int num = scanner.nextInt();
        while (num != 0) {
            if (num > 0) {
                positiveCount++;
                total += num;
                count++;
            } else if (num < 0) {
                negativeCount++;
                total += num;
                count++;
            }
            num = scanner.nextInt();
        }
        
        scanner.close();

        if (count == 0) {
            System.out.println("Tidak ada nilai yang dimasukkan kecuali nol.");
        } else {
            double average = total / count;
            System.out.println("Jumlah bilangan positif adalah " + positiveCount);
            System.out.println("Jumlah bilangan negatif adalah " + negativeCount);
            System.out.println("Nilai total adalah " + total);
            System.out.println("Nilai rata-rata adalah " + average);
        }
    }
}
