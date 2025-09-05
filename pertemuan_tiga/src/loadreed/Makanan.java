/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loadreed;

/**
 *
 * @author Ridho
 */
public class Makanan {
    String nama;
    String jenis;

    public Makanan(String nama, String jenis) {
        this.nama = nama;
        this.jenis = jenis;
    }

    void infoMakanan() {
        System.out.println("Saya suka makanan" + nama + "karena" + jenis);
    }

    // Overload method deskripsi
    void deskripsi(String rasa) {
        System.out.println(nama + " memiliki rasa " + rasa);
    }

    void deskripsi(double kalori) {
        System.out.println(nama + " mengandung sekitar " + kalori + " kkal");
    }

    void deskripsi(String asal, int harga) {
        System.out.println(nama + " berasal dari " + asal + " dengan harga sekitar Rp" + harga);
    }
}


