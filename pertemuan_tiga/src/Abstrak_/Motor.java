/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak_;

/**
 *
 * @author Ridho
 */
public abstract class Motor extends Kendaraan {

    protected int jumlahRoda;

    public Motor(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }

    public abstract void infoMotor();
}
