/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No_4_Ganjil_LimasSegiEmpat;

/**
 *
 * @author DELLA
 */

class LimasSegiEmpat {
    double luasAlas;
    double luasSelubungLimas;
    double tinggi;

    public LimasSegiEmpat() {
        this.luasAlas = 0;
        this.luasSelubungLimas = 0;
        this.tinggi = 0;
    }

    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    public double getVolume() {
        return (luasAlas * tinggi) / 3;
    }

    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}

public class Main {
    public static void main(String[] args) {
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        printHasil(limas1);
        printHasil(limas2);
        printHasil(limas3);
    }
    
    public static void printHasil(LimasSegiEmpat limas) {
        System.out.println("Limas segi empat dengan luas alas : " + limas.luasAlas +
                ", luas selubung limas : " + limas.luasSelubungLimas +
                " dan tinggi : " + limas.tinggi +
                ". Luasnya : " + limas.getLuas() +
                ", sedangkan volumenya : " + limas.getVolume());
    }
}
