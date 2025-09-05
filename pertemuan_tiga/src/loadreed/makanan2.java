/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loadreed;

/**
 *
 * @author Ridho
 */
public class makanan2 extends Makanan {

    public makanan2(String nama, String jenis) {
        super(nama, jenis);
    }

    public static void main(String[] args) {

        makanan2 chef = new makanan2("Nasi Goreng", "Makan Karbohidrat") {

            void infoMakanan() {
                System.out.println("mencari " + nama + "karena termasuk " + jenis);
            }
        };
        chef.infoMakanan();

        System.out.println();

        chef.deskripsi("gurih");
        chef.deskripsi(7.6);
        chef.deskripsi("surabaya", 15000);
    }

}
