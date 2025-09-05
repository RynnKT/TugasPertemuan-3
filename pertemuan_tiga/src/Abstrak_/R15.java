/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak_;

/**
 *
 * @author Ridho
 */
public class R15 extends Sportbike {

    public R15(String nama, int kecepatan, int jumlahRoda, String tipe) {
        super(nama, kecepatan, jumlahRoda, tipe);
    }

    @Override
    public void bergerak() {
        System.out.println("Motor tipe " + tipe + " melaju dengan kecepatan " + kecepatan + " km/jam.");
    }

    @Override
    public void infoMotor() {
        System.out.println("Motor " + nama + " memiliki " + jumlahRoda + " roda.");
    }

    @Override
    public void fitur() {
        System.out.println("Motor tipe " + tipe + " Fairing Aerodinamis.");
    }

    public static void main(String[] args) {
        R15 motor = new R15("Yamaha R15", 120, 2, "Sportbike");

        motor.bergerak();
        motor.infoMotor();
        motor.fitur();
    }
}
