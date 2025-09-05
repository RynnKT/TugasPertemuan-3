/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak_;

/**
 *
 * @author Ridho
 */
public abstract class Sportbike extends Motor {

    protected String tipe;

    public Sportbike(String nama, int kecepatan, int jumlahRoda, String tipe) {
        super(nama, kecepatan, jumlahRoda);
        this.tipe = tipe;
    }

    public abstract void fitur();
}
