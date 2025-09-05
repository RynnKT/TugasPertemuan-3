/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author Ridho
 */
public class ibu implements Mengajar,Hobi,iburumahtangga  {
    //Mengajar
    public void menilai() {
        System.out.println("menilai tugas");
    }public void meluluskan() {
        System.out.println("meluluskan murid");
    }public void menulis() {
        System.out.println("menulis tugas");
    }
    //Hobi
    public void menyiram() {
        System.out.println("menyiram tanaman");
    }public void membaca() {
        System.out.println("membaca baku");
    }public void bernyanyi() {
        System.out.println("bernyanyi didapur");
    }
    //iburumahtangga
    public void menyapu() {
        System.out.println("menyapu lorong");
    }public void mencuci() {
        System.out.println("mencuci piring");
    }public void memasak() {
        System.out.println("memasak ikan");
    }
    
    public static void main(String[] args) {
        ibu orang = new ibu();
        System.out.println("--Mengajar--");
        orang.menilai();
        orang.meluluskan();
        orang.menulis();
        System.out.println("--Hobi--");
        orang.menyiram();
        orang.membaca();
        orang.bernyanyi();
        System.out.println("--Ibu Rumah Tangga--");
        orang.menyapu();
        orang.mencuci();
        orang.memasak();
    }
}
